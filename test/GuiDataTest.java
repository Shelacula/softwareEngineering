public class GuiDataTest {

    public static void main(String[] args) {
        GuiData guiData = new GuiData();
        
        guiData.setInput("inputFilePath");
        guiData.setOutput("outputFilePath");
        
        // if input is successful, 1, and if output is successful, 2
        guiData.setInputSuccess(1);
        guiData.setOutSuccess(2);
        
       // get and print input and output
        String inputPath = guiData.inputString;
        System.out.println("Input Path: " + inputPath);
        String outputPath = guiData.outputString;
        System.out.println("Output Path: " + outputPath);
        
        //print input and ouput successful, print
        int inputSuccess = guiData.inputFC;
        System.out.println("Input Success: " + inputSuccess);
        int outputSuccess = guiData.outputFC;
        System.out.println("Output Success: " + outputSuccess);

        if(inputSuccess != 1){
            System.out.print("Input not successful. Try again");
        }

        if(outputSuccess != 2){
            System.out.print("Output not successful.");
        }
    }
}
