import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class JTabbedPane {
    private static void createAndShowGUI(){
        final JFrame frame = new JFrame("Split Pane Example");

        frame.setSize(500,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new GridLayout(1,1));

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.addTab("Tab1",makePanel("This is tab 1"));
        tabbedPane.addTab("Tab2",makePanel("This is tab 2"));
        frame.getContentPane().add(tabbedPane);
    }
    private static JPanel makePanel(String text){
        JPanel p = new JPanel();
        p.add(new Label(text));
        p.setLayout(new GridLayout(1,1));
        return p;
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){ createAndShowGUI();}
        });
    }

}