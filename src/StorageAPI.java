package src;
// public void dataStorageTest(Storage store){
//   InputReturn inputTest = store.input(new String());
//   DelimitReturn delimTest = store.delim(new String());
// }

public interface StorageAPI{
  JobResponse startComputationJob(InputReturn input, DelimitReturn delimit);
  InputReturn input(String inputLocation, String outputLocation);
  DelimitReturn delim(String delim);
  DelimitReturn delim();
}
