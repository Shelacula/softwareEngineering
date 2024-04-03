

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface FileManagerAPI{
  ArrayList<Integer> read(IInput read) throws FileNotFoundException, IOException;
  WriteReturn write(IOutput write, String computed) throws IOException;
  WriteReturn write(IOutput write, String computed, String delim) throws IOException;
}
