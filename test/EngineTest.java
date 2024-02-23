package test;
import org.junit.Test;
import org.mockito.Mockito;

import src.FileManager;
import src.Engine;

public class EngineTest {

  @Test
  public void computeTest(){
    Engine testEngine = new Engine();

    String result = testEngine.compute(10);
  }
}
