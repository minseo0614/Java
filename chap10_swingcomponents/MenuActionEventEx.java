import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuActionEventEx extends JFrame {
    private JLabel imgLabel = new JLabel();
    public MenuActionEventEx() {
        setTitle("Menu + ActionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(300, 200);
        setVisible(true);
    }
    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu = new JMenu("Screen");
        String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
        JMenuItem[] menuItem = new JMenuItem[itemTitle.length];
        MenuActionListener listener = new MenuActionListener();
        for (int i = 0; i < itemTitle.length; i++) {
            menuItem[i] = new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listener);
            screenMenu.add(menuItem[i]);
        }
        mb.add(screenMenu);
        setJMenuBar(mb);
    }
    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if (cmd.equals("Load")) imgLabel.setIcon(new ImageIcon("images/img.jpg"));
            else if (cmd.equals("Hide")) imgLabel.setVisible(false);
            else if (cmd.equals("ReShow")) imgLabel.setVisible(true);
            else if (cmd.equals("Exit")) System.exit(0);
        }
    }
    public static void main(String[] args) { new MenuActionEventEx(); }
}
