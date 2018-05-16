package MyEx;
import javax.swing.*;
import java.awt.*;
public class CheckBoxEx extends JFrame {

    public CheckBoxEx(){
        
        setTitle("체크박스 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        ImageIcon cherryIcon = new ImageIcon("image/cherry.jpg");
        ImageIcon selectedCherryIcon = new ImageIcon("image/selectedCherry.jpg");
        

        //  Core Code  Core Code  Core Code  Core Code  Core Code  Core Code  Core Code 
        JCheckBox apple = new JCheckBox("사과", false);
        JCheckBox pear = new JCheckBox("배", true);
        JCheckBox cherry = new JCheckBox("체리", cherryIcon);
        
        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);
        
        add(apple);
        add(pear);
        add(cherry);
        setSize(550, 550);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
