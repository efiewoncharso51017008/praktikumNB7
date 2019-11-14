/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayout;
import javax.swing.JFrame ;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;


public class Flowlayout extends JFrame {

public Flowlayout () {
        // TODO code application logic here
     FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 5, 10);
     Container container = getContentPane ();
     container.setLayout(flowLayout);
     
     container.add(new JButton("Tombol 1 "));
     container.add(new JButton("Tombol 2 "));
     container.add(new JButton("Tombol 3 "));
     container.add(new JButton("Tombol 4 "));
     container.add(new JButton("Tombol 5 "));
    }
     public static void main (String [] args) {
         Flowlayout jendela = new Flowlayout();
         jendela.setTitle("Kelas DemoFlowlayout");
         jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jendela.setSize(390,120);
         jendela.setVisible(true);
     }
}