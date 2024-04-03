
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UserStart implements UserStartAPI{
  
  FileManagerAPI fileManager;
  EngineAPI engine;

  ExecutorService executor = Executors.newFixedThreadPool(20);


  //constructor for UserStart. It requires a reference to a FileManager.
  public UserStart(FileManagerAPI fileManager, EngineAPI engine){
    this.fileManager = fileManager;
    this.engine = engine;
  }

  @Override
  public void startComputationJob(IInput input, IOutput output, String delimit) throws IOException, java.util.concurrent.ExecutionException {
    ArrayList<Integer> inputArr = fileManager.read(input);
    ArrayList<Future<String>> futures = new ArrayList<>();
    for(int i=0;i<inputArr.size();i++){
      int inputNumber = inputArr.get(i).intValue();
      Future<String> resultString = executor.submit(new ComputeTask(engine, inputNumber));
      futures.add(resultString);
    }
    for (Future<String> future : futures) {
      try {
          String result = future.get();
          fileManager.write(output, result, delimit);
      } catch (InterruptedException | ExecutionException e) {
          e.printStackTrace();
      }
  }
  }

  @Override
  public void startComputationJob(IInput input, IOutput output) throws IOException, java.util.concurrent.ExecutionException{
    ArrayList<Integer> inputArr = fileManager.read(input);
    ArrayList<Future<String>> futures = new ArrayList<>();
    for(int i=0;i<inputArr.size();i++){
      int inputNumber = inputArr.get(i).intValue();
      Future<String> resultString = executor.submit(new ComputeTask(engine, inputNumber));
      futures.add(resultString);
    }
    for (Future<String> future : futures) {
      try {
          String result = future.get();
          fileManager.write(output, result);
      } catch (InterruptedException | ExecutionException e) {
          e.printStackTrace();
      }
  }
  }

  static class ComputeTask implements Callable<String> {
    private final EngineAPI engine;
    private final int inputValue;
  
    public ComputeTask(EngineAPI engine2, int inputValue) {
        this.engine = engine2;
        this.inputValue = inputValue;
    }
  
    @Override
    public String call() {
        System.out.print(" THIS IS A THREAD ");
        return engine.compute(inputValue);
    }
  }

}