package src;

public class FileManager implements FileManagerAPI{

  EngineAPI testEngine;

  public FileManager(EngineAPI testEngine){
    this.testEngine = testEngine;
  }

  @Override
  public Integer[] read(IInput read) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'read'");
  }

  @Override
  public IWriteReturn write(IOutput write, String computed) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'write'");
  }
}
