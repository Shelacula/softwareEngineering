package test;
import org.junit.Test;
import org.mockito.Mockito;

import src.*;

public class UserStartTest {
  @Test
  public void testUserStart() {
    //create a fake mock FileManager
    FileManager fakeFile = Mockito.mock(FileManager.class);

    TestInput fakeInput = new TestInput();
    TestOutput fakeOutput = new TestOutput();
    String fakeDelimit = "";

    UserStart testUser = new UserStart(fakeFile);

    testUser.startComputationJob(fakeInput, fakeOutput, fakeDelimit);
  }
}
