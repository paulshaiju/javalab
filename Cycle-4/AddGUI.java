import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddGUI extends JFrame implements ActionListener{
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b;
	AddGUI(){
		setTitle("Add Numbers using GUI");
		setLayout(new GridLayout(7,2));
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1 = new JLabel("First number: ");
		l2 = new JLabel("Second number: ");
		l3 = new JLabel("Result: ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		b = new JButton("ADD");
		b.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
	}
	public void actionPerformed(ActionEvent e){
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		int sum = x + y;
		t3.setText(String.valueOf(sum));
	}
	public static void main(String args[]){
		new AddGUI();
	}
}
