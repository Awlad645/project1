
package medicineinfo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Covid extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton b1;

    public static void main(String[] args) {
        new Covid().setVisible(true);
    }

    public Covid() {

        super("Covid_19 - Medi drag v5.1");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
        setBackground(new Color(173, 216, 230));
        setBounds(250, 110, 1000, 650);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("New label");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("medicineinfo/icons/six.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(870, 40, 100, 100);
        contentPane.add(l1);

        JLabel l4 = new JLabel("Covid - 19");
        l4.setForeground(new Color(61, 61, 92));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(420, 30, 350, 40);
        contentPane.add(l4);

        JLabel l5 = new JLabel("What is Covid - 19");
        l5.setForeground(new Color(0, 153, 153));
        l5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l5.setBounds(70, 90, 450, 35);
        contentPane.add(l5);

        JLabel l6 = new JLabel("The coronavirus disease (COVID-19) is an infectious disease caused by a new strain of coronavirus.");
        l6.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l6.setBounds(70, 115, 900, 35);
        contentPane.add(l6);

        JLabel l7 = new JLabel("This new virus and disease were unknown before the outbreak began in Wuhan, China, in December 2019.");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l7.setBounds(70, 130, 900, 34);
        contentPane.add(l7);

        JLabel l8 = new JLabel("Symptoms of Covid - 19");
        l8.setForeground(new Color(0, 153, 153));
        l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l8.setBounds(70, 155, 900, 34);
        contentPane.add(l8);

        JLabel l9 = new JLabel("Most common symptoms:");
        l9.setForeground(new Color(255, 153, 51));
        l9.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l9.setBounds(70, 175, 900, 34);
        contentPane.add(l9);

        JLabel l10 = new JLabel("* Fever                * Dry cough              * Tiredness");
        //l10.setForeground(new Color(47, 79, 79));
        l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.BOLD, 15));
        l10.setBounds(70, 195, 900, 50);
        contentPane.add(l10);

        JLabel l11 = new JLabel("Less common symptoms:");
        l11.setForeground(new Color(255, 153, 51));
        l11.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l11.setBounds(70, 230, 900, 34);
        contentPane.add(l11);

        JLabel l12 = new JLabel("* aches and pains     * sore throat     * diarrhoea    * conjunctivitis    * headache    * loss of taste or smell ");
        l12.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l12.setBounds(70, 250, 900, 50);
        contentPane.add(l12);

        JLabel l13 = new JLabel("* a rash on skin, or discolouration of fingers or toes");
        l13.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l13.setBounds(70, 265, 900, 70);
        contentPane.add(l13);

        JLabel l14 = new JLabel("Serious symptoms:");
        l14.setForeground(new Color(255, 153, 51));
        l14.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l14.setBounds(70, 295, 900, 70);
        contentPane.add(l14);

        JLabel l15 = new JLabel("* difficulty breathing or shortness of breath    * chest pain or pressure    * loss of speech or movement");
        l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l15.setBounds(70, 318, 900, 70);
        contentPane.add(l15);

        JLabel l16 = new JLabel("Medicine Name");
        l16.setForeground(new Color(255, 153, 51));
        l16.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l16.setBounds(70, 340, 900, 70);
        contentPane.add(l16);

        JLabel l17 = new JLabel("*In USA ---->>>  Chloroquine and Hydroxychloroquine");
        l17.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l17.setBounds(70, 360, 900, 70);
        contentPane.add(l17);

        JLabel l18 = new JLabel("*In China ---->>>  Favilavir");
        l18.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l18.setBounds(70, 380, 900, 70);
        contentPane.add(l18);

        JLabel l19 = new JLabel("*In Bangladesh ---->>>  Ivermectin along with Doxycycline");
        l19.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l19.setBounds(70, 400, 900, 70);
        contentPane.add(l19);

        JLabel l20 = new JLabel("Veccine");
        l20.setForeground(new Color(255, 153, 51));
        l20.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l20.setBounds(70, 420, 900, 70);
        contentPane.add(l20);

        JLabel l21 = new JLabel("*University of Oxford (trail)---->>>  ChAdOx1 nCoV-19");
        l21.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l21.setBounds(70, 440, 900, 70);
        contentPane.add(l21);

        JLabel l22 = new JLabel("*Roivant Sciences (trail)---->>>  Gimsilumab");
        l22.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l22.setBounds(70, 460, 900, 70);
        contentPane.add(l22);

        JLabel l23 = new JLabel("*Altimmune (trail)---->>>  AdCOVID");
        l23.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l23.setBounds(70, 480, 900, 70);
        contentPane.add(l23);

        JLabel l24 = new JLabel("*I-Mab Biopharma (trail)---->>>  TJM2");
        l24.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l24.setBounds(70, 500, 900, 70);
        contentPane.add(l24);

        contentPane.setBackground(Color.WHITE);

        b1 = new JButton("Back");
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(800, 545, 110, 40);
        contentPane.add(b1);

    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new Home().setVisible(true);
        }
    }
}
