package banking;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Signup {
	public static ArrayList<Account> accountList = new ArrayList<>();
	public Signup() {
		JFrame j=new JFrame("Sign up page");
		j.setLayout(null);
		j.setSize(1000,500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("Sign up");
		
		JLabel lname=new JLabel("Name");
		lname.setBounds(250,75,100,25);
		j.add(lname);
		JTextField name_field=new JTextField();
		name_field.setBounds(500,75,200,25);
		j.add(name_field);
		
		JLabel lac_number=new JLabel("Account Number");
		lac_number.setBounds(250,125,100,25);
		j.add(lac_number);
		JTextField ac_number_field=new JTextField();
		ac_number_field.setBounds(500,125,200,25);
		j.add(ac_number_field);
		
		JLabel lpin=new JLabel("Pin");
		lpin.setBounds(250,180,100,25);
		j.add(lpin);
		JPasswordField pin_field=new JPasswordField();
		pin_field.setBounds(500,180,200,25);
		j.add(pin_field);
		
		JLabel lini_balance=new JLabel("Initial Balance");
		lini_balance.setBounds(250,240,100,25);
		j.add(lini_balance);
		JTextField ini_balance_field=new JTextField();
		ini_balance_field.setBounds(500,240,200,25);
		j.add(ini_balance_field);
		
		JButton create=new JButton("Create an Account");
		create.setBounds(275,340,150,50);
		j.add(create);
		
		JButton back=new JButton("Back to Menu");
		back.setBounds(530,340,150,50);
		j.add(back);
		
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=name_field.getText();
				String ac_num=ac_number_field.getText().trim();
				String pin = new String(pin_field.getPassword()).trim();
		        String balance_text = ini_balance_field.getText().trim();
		        if(name.isEmpty()||ac_num.isEmpty()||pin.isEmpty()||balance_text.isEmpty()) {
		        	JOptionPane.showMessageDialog(j, "Please fill in all fields.");
	                return;
		        }
		        if (pin.length() != 4 || !pin.matches("\\d+")) {
	                JOptionPane.showMessageDialog(j, "PIN must be 4 digits.");
	                return;
	            }

	            try {
	                double balance = Double.parseDouble(balance_text);
	                if (balance < 0) {
	                    JOptionPane.showMessageDialog(j, "Balance cannot be negative.");
	                    return;
	                }
	                boolean exists = accountList.stream().anyMatch(a -> a.getAccountNumber().equals(ac_num));
	                if (exists) {
	                    JOptionPane.showMessageDialog(j, "Account number already exists.");
	                    return;
	                }
	                Account newAcc = new Account(name, ac_num, pin, balance);
	                accountList.add(newAcc);
	                JOptionPane.showMessageDialog(j, "Account created successfully!"+"\nAccount name: "+name_field.getText()+
		    				 "\nAccount number: "+ac_number_field.getText()+"\nBalance: "+ini_balance_field.getText());
	                name_field.setText(" ");
	                ac_number_field.setText(" ");
	                pin_field.setText(" ");
	                ini_balance_field.setText(" ");
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(j, "Invalid balance.");
	            }
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.dispose();
				mainpage.showMainMenu();
			}
		});	
		j.setVisible(true);
	}
}
