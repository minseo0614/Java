import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FlyingTextEx extends JFrame {
    private JLabel la = new JLabel("HELLO");
    public FlyingTextEx() {
        super("상,하,좌,우 키로 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        la.setSize(100, 20);
        la.setLocation(50, 50);
        c.add(la);
        c.addKeyListener(new MyKeyListener());
        setSize(300, 200);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            if (code == KeyEvent.VK_UP) la.setLocation(la.getX(), la.getY() - 10);
            else if (code == KeyEvent.VK_DOWN) la.setLocation(la.getX(), la.getY() + 10);
            else if (code == KeyEvent.VK_LEFT) la.setLocation(la.getX() - 10, la.getY());
            else if (code == KeyEvent.VK_RIGHT) la.setLocation(la.getX() + 10, la.getY());
        }
    }
    public static void main(String[] args) { new FlyingTextEx(); }
}
