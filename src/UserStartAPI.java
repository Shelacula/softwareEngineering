package src;

public interface UserStartAPI{
  //pass user info to the computing engine via parameters
  void startComputationJob(IInput input, IOutput output, String delimit);

  //overload method to use default delimiter
  void startComputationJob(IInput uinput, IOutput output);

  //methods to collect user data
  IInput input(String string);
  IOutput output(String string);
  String getDelim(String string);
}
