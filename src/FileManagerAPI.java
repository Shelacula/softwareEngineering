package src;
public interface FileManagerAPI{
  Integer[] read(IInput read);
  IWriteReturn write(IOutput write, String computed);
  IWriteReturn write(IOutput write, String computed, String delim);
}
