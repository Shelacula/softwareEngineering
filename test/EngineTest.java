package test;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import src.*;

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
