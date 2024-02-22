package test;
import java.util.ArrayList;
import java.util.List;

import src.FileManagerAPI;

import src.EngineAPI;
import src.FileManager;

import src.IInput;
import src.IOutput;
import src.IWriteReturn;
import src.WriteReturn;

public class InMemoryFileManager extends FileManager{

  public InMemoryFileManager() {
    super();
  }


  @Override
  public ArrayList<Integer> read(IInput read) {
    TestInput readIn = (TestInput) read;
    List<Integer> list = readIn.getValue();
    ArrayList<Integer> array = new ArrayList<Integer>();
    return array;
  }

  @Override
  public IWriteReturn write(IOutput write, String computed) {
    TestOutput writeOut = (TestOutput) write;
    writeOut.getValue().add(computed);
    IWriteReturn state = new WriteReturn();
    return state;
  }
    
}
