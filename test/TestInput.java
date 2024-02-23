package test;
import java.util.ArrayList;
import java.util.List;

import src.IInput;

public class TestInput implements IInput {

  public ArrayList<Integer> input = new ArrayList<Integer>();
  public TestInput(){
  };
  public void addInt(Integer a){
    this.input.add(a);
  }

  @Override
  public String getPath() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPath'");
  }
  @Override
  public ArrayList<Integer> getArray() {
    return input;
  } 
}
