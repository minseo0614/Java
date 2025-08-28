import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboActionEx extends JFrame {
    private String[] fruits = {"apple", "banana", "mango"};
    private ImageIcon[] images = {
        new ImageIcon("images/apple.jpg"),
        new ImageIcon("images/banana.jpg"),
        new ImageIcon("images/mango.jpg")
    };
    private JLabel imgLabel = new JLabel(images[0]);
    public ComboActionEx() {
        setTitle("콤보박스 활용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JComboBox<String> combo = new JComboBox<>(fruits);
        c.add(combo);
        c.add(imgLabel);
        combo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imgLabel.setIcon(images[combo.getSelectedIndex()]);
            }
        });
        setSize(300, 250);
        setVisible(true);
    }
    public static void main(String[] args) { new ComboActionEx(); }
}
