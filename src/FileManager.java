package src;
// public void testReadWrite(FileManager manager){
//   ReadResponse readTest = manager.read(new File());
//   WriteResponse writeTest = manager.write(new File());
// }

public interface FileManager{
  ReadReturn read();
  WriteReturn write();
}
