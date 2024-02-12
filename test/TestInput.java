package test;
import java.util.ArrayList;
import java.util.List;

import src.IInput;

public class TestInput implements IInput {
  public List<Integer> input = new ArrayList<Integer>();
  public TestInput(){
  };
  public void addInt(Integer a){
    this.input.add(a);
  }
  public List<Integer> getValue(){
    return input;
  } 
}
