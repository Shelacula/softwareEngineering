package test;
import java.util.List;

import src.FileManagerAPI;
import src.IInput;
import src.IOutput;
import src.IWriteReturn;
import src.WriteReturn;

public class InMemoryFileManager implements FileManagerAPI{

  @Override
  public Integer[] read(IInput read) {
    TestInput readIn = (TestInput) read;
    List<Integer> list = readIn.getValue();
    Integer[] array = list.toArray(new Integer[0]);
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
