import javax.swing.*;

public class Swing2 {
    JRadioButton rb1, rb2;
    JButton jb;
    ButtonGroup g1;
    JLabel l1;

    public Swing2(){
        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        jb = new JButton("Click");
        g1 = new ButtonGroup();
        l1 = new JLabel("Qualification");
        rb1.setText("Graduate");
        
    }
    public static void main(String[] args) {

    }
}
