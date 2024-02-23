package test;
import src.IOutput;
import java.util.List;
import java.util.ArrayList;

public class TestOutput implements IOutput {
  ArrayList<String> output = new ArrayList<String>();
  public TestOutput(){
  };
  public ArrayList<String> getArray(){
    return output;
  }
  @Override
  public String getPath() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPath'");
  }
}
