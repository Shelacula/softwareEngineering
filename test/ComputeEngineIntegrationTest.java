package test;
import src.UserStart;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.Engine;
import src.FileManager;

public class ComputeEngineIntegrationTest {

  @Test
  public void integrationTest(){
    Engine testEngine = new Engine();
    FileManager testFile = new InMemoryFileManager();
    UserStart testUser = new UserStart(testFile, testEngine);

    TestInput testInput = new TestInput();
    TestOutput testOutput = new TestOutput();

    testUser.startComputationJob(testInput, testOutput);

    List<String> result = testOutput.getValue();

    List<String> compare = new ArrayList<String>();
    compare.add("4563");
    compare.add("321335886");
    compare.add("100870228329");

    assert result == compare; 

  }
}
