
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

public class FileManagerTest {

  @Test
  public void testFileManager() throws IOException{
    //create a fake engine object
    Engine testEngine = Mockito.mock(Engine.class);
    TestInput fakeInput = new TestInput();
    TestOutput fakeOutput = new TestOutput();
    
    //define its behavior with mockito
    when(testEngine.compute(any(Integer.class))).thenReturn("This is a return value from the test.");
    
    InMemoryFileManager testFile = new InMemoryFileManager();


    //test it?
    testFile.read(fakeInput);
    testFile.write(fakeOutput, new String(""));
    testEngine.compute(Integer.valueOf(1));
  }
}
