
import java.io.IOException;
import java.util.ArrayList;


public class InMemoryFileManager implements FileManagerAPI{

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
