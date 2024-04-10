import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import io.grpc.Channel;
import io.grpc.StatusRuntimeException;

public class FileManagerClient implements FileManagerAPI { 
	 private final FMServiceGrpc.FMServiceBlockingStub blockingStub;

	  public FileManagerClient(Channel channel) {
	    blockingStub = FMServiceGrpc.newBlockingStub(channel);
	  }

      @Override
      public ArrayList<Integer> read(IInput read) throws FileNotFoundException, IOException {
        String filePath = read.getPath();
        FileRequest.FMRequest request = FileRequest.FMRequest.newBuilder().setInput(filePath).build();
	      FileRequest.ReadResponse response;
	    try {
	      response = blockingStub.fileManagerRead(request);
          ArrayList<Integer> finalArr = new ArrayList<Integer>(response.getReturnArrList());
          return finalArr;
	    } catch (StatusRuntimeException e) {
            throw new UnsupportedOperationException("Error! : " + e);
	    }
      }
  
      @Override
      public WriteReturn write(IOutput write, String computed) throws IOException {
        String filePath = write.getPath();
        FileRequest.FMRequest request = FileRequest.FMRequest.newBuilder().setOutput(filePath).setComputed(computed).build();
	      FileRequest.WriteResponse response;
	    try {
	      response = blockingStub.fileManagerWrite(request);
          return new WriteReturn(true);
	    } catch (StatusRuntimeException e) {
          return new WriteReturn(false);
	    }
      }
}
