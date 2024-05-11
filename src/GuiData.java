public class GuiData {
   String inputString;
   String outputString;
   int inputFC;
   int outputFC;

    GuiData(){
    }

    void setInput(String path){
        this.inputString = path;
    }

    void setOutput(String path){
        this.outputString = path;
    }

    void setOutSuccess(int num){
        this.outputFC = num;
    }

    void setInputSuccess(int num){
        this.inputFC = num;
    }
}
