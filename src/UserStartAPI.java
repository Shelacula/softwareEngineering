package src;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface UserStartAPI{
  //pass user info to the computing engine via parameters
  void startComputationJob(IInput input, IOutput output, String delimit) throws FileNotFoundException, IOException;

  //overload method to use default delimiter
  void startComputationJob(IInput uinput, IOutput output) throws FileNotFoundException, IOException;

  //methods to collect user data
  IInput input(String string);
  IOutput output(String string);
  String getDelim(String string);
}
