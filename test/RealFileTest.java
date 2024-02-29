package test;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import src.Engine;
import src.FileManager;
import src.Input;
import src.Output;
import src.UserStart;

public class RealFileTest {

  @Test
  public void realFileTest() throws IOException{
    FileManager fm = new FileManager();
    Engine en = new Engine();
    UserStart us = new UserStart(fm, en);

    Input input = new Input("C:\\Users\\shela\\Documents\\Software Engineering\\softwareEngineering\\test\\numbers.txt");
    Output output = new Output("C:\\Users\\shela\\Documents\\Software Engineering\\softwareEngineering\\test\\output.txt");

    us.startComputationJob(input, output, "-");

  }

}
