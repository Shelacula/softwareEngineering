package test;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import src.Engine;
import src.FileManager;

public class UserStartImplementation {

  @Test
  public void implementationTest() throws IOException{
    //create components
    Engine testEngine = new Engine();
    FileManager testManager = new InMemoryFileManager();

    //create inmemory input/output
    TestInput testinput = new TestInput();
    TestOutput output = new TestOutput(); 

    //add some values to the test input List
    testinput.addInt(1);
    testinput.addInt(10);
    testinput.addInt(25);

    //read the input 
    ArrayList<Integer> arr = testManager.read(testinput);

    //iterate through the input and compute/write each value 
    for(int i=0;i<arr.size();i++){
      String result = testEngine.compute(arr.get(i));
      testManager.write(output, result);
    }
    
  }
}
