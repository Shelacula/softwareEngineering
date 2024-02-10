package src;

public class Storage implements StorageAPI{
  
  FileManagerAPI testFile;

  @Override
  public JobResponse startComputationJob(InputReturn input, DelimitReturn delimit) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'startComputationJob'");
  }

  @Override
  public InputReturn input(Input inputLocation, Output outputLocation) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'input'");
  }

  @Override
  public DelimitReturn delim(String delim) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delim'");
  }

  @Override
  public DelimitReturn delim() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delim'");
  }

}
