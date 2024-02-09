package src;
import java.io.File;

// public void testReadWrite(FileManager manager){
//   ReadResponse readTest = manager.read(new File());
//   WriteResponse writeTest = manager.write(new File());
// }

public interface FileManagerAPI{
  ReadReturn read(File file);
  WriteReturn write(File file, ComputeResponse computed);
}
