package test;
import org.junit.Test;
import org.mockito.Mockito;

import src.FileManager;
import src.UserStart;
import src.Engine;

public class UserStartTest {
  @Test
  public void testUserStart() {
    //create a fake mock FileManager
    FileManager fakeFile = Mockito.mock(FileManager.class);
    Engine fakeEngine = Mockito.mock(Engine.class);

    TestInput fakeInput = new TestInput();
    TestOutput fakeOutput = new TestOutput();
    String fakeDelimit = "";

    UserStart testUser = new UserStart(fakeFile, fakeEngine);

    testUser.startComputationJob(fakeInput, fakeOutput, fakeDelimit);
  }
}
