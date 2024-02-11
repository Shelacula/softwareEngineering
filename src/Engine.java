package src;

public class Engine implements EngineAPI {

  public FileManagerAPI fileManager;

  //default constructor for Engine
  public Engine(FileManagerAPI fileManager){
    this.fileManager = fileManager;
  }

  @Override
  public String compute(int number) {
    throw new UnsupportedOperationException("Unimplemented method 'compute'");
  }
}