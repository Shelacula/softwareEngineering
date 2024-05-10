
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiView {

    GuiData data = new GuiData();
    JButton submit = new JButton("Submit");
    JTextField delimitField = new JTextField(1);
    
    GuiView(GuiData data){
      this.data = data;

      JFrame frame = new JFrame("Change Calculator");
      frame.setSize(500,300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel inputPanel = new JPanel();
      JPanel submitPanel = new JPanel();
      JPanel outerPanel = new JPanel();

      outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.Y_AXIS));
  
      JLabel label = new JLabel("Add a file containing money values (one on each line):");
      JLabel outLabel = new JLabel("Select a location to save the results:");
      JLabel delimitLabel = new JLabel("Enter a custom delimiter character (leave blank to use default):");
  
      //Create a browse button
      JButton browse = new JButton("Browse");
      browse.setSize(50, 50);
      final JFileChooser fc = new JFileChooser();
  
      browse.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            int successFc = fc.showOpenDialog(frame);
            data.setInputSuccess(successFc);
            data.setInput(fc.getSelectedFile().getAbsolutePath());  
            }  
            }); 
            
      //Create an output directory button
      JButton outBtn = new JButton("Choose Save File");
      browse.setSize(50, 50);
      final JFileChooser dc = new JFileChooser();
  
      outBtn.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
          int successDc = dc.showOpenDialog(frame);
          data.setOutSuccess(successDc);
          data.setOutput(dc.getSelectedFile().getAbsolutePath());
            }  
            }); 
        
      //Create a submit button
      submit.setSize(50, 50); 
        
      inputPanel.add(label);
      inputPanel.add(browse);
      inputPanel.add(outLabel);
      inputPanel.add(outBtn);
      inputPanel.add(delimitLabel);
      inputPanel.add(delimitField);

      submitPanel.add(submit);

      outerPanel.add(inputPanel);
      outerPanel.add(submitPanel);
      frame.setContentPane(outerPanel);
  
      //Display the window.
      frame.setVisible(true);
          }

    JButton getSubmit(){
      return this.submit;
    }

    JTextField getDelimiterField(){
      return this.delimitField;
    }
}
