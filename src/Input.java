package src;

import java.util.ArrayList;

public class Input implements IInput {
  String filePath = "";

  public Input(){
  };
  
  public Input(String filePath){
    this.filePath = filePath;
  }

  @Override
  public String getPath() {
    return filePath;
  }

  @Override
  public ArrayList<Integer> getArray() {
    throw new UnsupportedOperationException("Unimplemented method 'getArray'");
  }
}
