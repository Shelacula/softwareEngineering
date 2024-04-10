import java.util.ArrayList;

import io.grpc.stub.StreamObserver;

public class FMServiceImpl extends FMServiceGrpc.FMServiceImplBase {
    public void fileManagerRead(FileRequest.FMRequest request, StreamObserver<FileRequest.ReadResponse> responseObserver) {
      FileRequest.ReadResponse response;
      FileManager fileManager = new FileManager();

      try {
        String inputPath = request.getInput();
        Input inputWrapper = new Input(inputPath);
        ArrayList<Integer> result = fileManager.read(inputWrapper);

        System.out.println("Reading in a file.");

        response = FileRequest.ReadResponse.newBuilder()
        .addAllReturnArr(result)
        .build();
      } catch (Exception e) {
        response = FileRequest.ReadResponse.newBuilder()
                .build();
      }

      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }

    public void fileManagerWrite(FileRequest.FMRequest request, StreamObserver<FileRequest.WriteResponse> responseObserver) {
      FileRequest.WriteResponse response;
      FileManager fileManager = new FileManager();

      try {
        String outputPath = request.getOutput();
        String computed = request.getComputed();
        Output outputWrapper = new Output(outputPath);

        System.out.println("Writing file.");
        
        fileManager.write(outputWrapper, computed);

        response = FileRequest.WriteResponse.newBuilder()
        .setResponse("Success!")
        .build();
      } catch (Exception e) {
        response = FileRequest.WriteResponse.newBuilder()
                .setResponse("Failed: " + e)
                .build();
      }

      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
}
