package src;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileManager implements FileManagerAPI{

  EngineAPI testEngine;

  public FileManager(){
    
  }


  @Override
  public ArrayList<Integer> read(IInput read) throws FileNotFoundException{
    String file = read.getPath();
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
  public WriteReturn write(IOutput write, String computed) throws IOException {
    String outPath = write.getPath();
    File outputFile = new File(outPath);
    outputFile.getParentFile().mkdirs();
    FileWriter fw = new FileWriter(outputFile, true);
    BufferedWriter out = new BufferedWriter(fw);
    try {
      out.write(computed + ';');
      out.close();
      return new WriteReturn(true);
    } catch (Exception e) {
      return new WriteReturn(false);
    }
  }
  
  

  @Override
  public WriteReturn write(IOutput write, String computed, String delim) throws IOException {
    try {
      String outPath = write.getPath();
      File outputFile = new File(outPath);
      outputFile.getParentFile().mkdirs();
      FileWriter fw = new FileWriter(outputFile, true);
      BufferedWriter out = new BufferedWriter(fw);

      try {
        out.write(computed + delim);
        out.close();
        return new WriteReturn(true);
      } catch (IOException e) {
        e.printStackTrace();
        return new WriteReturn(false);
      }
    } catch (ClassCastException e) {
      e.printStackTrace();
      return new WriteReturn(false);
    }
  }
}
