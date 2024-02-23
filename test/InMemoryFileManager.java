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
    return read.getArray();
  }

  @Override
  public WriteReturn write(IOutput write, String computed) {
    write.getArray().add(computed);
    WriteReturn state = new WriteReturn(true);
    return state;
  }
    
}
