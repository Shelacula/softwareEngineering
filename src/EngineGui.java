import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;

public class EngineGui { 

      public static void main(String[] args) throws Exception {

      GuiData GUIData = new GuiData();
      GuiView GUI = new GuiView(GUIData);

      System.out.println(GUIData.inputString);

      GUI.getSubmit().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
          String target = "localhost:50051";
            ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
            .build();
          try {
            EngineClient client = new EngineClient(channel);
            String inputPath = GUIData.inputString;
            String outputPath = GUIData.outputString;
            String delimitChar = GUI.getDelimiterField().getText();
            if(delimitChar.isEmpty()){
              client.compute(inputPath, outputPath);
            } else{
              client.compute(inputPath, outputPath, delimitChar);
            }
            
          } finally {
            try {
              channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e1) {
              e1.printStackTrace();
            }
          }

        }
      });
  }
}
