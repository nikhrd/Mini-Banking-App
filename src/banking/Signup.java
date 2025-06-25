package banking;
import javax.swing.*;
import java.awt.event.*;
public class Signup {
	public Signup() {
		JFrame j=new JFrame("Sign up page");
		j.setLayout(null);
		j.setSize(600,600);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title=new JLabel("Sign up");
		
		JLabel name=new JLabel("Name");
		name.setBounds(50,25,100,25);
		j.add(name);
		JTextField name_field=new JTextField();
		name_field.setBounds(200,25,120,25);
		j.add(name_field);
		
		JLabel ac_number=new JLabel("Account Number");
		ac_number.setBounds(50,75,100,25);
		j.add(ac_number);
		JTextField ac_number_field=new JTextField();
		ac_number_field.setBounds(200,75,100,25);
		j.add(ac_number_field);
		
		JLabel pin=new JLabel("Pin");
		pin.setBounds(50,130,100,25);
		j.add(pin);
		JTextField pin_field=new JTextField();
		pin_field.setBounds(200,130,200,25);
		j.add(pin_field);
		
		JLabel confirm_pin=new JLabel("Confirm pin");
		confirm_pin.setBounds(50,190,100,25);
		j.add(confirm_pin);
		JTextField confirm_pin_field=new JTextField();
		confirm_pin_field.setBounds(200,190,200,75);
		j.add(confirm_pin_field);
		
		JLabel ini_balance=new JLabel("Initial Balance");
		ini_balance.setBounds(50,300,100,25);
		j.add(ini_balance);
		JTextField ini_balance_field=new JTextField();
		ini_balance_field.setBounds(200,300,100,25);
		j.add(ini_balance_field);
		
		JButton create=new JButton("Create an Account");
		create.setBounds(100,420,100,50);
		j.add(create);
		
		JButton back=new JButton("Back to Menu");
		back.setBounds(300,420,100,50);
		j.add(back);
		
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Signup();
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mainpage();
			}
		});
	}
}
