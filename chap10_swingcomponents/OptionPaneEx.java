import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OptionPaneEx extends JFrame {
    public OptionPaneEx() {
        setTitle("OptionPane 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(new MyPanel(), BorderLayout.NORTH);
        setSize(500, 200);
        setVisible(true);
    }
    class MyPanel extends Panel {
        private JButton inputBtn = new JButton("Input Name");
        private JTextField tf = new JTextField(10);
        private JButton confirmBtn = new JButton("Confirm");
        private JButton messageBtn = new JButton("Message");
        public MyPanel() {
            setBackground(Color.LIGHT_GRAY);
            add(inputBtn);
            add(confirmBtn);
            add(messageBtn);
            add(tf);
            inputBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = JOptionPane.showInputDialog("이름을 입력하세요.");
                    if (name != null) tf.setText(name);
                }
            });
            confirmBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(null, "Confirm", "선택", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.CLOSED_OPTION) tf.setText("Closed without selection");
                    else if (result == JOptionPane.YES_OPTION) tf.setText("Yes");
                    else tf.setText("No");
                }
            });
            messageBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "에러 메시지 예제", "Message", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }
    public static void main(String[] args) { new OptionPaneEx(); }
}
