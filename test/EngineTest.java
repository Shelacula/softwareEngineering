package test;
import org.junit.Test;
import org.mockito.Mockito;

import src.FileManager;
import src.Engine;

public class EngineTest {

  @Test
  public void computeTest(){
    FileManager testFileManager = Mockito.mock(FileManager.class);
    Engine testEngine = new Engine(testFileManager);

    String result = testEngine.compute(10);
    System.out.println(result);
    testEngine.fileManager.write(new TestOutput(), result);
  }
}
