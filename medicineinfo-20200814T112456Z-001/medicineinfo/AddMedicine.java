
package medicineinfo;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class AddMedicine extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JButton b1, b2;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new AddMedicine().setVisible(true);
    }

    public AddMedicine() {
        setBounds(400, 150, 1000, 800);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel lblMedicinename = new JLabel("Medicine name :");
	lblMedicinename.setForeground(Color.DARK_GRAY);
	lblMedicinename.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblMedicinename.setBounds(99, 60, 152, 26);
	contentPane.add(lblMedicinename);

	JLabel lblName = new JLabel("Type :");
	lblName.setForeground(Color.DARK_GRAY);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(99, 97, 192, 26);
	contentPane.add(lblName);
        
        JLabel lblEmail = new JLabel("Manufacturer :");
	lblEmail.setForeground(Color.DARK_GRAY);
	lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblEmail.setBounds(99, 134, 192, 26);
	contentPane.add(lblEmail);

	JLabel lblPassword = new JLabel("Therapeutic class :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblPassword.setBounds(99, 171, 192, 26);
	contentPane.add(lblPassword);

	JLabel lblAnswer = new JLabel("Indication :");
	lblAnswer.setForeground(Color.DARK_GRAY);
	lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer.setBounds(99, 208, 192, 26);
	contentPane.add(lblAnswer);
        
        JLabel lblAnswer1 = new JLabel("Dosage and administation :");
	lblAnswer1.setForeground(Color.DARK_GRAY);
	lblAnswer1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer1.setBounds(99, 245, 192, 26);
	contentPane.add(lblAnswer1);
        
        JLabel lblAnswer2 = new JLabel("Child :");
	lblAnswer2.setForeground(Color.DARK_GRAY);
	lblAnswer2.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer2.setBounds(99, 286, 192, 26);
	contentPane.add(lblAnswer2);
        
        JLabel lblAnswer3 = new JLabel("Side effect :");
	lblAnswer3.setForeground(Color.DARK_GRAY);
	lblAnswer3.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer3.setBounds(99, 323, 192, 26);
	contentPane.add(lblAnswer3);
        
        JLabel lblAnswer4 = new JLabel("Pregnancy category :");
	lblAnswer4.setForeground(Color.DARK_GRAY);
	lblAnswer4.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer4.setBounds(99, 360, 192, 26);
	contentPane.add(lblAnswer4);
        
        JLabel lblAnswer5 = new JLabel("Storage condition :");
	lblAnswer5.setForeground(Color.DARK_GRAY);
	lblAnswer5.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer5.setBounds(99, 397, 192, 26);
	contentPane.add(lblAnswer5);
        
        JLabel lblAnswer6 = new JLabel("Price :");
	lblAnswer6.setForeground(Color.DARK_GRAY);
	lblAnswer6.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer6.setBounds(99, 434, 192, 26);
	contentPane.add(lblAnswer6);
        
        textField = new JTextField();
	textField.setBounds(365, 65, 148, 30);
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(365, 102, 148, 30);
	contentPane.add(textField_1);

        textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(365, 139, 148, 30);
	contentPane.add(textField_2);

	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(365, 176, 148, 30);
	contentPane.add(textField_3);
        
        textField_4 = new JTextField();
	textField_4.setColumns(10);
	textField_4.setBounds(365, 213, 148, 30);
	contentPane.add(textField_4);
        
        textField_5 = new JTextField();
	textField_5.setColumns(10);
	textField_5.setBounds(365, 250, 148, 30);
	contentPane.add(textField_5);
        
        textField_6 = new JTextField();
	textField_6.setColumns(10);
	textField_6.setBounds(365, 287, 148, 30);
	contentPane.add(textField_6);
        
        textField_7 = new JTextField();
	textField_7.setColumns(10);
	textField_7.setBounds(365, 324, 148, 30);
	contentPane.add(textField_7);
        
        textField_8 = new JTextField();
	textField_8.setColumns(10);
	textField_8.setBounds(365, 361, 148, 30);
	contentPane.add(textField_8);
        
        textField_9 = new JTextField();
	textField_9.setColumns(10);
	textField_9.setBounds(365, 398, 148, 30);
	contentPane.add(textField_9);
        
        textField_10 = new JTextField();
	textField_10.setColumns(10);
	textField_10.setBounds(365, 435, 148, 30);
	contentPane.add(textField_10);
        
	b1 = new JButton("ADD");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 13));
	b1.setBounds(210, 490, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 13));
	b2.setBounds(440, 490, 100, 30);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setForeground(new Color(34, 139, 34));
	panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Add Medicine",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setBounds(31, 16, 800, 530);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            
            if(ae.getSource() == b1){
                String sql = "insert into addmedicine(Medicine_name, Type, Manufacture, T_Class, Indication, Dosag_ad, Child, Side_effect, Pragnancy_catagory, Storage_condition, Price) values(?, ?, ?, ?, ?, ?,?,?,?,?,?)";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, textField.getText());
                st.setString(2, textField_1.getText());
                st.setString(3, textField_2.getText());
		st.setString(4, textField_3.getText());
		st.setString(5, textField_4.getText());
                st.setString(6, textField_5.getText());
                st.setString(7, textField_6.getText());
                st.setString(8, textField_7.getText());
                st.setString(9, textField_8.getText());
                st.setString(10, textField_9.getText());
                st.setString(11, textField_10.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "successfully add");
                }

                textField.setText("");
                textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
                textField_4.setText("");
                textField_5.setText("");
                textField_6.setText("");
                textField_7.setText("");
                textField_8.setText("");
                textField_9.setText("");
                textField_10.setText("");
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new AdminPanel().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
}
