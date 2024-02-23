package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserStart implements UserStartAPI{
  
  FileManagerAPI fileManager;
  EngineAPI engine;


  //constructor for UserStart. It requires a reference to a FileManager.
  public UserStart(FileManagerAPI fileManager, EngineAPI engine){
    this.fileManager = fileManager;
    this.engine = engine;
  }

  @Override
  public void startComputationJob(IInput input, IOutput output, String delimit) throws IOException {
    ArrayList<Integer> inputArr = fileManager.read(input);
    for(int i=0;i<inputArr.size();i++){
      String result = engine.compute(inputArr.get(i).intValue());
      fileManager.write(output, result, delimit);
    }
  }

  @Override
  public void startComputationJob(IInput input, IOutput output) throws IOException{
    ArrayList<Integer> inputArr = fileManager.read(input);
    for(int i=0;i<inputArr.size();i++){
      String result = engine.compute(inputArr.get(i).intValue());
      System.out.println(result);
      fileManager.write(output, result);
    }
  }

  @Override
  public String getDelim(String delim) {
    // Take in a user specified delimiter character/string
    return delim;
  }

  @Override
  public IInput input(String input) {
   // create a new Input file from a user specified path
    return new Input(input);
  }

  @Override
  public IOutput output(String output) {
    // create a new Output file from user specified path
    return new Output(output);
  }
}
