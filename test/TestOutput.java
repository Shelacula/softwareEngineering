package test;
import src.IOutput;
import java.util.List;
import java.util.ArrayList;

public class TestOutput implements IOutput {
  static List<String> output = new ArrayList<String>();
  public TestOutput(){
  };
  public List<String> getValue(){
    return output;
  }
}
