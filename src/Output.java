package src;

import java.util.ArrayList;

public class Output implements IOutput{
  String outputPath = "";
  public Output(){};
  public Output(String outputPath){
    this.outputPath = outputPath;
  }
  @Override
  public String getPath() {
    return outputPath;
  }
  @Override
  public ArrayList<String> getArray() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getArray'");
  }
}
