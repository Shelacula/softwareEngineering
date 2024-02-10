package test;
import src.InputReturn;
import src.DelimitReturn;
import src.Storage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestStorage{
  @Test
  public void dataStorageTest(){
    Storage testStore = Mockito.mock(Storage.class);

    TestInput testInput = new TestInput();
    TestOutput testOutput = new TestOutput();

    InputReturn inputTest = testStore.input(testInput, testOutput);
    DelimitReturn delimTest = testStore.delim(new String());
    
    testStore.startComputationJob(inputTest, delimTest);
  }
}
