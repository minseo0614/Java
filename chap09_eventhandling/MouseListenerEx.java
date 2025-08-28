import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseListenerEx extends JFrame {
    private JLabel la = new JLabel("Hello");
    public MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);
        c.addMouseListener(new MyMouseListener());
        setSize(200, 200);
        setVisible(true);
    }
    class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e) { la.setLocation(e.getX(), e.getY()); }
        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
    public static void main(String[] args) { new MouseListenerEx(); }
}
