
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class ComputeEngineIntegrationTest {

  @Test
  public void integrationTest() throws IOException, ExecutionException{
    Engine testEngine = new Engine();
    InMemoryFileManager testFile = new InMemoryFileManager();
    UserStart testUser = new UserStart(testFile, testEngine);

    TestInput testInput = new TestInput();
    TestOutput testOutput = new TestOutput();

    testInput.addInt(1);
    testInput.addInt(10);
    testInput.addInt(25);

    testUser.startComputationJob(testInput, testOutput);
    

    ArrayList<String> result = testOutput.getArray();
    System.out.println(result);

    ArrayList<String> compare = new ArrayList<String>();
    compare.add("1");
    compare.add("11");
    compare.add("68");

    assert result.equals(compare); 

  }
}
