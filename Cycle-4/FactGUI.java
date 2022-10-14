import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FactGUI extends JFrame implements ActionListener{
	JLabel l1, l2;
	JTextField t1,t2;
	JButton b;
	FactGUI(){
		setTitle("Factorial using GUI");
		setLayout(new GridLayout(5, 1));
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1 = new JLabel("Enter number: ");
		l2 = new JLabel("Factorial: ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b = new JButton("Compute Factorial");
		b.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
	}
	public void actionPerformed(ActionEvent e){
		int n = Integer.parseInt(t1.getText());
		int fact = 1;
		for(int i = 1; i <= n; i++)
			fact = fact*i;
		t2.setText(String.valueOf(fact));
	}
	public static void main(String args[]){
		new FactGUI();
	}
}
