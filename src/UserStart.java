
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
<<<<<<< HEAD
    
=======

    //writer for the delimiter
    String outPath = output.getPath();
    File outputFile = new File(outPath);
    FileWriter fw = new FileWriter(outputFile, true);
    BufferedWriter out = new BufferedWriter(fw);

>>>>>>> 46c3f9974634c7abc3082380eb42c3e2a96c81d5
    for(int i=0;i<inputArr.size();i++){
      int inputNumber = inputArr.get(i).intValue();
      Future<String> resultString = executor.submit(new ComputeTask(engine, inputNumber));
      futures.add(resultString);
    }
    for (Future<String> future : futures) {
      try {
          String result = future.get();
<<<<<<< HEAD
          long start = System.currentTimeMillis();
          fileManager.write(output, result + delimit);
          long end = System.currentTimeMillis();
          System.out.println((end-start) + " milliseconds elapsed to write out " + result);
=======
          fileManager.write(output, result + delimit);
>>>>>>> 46c3f9974634c7abc3082380eb42c3e2a96c81d5
      } catch (InterruptedException | ExecutionException e) {
          e.printStackTrace();
      }
  }
    out.close();
  }
  

  @Override
  public void startComputationJob(IInput input, IOutput output) throws IOException, java.util.concurrent.ExecutionException{
    startComputationJob(input, output, ";");
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
        return engine.compute(inputValue);
    }
  }

}