package MyEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	
	public TextFieldEx() {
		
		setTitle("텍스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
        // JTextField 의 인자값으로 20이 들어가면,
        // 텍스트필드의 길이를 지정하는 것.
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터 공학과", 20));
		c.add(new JLabel("주소 "));
		c.add(new JTextField("서울시...", 20));
		
		setSize(300, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}
}
