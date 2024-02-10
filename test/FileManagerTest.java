package test;
import src.*;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import src.*;


public class FileManagerTest {

  @Test
  public void testFileManager(){
    //create a fake engine object
    Engine testEngine = Mockito.mock(Engine.class);
    TestInput fakeInput = new TestInput();
    TestOutput fakeOutput = new TestOutput();
    
    //define its behavior with mockito
    when(testEngine.compute(any(Integer.class))).thenReturn("This is a return value from the test.");
    
    //create a new instance of filemanager using the fake engine as a dependency
    FileManager testFile = new FileManager(testEngine);

    //test it?
    testFile.read(fakeInput);
    testFile.write(fakeOutput, new String(""));
    verify(testEngine).compute(any(Integer.class));
  }
}
