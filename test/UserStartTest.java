package test;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import src.FileManager;
import src.UserStart;
import src.Engine;
import src.IInput;


public class UserStartTest {
  @Test
  public void testUserStart() {
    //create a fake mock FileManager
    FileManager fakeFile = Mockito.mock(FileManager.class);
    Engine fakeEngine = Mockito.mock(Engine.class);

    Integer[] testArr = {Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6)};

    when(fakeFile.read(any(IInput.class))).thenReturn(testArr);


    TestInput fakeInput = new TestInput();
    TestOutput fakeOutput = new TestOutput();
    String fakeDelimit = "";


    UserStart testUser = new UserStart(fakeFile, fakeEngine);

    testUser.startComputationJob(fakeInput, fakeOutput, fakeDelimit);
  }
}
