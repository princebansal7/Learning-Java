
import javax.swing.*;

class UnitConverter {
    private JPanel panel;

    void initComponents() {
        panel = new JPanel();
        JLabel u1 = new JLabel();
        JLabel u2 = new JLabel();
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JButton btn = new JButton();
        String[] unitStr1 = { "Meter", "Gram" };
        String[] unitStr2 = { "KM", "KG" };
        JComboBox<String> cb1 = new JComboBox<>(unitStr1);
        JComboBox<String> cb2 = new JComboBox<>(unitStr2);

        panel.setLayout(null);
        panel.setName("panel");
        u1.setText("Value 1");
        u2.setText("Value 2");
        btn.setText("Convert");

        u1.setBounds(20, 50, 50, 20);
        textField1.setBounds(70, 50, 40, 20);
        cb1.setBounds(110, 50, 100, 20);

        u2.setBounds(300, 50, 50, 20);
        textField2.setBounds(350, 50, 30, 20);
        cb2.setBounds(380, 50, 100, 20);

        btn.setBounds(220, 100, 80, 50);

        panel.add(u1);
        panel.add(u2);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(cb1);
        panel.add(cb2);
        panel.add(btn);

    }

    public UnitConverter() {
        initComponents();
        JFrame frame = new JFrame("Unit Converter");
        frame.setVisible(true); // making JFrame visible
        frame.setContentPane(panel); // panel come on JFrame
        frame.setSize(530, 300); // setting size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // so that program closes
    }
}

public class UnitConverterMain {
    public static void main(String[] args) {
        UnitConverter uc = new UnitConverter();
    }
}