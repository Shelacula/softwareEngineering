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
  public WriteReturn write(IOutput write, String computed) throws IOException {
    Output output = (Output) write;
    String outPath = output.outputPath;
    File outputFile = new File(outPath);
    BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
    try {
      out.write(computed + ';');
      out.close();
      return new WriteReturn(true);
    } catch (Exception e) {
      return new WriteReturn(false);
    }
  }
  
  

  @Override
    public IWriteReturn write(IOutput write, String computed, String delim) {
        try {
            Output output = (Output) write;
            String outPath = output.outputPath;
            File outputFile = new File(outPath);

            outputFile.getParentFile().mkdirs();

            try (BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {
                out.write(computed + delim);
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
