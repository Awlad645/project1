package medicineinfo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class SearchMedicine extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    private JButton b1, b2, b3;

    public static void main(String[] args) {
        new SearchMedicine().setVisible(true);
    }
    
    public SearchMedicine() {

        setBounds(450, 70, 650, 650);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Medicine Name");
        l1.setFont(new Font("Tahoma", Font.BOLD, 13));
        l1.setBounds(109, 83, 180, 29);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Type");
        l2.setFont(new Font("Tahoma", Font.BOLD, 13));
        l2.setBounds(109, 122, 180, 21);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Manufacturer");
        l3.setFont(new Font("Tahoma", Font.BOLD, 13));
        l3.setBounds(109, 154, 180, 27);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Therapeutic class");
        l4.setFont(new Font("Tahoma", Font.BOLD, 13));
        l4.setBounds(109, 192, 180, 21);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Indication");
        l5.setFont(new Font("Tahoma", Font.BOLD, 13));
        l5.setBounds(109, 224, 180, 21);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Dosage and Administation");
        l6.setFont(new Font("Tahoma", Font.BOLD, 13));
        l6.setBounds(109, 261, 180, 21);
        contentPane.add(l6);

        JLabel l7 = new JLabel("Child");
        l7.setFont(new Font("Tahoma", Font.BOLD, 13));
        l7.setBounds(109, 298, 180, 21);
        contentPane.add(l7);

        JLabel l8 = new JLabel("Side Effect");
        l8.setFont(new Font("Tahoma", Font.BOLD, 13));
        l8.setBounds(109, 335, 180, 21);
        contentPane.add(l8);

        JLabel l9 = new JLabel("Pregnancy Category");
        l9.setFont(new Font("Tahoma", Font.BOLD, 13));
        l9.setBounds(109, 372, 180, 21);
        contentPane.add(l9);

        JLabel l10 = new JLabel("Storage Condition");
        l10.setFont(new Font("Tahoma", Font.BOLD, 13));
        l10.setBounds(109, 409, 180, 21);
        contentPane.add(l10);

        JLabel l11 = new JLabel("Price");
        l11.setFont(new Font("Tahoma", Font.BOLD, 13));
        l11.setBounds(109, 446, 180, 21);
        contentPane.add(l11);

        t1 = new JTextField();
        t1.setFont(new Font("Tahoma", Font.BOLD, 13));
        t1.setForeground(new Color(105, 105, 105));
        t1.setBounds(297, 88, 139, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setEditable(false);
        t2.setFont(new Font("Tahoma", Font.BOLD, 13));
        t2.setForeground(new Color(165, 42, 42));
        t2.setColumns(10);
        t2.setBounds(297, 123, 139, 20);
        contentPane.add(t2);

        t3 = new JTextField();
        t3.setEditable(false);
        t3.setFont(new Font("Tahoma", Font.BOLD, 12));
        t3.setForeground(new Color(72, 61, 139));
        t3.setColumns(10);
        t3.setBounds(297, 158, 139, 20);
        contentPane.add(t3);

        t4 = new JTextField();
        t4.setEditable(false);
        t4.setFont(new Font("Tahoma", Font.BOLD, 13));
        t4.setForeground(new Color(205, 92, 92));
        t4.setColumns(10);
        t4.setBounds(297, 193, 139, 20);
        contentPane.add(t4);

        t5 = new JTextField();
        t5.setEditable(false);
        t5.setFont(new Font("Tahoma", Font.BOLD, 13));
        t5.setForeground(new Color(50, 205, 50));
        t5.setColumns(10);
        t5.setBounds(297, 228, 139, 20);
        contentPane.add(t5);

        t6 = new JTextField();
        t6.setEditable(false);
        t6.setFont(new Font("Tahoma", Font.BOLD, 13));
        t6.setForeground(new Color(205, 92, 92));
        t6.setColumns(10);
        t6.setBounds(297, 263, 139, 20);
        contentPane.add(t6);

        t7 = new JTextField();
        t7.setEditable(false);
        t7.setFont(new Font("Tahoma", Font.BOLD, 13));
        t7.setForeground(new Color(205, 92, 92));
        t7.setColumns(10);
        t7.setBounds(297, 298, 139, 20);
        contentPane.add(t7);

        t8 = new JTextField();
        t8.setEditable(false);
        t8.setFont(new Font("Tahoma", Font.BOLD, 13));
        t8.setForeground(new Color(205, 92, 92));
        t8.setColumns(10);
        t8.setBounds(297, 333, 139, 20);
        contentPane.add(t8);

        t9 = new JTextField();
        t9.setEditable(false);
        t9.setFont(new Font("Tahoma", Font.BOLD, 13));
        t9.setForeground(new Color(205, 92, 92));
        t9.setColumns(10);
        t9.setBounds(297, 368, 139, 20);
        contentPane.add(t9);

        t10 = new JTextField();
        t10.setEditable(false);
        t10.setFont(new Font("Tahoma", Font.BOLD, 13));
        t10.setForeground(new Color(205, 92, 92));
        t10.setColumns(10);
        t10.setBounds(297, 403, 139, 20);
        contentPane.add(t10);

        t11 = new JTextField();
        t11.setEditable(false);
        t11.setFont(new Font("Tahoma", Font.BOLD, 13));
        t11.setForeground(new Color(205, 92, 92));
        t11.setColumns(10);
        t11.setBounds(297, 438, 139, 20);
        contentPane.add(t11);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.BOLD, 12));
        b1.setBounds(450, 83, 80, 29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setFont(new Font("Tahoma", Font.BOLD, 13));
        b3.setBounds(233, 500, 101, 29);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(139, 69, 19), 2), "Medicine-Search",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(178, 34, 34)));
        panel.setBounds(47, 45, 508, 500);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
    }
    public void actionPerformed(ActionEvent ae) {
        try {
            conn con = new conn();
            if (ae.getSource() == b1) {
                String sql = "select * from addmedicine where Medicine_name=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, t1.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    t2.setText(rs.getString("Type"));
                    t3.setText(rs.getString("Manufacture"));
                    t4.setText(rs.getString("T_Class"));
                    t5.setText(rs.getString("Indication"));
                    t6.setText(rs.getString("Dosag_ad"));
                    t7.setText(rs.getString("Child"));
                    t8.setText(rs.getString("Side_effect"));
                    t9.setText(rs.getString("Pragnancy_catagory"));
                    t10.setText(rs.getString("Storage_condition"));
                    t11.setText(rs.getString("Price"));
                }
            }
            if (ae.getSource() == b3) {
                this.setVisible(false);
                new Home().setVisible(true);

            }
        } catch (Exception e) {

        }
    }

}
