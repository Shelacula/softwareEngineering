package test;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.FileManager;
import src.UserStart;
import src.Engine;
import src.IInput;


public class UserStartTest {
  @Test
  public void testUserStart() throws IOException {
    //create a fake mock FileManager
    FileManager fakeFile = Mockito.mock(FileManager.class);
    Engine fakeEngine = Mockito.mock(Engine.class);

    ArrayList<Integer> testArr = new ArrayList<Integer>();

    when(fakeFile.read(any(IInput.class))).thenReturn(testArr);


    TestInput fakeInput = new TestInput();
    TestOutput fakeOutput = new TestOutput();
    String fakeDelimit = "";


    UserStart testUser = new UserStart(fakeFile, fakeEngine);

    testUser.startComputationJob(fakeInput, fakeOutput, fakeDelimit);
  }
}
