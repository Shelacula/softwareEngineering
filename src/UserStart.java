package src;

public class UserStart implements UserStartAPI{
  
  FileManagerAPI testFile;

  //constructor for UserStart. It requires a reference to a FileManager.
  public UserStart(FileManagerAPI testFile){
    this.testFile = testFile;
  }

  @Override
  public String startComputationJob(IInput input, IOutput output, String delimit) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'startComputationJob'");
  }

  @Override
  public String getDelim() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getDelim'");
  }

  @Override
  public IInput input() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'input'");
  }

  @Override
  public IOutput output() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'output'");
  }

  @Override
  public String startComputationJob(IInput uinput, IOutput output) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'startComputationJob'");
  }


}
