package test;
import src.InputReturn;
import src.DelimitReturn;
import src.Storage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class testStorage{
  @Test
  public void dataStorageTest(){
    Storage testStore = Mockito.mock(Storage.class);

    InputReturn inputTest = testStore.input(new String(), new String());
    DelimitReturn delimTest = testStore.delim(new String());
    
    testStore.startComputationJob(inputTest, delimTest);
  }
}
