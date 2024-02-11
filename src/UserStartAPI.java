package src;

public interface UserStartAPI{
  //pass user info to the computing engine via parameters
  String startComputationJob(IInput input, IOutput output, String delimit);

  //overload method to use default delimiter
  String startComputationJob(IInput uinput, IOutput output);

  //methods to collect user data
  IInput input();
  IOutput output();
  String getDelim();
}
