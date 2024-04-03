
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
    throw new UnsupportedOperationException("Unimplemented method 'getPath'");
  }
}
