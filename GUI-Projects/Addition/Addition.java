import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AdditionFrame {
    private JPanel panel;
    private JLabel firstNum;
    private JLabel secondNum;
    private JLabel sum;
    private JTextField textField1;
    private JTextField textField2;
    private JButton b1;

    public void initComponents() {
        panel = new JPanel();
        firstNum = new JLabel();
        secondNum = new JLabel();
        sum = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        b1 = new JButton();
        firstNum.setText("Number-1");
        secondNum.setText("Number-2");
        b1.setText("Sum");

        panel.setLayout(null);
        firstNum.setBounds(40, 20, 100, 20);
        secondNum.setBounds(40, 60, 100, 20);
        textField1.setBounds(150, 20, 100, 20);
        textField2.setBounds(150, 60, 100, 20);
        b1.setBounds(200, 100, 100, 20);
        sum.setBounds(50, 150, 200, 50);
        panel.add(firstNum);
        panel.add(secondNum);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(b1);
        panel.add(sum);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());
                sum.setText("Sum of " + a + " and " + b + " is: " + (a + b));
            }
        });
    }

    public AdditionFrame() {
        JFrame frame = new JFrame("Addition");
        initComponents();
        frame.setVisible(true); // making JFrame visible
        frame.setContentPane(panel); // panel come on JFrame
        frame.setSize(500, 300); // setting size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // so that program closes
    }
}

public class Addition {
    public static void main(String[] args) {
        AdditionFrame frame = new AdditionFrame();
    }
}