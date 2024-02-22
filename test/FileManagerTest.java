package test;
import src.FileManager;
import src.Engine;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;

public class FileManagerTest {

  @Test
  public void testFileManager() throws FileNotFoundException{
    //create a fake engine object
    Engine testEngine = Mockito.mock(Engine.class);
    TestInput fakeInput = new TestInput();
    TestOutput fakeOutput = new TestOutput();
    
    //define its behavior with mockito
    when(testEngine.compute(any(Integer.class))).thenReturn("This is a return value from the test.");
    
    FileManager testFile = new FileManager();


    //test it?
    testFile.read(fakeInput);
    testFile.write(fakeOutput, new String(""));
    verify(testEngine).compute(any(Integer.class));
  }
}
