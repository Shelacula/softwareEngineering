import src.ComputeResponse;
import src.FileManagerAPI;
import src.EngineAPI;
import src.ReadReturn;
import src.WriteReturn;
import java.io.File;

public class FileManagerTest implements FileManagerAPI{

  EngineAPI testEngine;

  @Override
  public ReadReturn read(File file) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'read'");
  }

  @Override
  public WriteReturn write(File file, ComputeResponse computed) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'write'");
  }
}
