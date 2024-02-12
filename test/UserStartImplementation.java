package test;
import org.junit.Test;

import src.Engine;
import src.FileManager;

public class UserStartImplementation {

  @Test
  public void implementationTest(){
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
    Integer[] arr = testManager.read(testinput);

    //iterate through the input and compute/write each value 
    for(int i=0;i<arr.length;i++){
      String result = testEngine.compute(arr[i]);
      testManager.write(output, result);
    }

    System.out.println(output.getValue());
    
  }
}
