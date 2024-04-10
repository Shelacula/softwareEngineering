

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;


public class FileManager implements FileManagerAPI{

  EngineAPI testEngine;

  public FileManager(){
  }

  @Override
  public ArrayList<Integer> read(IInput read) throws IOException{
    String file = read.getPath();
    File inputFile = new File(file);

    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
    ArrayList<Integer> al = new ArrayList<Integer>();
    String line;
    while((line = reader.readLine()) != null){
      int num = Integer.parseInt(line);
      al.add(num);
    }
    reader.close();
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
      out.write(computed);
      out.close();
      return new WriteReturn(true);
    } catch (Exception e) {
      return new WriteReturn(false);
    }
  }
  
}
