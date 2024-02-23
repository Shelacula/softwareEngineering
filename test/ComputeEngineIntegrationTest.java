package test;
import src.UserStart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.Engine;
import src.FileManager;

public class ComputeEngineIntegrationTest {

  @Test
  public void integrationTest() throws IOException{
    Engine testEngine = new Engine();
    FileManager testFile = new InMemoryFileManager();
    UserStart testUser = new UserStart(testFile, testEngine);

    TestInput testInput = new TestInput();
    TestOutput testOutput = new TestOutput();

    testInput.addInt(1);
    testInput.addInt(10);
    testInput.addInt(25);

    testUser.startComputationJob(testInput, testOutput);
    

    List<String> result = testOutput.getArray();

    List<String> compare = new ArrayList<String>();
    compare.add("1");
    compare.add("11");
    compare.add("68");

    System.out.println(result.get(1));

    assert result.equals(compare); 

  }
}
