package test;
import src.DelimitReturn;
import src.FileManager;
import src.InputReturn;
import src.ReadReturn;
import src.Storage;
import src.Engine;
import src.ComputeResponse;
import src.WriteReturn;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.File;

public class TestFileManager{
  @Test
  public WriteReturn fileManagerTest(){
    FileManager testFile = Mockito.mock(FileManager.class);
    Engine testEngine = Mockito.mock(Engine.class);

    ReadReturn readTest = testFile.read(new File(""));
    ComputeResponse engineTest = testEngine.compute(readTest.parsed());
    WriteReturn writeTest = testFile.write(new File(""), engineTest);
    return writeTest;
  }
}
