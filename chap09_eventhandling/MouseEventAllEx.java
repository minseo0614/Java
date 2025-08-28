import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseEventAllEx extends JFrame {
    private JLabel la = new JLabel("Move Me");
    public MouseEventAllEx() {
        setTitle("MouseListener & MouseMotionListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        la.setSize(80, 20);
        la.setLocation(100, 80);
        c.add(la);
        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);
        setSize(300, 200);
        setVisible(true);
    }
    class MyMouseListener implements MouseListener, MouseMotionListener {
        public void mousePressed(MouseEvent e) { la.setLocation(e.getX(), e.getY()); setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")"); }
        public void mouseReleased(MouseEvent e) { la.setLocation(e.getX(), e.getY()); setTitle("mouseReleased(" + e.getX() + "," + e.getY() + ")"); }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) { ((Component)e.getSource()).setBackground(Color.CYAN); }
        public void mouseExited(MouseEvent e) { ((Component)e.getSource()).setBackground(Color.YELLOW); }
        public void mouseDragged(MouseEvent e) { la.setLocation(e.getX(), e.getY()); setTitle("mouseDragged(" + e.getX() + "," + e.getY() + ")"); }
        public void mouseMoved(MouseEvent e) { setTitle("mouseMoved(" + e.getX() + "," + e.getY() + ")"); }
    }
    public static void main(String[] args) { new MouseEventAllEx(); }
}
