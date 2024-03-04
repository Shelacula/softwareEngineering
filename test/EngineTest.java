package test;
import org.junit.jupiter.api.Test;

import src.Engine;

public class EngineTest {

  @Test
  public void computeTest(){
    Engine testEngine = new Engine();

    testEngine.compute(10);
  }
}
