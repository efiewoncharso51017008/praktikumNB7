package gridlayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class Gridlayout1 extends JFrame{
    JButton marcia = new JButton("Marcia");
    JButton carol = new JButton("Carol");
    JButton greg = new JButton("greg");
    JButton jan = new JButton("jan");
    JButton alice = new JButton("alice");
    JButton peter = new JButton("peter");
    JButton cindy = new JButton("Cindy");
    JButton mike = new JButton("mike");
    JButton bobby = new JButton("bobby");
public Gridlayout1(){
    super ("Grid Layout Beraksi");
    setSize(260, 260);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pane = new JPanel();
  GridLayout family = new GridLayout(3, 3, 10, 10 );
  pane.setLayout(family);
  pane.add(marcia); pane.add(carol);
   pane.add(greg); pane.add(jan);
    pane.add(alice); pane.add(peter);
     pane.add(cindy); pane.add(mike);
     pane.add(bobby);
     add(pane);
     setVisible(true);
}
public static void main(String[] args){
    Gridlayout1 frame = new Gridlayout1();
    }
    
}
