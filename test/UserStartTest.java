
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



public class UserStartTest {
  @Test
  public void testUserStart() throws IOException, ExecutionException {
    //create a fake mock FileManager
    FileManager fakeFile = Mockito.mock(FileManager.class);
    Engine fakeEngine = Mockito.mock(Engine.class);

    ArrayList<Integer> testArr = new ArrayList<Integer>();

    when(fakeFile.read(any(IInput.class))).thenReturn(testArr);


    TestInput fakeInput = new TestInput();
    Output fakeOutput = new Output("test/testOutputFile2.test");
    String fakeDelimit = "";


    UserStart testUser = new UserStart(fakeFile, fakeEngine);

    testUser.startComputationJob(fakeInput, fakeOutput, fakeDelimit);
  }
}
