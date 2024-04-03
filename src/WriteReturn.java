
public class WriteReturn implements IWriteReturn {

  boolean successful;

  public WriteReturn(boolean success){
    this.successful = success;
  }
 

  @Override
  public boolean success() {
    return successful;
  }
    
}
    

