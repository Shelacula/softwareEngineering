package src;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface FileManagerAPI{
  ArrayList<Integer> read(IInput read) throws FileNotFoundException;
  IWriteReturn write(IOutput write, String computed);
  IWriteReturn write(IOutput write, String computed, String delim);
}
