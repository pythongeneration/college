package component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{

	public JComponentEx() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Megenta/Yellow Button");
		JButton b2 = new JButton("    Disabled Button    ");
		JButton b3 = new JButton("getX(), getY()");
		ImageIcon heart = new ImageIcon("images/heart.jpg");
		JLabel imageLabel = new JLabel(heart);
		
//		b1.setBackground(Color.YELLOW);
		b1.setBackground(new Color(0, 255, 0));
		b1.setForeground(Color.YELLOW);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + ", " + getY());
			}
		});
		c.add(b1); c.add(b2); c.add(b3) c.add(imageLabel);
		setSize(360, 800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();	
	}
}
