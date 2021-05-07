
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class myfirstgui implements ActionListener {
    private int count=0;
    private JPanel panel;
    private JFrame frame;
    private JLabel label;
    private JButton button;
    public myfirstgui() {
        frame = new JFrame();
         panel = new JPanel();
         button = new JButton("Click Here");
        label = new JLabel("Number of clicks is 0");
        
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.setLayout(new GridLayout(0,1));
        frame.add(panel,BorderLayout.CENTER);
        frame.setTitle("My First GUI");
        panel.add(button);
        panel.add(label);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        myfirstgui obj1 = new myfirstgui();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of click: "+count);
    }
}
