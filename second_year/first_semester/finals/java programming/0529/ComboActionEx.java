import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ComboActionEx1 extends JFrame{

    private String[] fruits = {"apple", "melon", "mango"};
    private ImageIcon[] images = {
            new ImageIcon("images/apple.jpg"),
            new ImageIcon("images/melon.jpg"),
            new ImageIcon("images/mango.jpg")
    };
    private JLabel imageLabel = new JLabel(images[0]);
    private JComboBox<String> strCombo = new JComboBox(fruits);

    public ComboActionEx1(){
        setTitle("Combo!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(strCombo);
        c.add(imageLabel);
        strCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> comboBox = (JComboBox)e.getSource();
                int index = comboBox.getSelectedIndex();
                imageLabel.setIcon(images[index]);
            }
        });
    }

    public static void main(String[] args) {
        new ComboActionEx1();
    }
}
