package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager implements FileManagerAPI{

  EngineAPI testEngine;

  public FileManager(){
    
  }


  @Override
  public ArrayList<Integer> read(IInput read) throws FileNotFoundException{
    Input input = (Input)read;
    String file = input.filePath;
    File inputFile = new File(file);
    Scanner sc = new Scanner(inputFile);
    ArrayList<Integer> al = new ArrayList<Integer>();
    while(sc.hasNextLine()){
      int num = sc.nextInt();
      al.add(num);
    }
    System.out.println(al);
    sc.close();
    return al;
  }

  @Override
  public IWriteReturn write(IOutput write, String computed) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'write'");
  }

  @Override
  public IWriteReturn write(IOutput write, String computed, String delim) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'write'");
  }
}
