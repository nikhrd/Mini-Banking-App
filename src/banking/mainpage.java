package banking;
import javax.swing.*;
import java.awt.event.*;
public class mainpage {

	public static void main(String[] args) {
		JFrame j=new JFrame("Mini Banking App");
		j.setLayout(null);
		j.setSize(1000,500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel name=new JLabel("Mini Banking App");
		
		JButton login_btn=new JButton("Log in");
		login_btn.setBounds(375,100,200,50);
		j.add(login_btn);
		
		JButton signup_btn=new JButton("Sign up");
		signup_btn.setBounds(375,200,200,50);
		j.add(signup_btn);
		
		JButton exit_btn=new JButton("Exit");
		exit_btn.setBounds(375,300,200,50);
		j.add(exit_btn);
		
		login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
			}
		});
		
		signup_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Signup();
			}
		});
		
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.dispose();
			}
		});
		j.setVisible(true);
	}

}
