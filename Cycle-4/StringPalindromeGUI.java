import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class StringPalindromeGUI extends JFrame implements ActionListener{
	JLabel l1, l2;
	JTextField t1, t2;
	JButton b;
	StringPalindromeGUI(){
		setTitle("Check String Palindrome using GUI");
		setLayout(new GridLayout(5, 1));
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1 = new JLabel("Enter string: ");
		l2 = new JLabel("Result: ");
		t1 = new JTextField(50);
		t2 = new JTextField(50);
		b = new JButton("CHECK");
		b.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
	}
	public void actionPerformed(ActionEvent e){
		String s = t1.getText();
		StringBuilder sbd = new StringBuilder(s);
		sbd.reverse();
		String rev = String.valueOf(sbd);
		if(s.equals(rev)){
			l2.setForeground(Color.green);
			t2.setText(s + " is a palindrome");
		}
		else{
			l2.setForeground(Color.red);
			t2.setText(s + " is not a palindrome");
		}
	}
	public static void main(String args[]){
		new StringPalindromeGUI();
	}
}
