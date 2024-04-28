
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class EngineOptimizationTest {

  @Test
  public void integrationTest() throws IOException, ExecutionException{
    EngineOpt testEngine = new EngineOpt();
    FileManager testFile = new FileManager();
    UserStart testUser = new UserStart(testFile, testEngine);

    IInput testInput = new Input("test/testInputFile.test");
    IOutput testOutput = new Output("test/testOutputFile2.test");

    testUser.startComputationJob(testInput, testOutput);

  }
}
