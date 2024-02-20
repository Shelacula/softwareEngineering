package src;

public class Output implements IOutput{
  String outputPath = "";
  public Output(){};
  public Output(String outputPath){
    this.outputPath = outputPath;
  }
}
