package test;
import java.util.ArrayList;
import java.util.List;

import src.IInput;

public class TestInput implements IInput {
  static List<Integer> input = new ArrayList<Integer>();
  public TestInput(){
  };
  public List<Integer> getValue(){
    return input;
  } 
}
