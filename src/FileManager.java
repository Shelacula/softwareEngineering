package src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager implements FileManagerAPI{

  EngineAPI testEngine;

  public FileManager(){
    
  }


  @Override
  public Integer[] read(IInput read) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'read'");
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
