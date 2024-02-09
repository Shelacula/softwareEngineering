package test;
import src.Engine;
import src.ComputeResponse;
import src.InputReturn;
import src.DelimitReturn;
import src.Storage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

public class testEngine{
  @Test
  public void engineTest() {
    Engine testEngine = Mockito.mock(Engine.class);
    when(testEngine.compute(any(Integer.class)))
        .thenThrow(new RuntimeException("Engine Failure"));

    ComputeResponse testComputer = testEngine.compute(10);  
    System.out.print(testComputer);
  }
}
