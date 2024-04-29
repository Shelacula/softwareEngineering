import java.util.concurrent.TimeUnit;

import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

public class ComputeServiceImpl extends ComputeServiceGrpc.ComputeServiceImplBase {
    public void computeEngine(FilePaths.PathsRequest request, StreamObserver<FilePaths.ComputedResponse> responseObserver) {
      FilePaths.ComputedResponse response;

      String target = "localhost:50052"; 
      ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
                              .build();
      try {
        FileManagerClient fileManager = new FileManagerClient(channel);
        Engine testEngine = new Engine();
        UserStart coordinator = new UserStart(fileManager, testEngine);

        try {
          String inputPath = request.getInput();
          String outputPath = request.getOutput();
          String delimiter = request.getDelimit();
          Input inputWrapper = new Input(inputPath);
          Output outputWrapper = new Output(outputPath);
  
          coordinator.startComputationJob(inputWrapper, outputWrapper, delimiter);
          System.out.println("Inside ComputeServiceImpl");
          String result = "Success!";
          response = FilePaths.ComputedResponse.newBuilder()
          .setResponse(result)
          .build();
        } catch (Exception e) {
          response = FilePaths.ComputedResponse.newBuilder()
                  .setResponse("Failed: " + e)
                  .build();
        }
  
        responseObserver.onNext(response);
        responseObserver.onCompleted();


      } finally {
        try {
          channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
}
