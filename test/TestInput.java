
import java.util.ArrayList;


public class TestInput implements IInput {

  public ArrayList<Integer> input = new ArrayList<Integer>();
  public TestInput(){
  };
  public void addInt(Integer a){
    this.input.add(a);
  }

  @Override
  public String getPath() {
    throw new UnsupportedOperationException("Unimplemented method 'getPath'");
  }
  @Override
  public ArrayList<Integer> getArray() {
    return input;
  } 
}
