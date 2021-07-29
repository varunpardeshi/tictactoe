import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcomepage extends JFrame {
    JButton player1;
    JButton player2;
    JPanel welcomepanel;
    JLabel text1;
    JLabel text2;



    public welcomepage() {
        super("Tic Tac Toe");


        welcomepanel = new JPanel();
        player2 = new JButton("Click to play");
        text1 = new JLabel("Let's Play ");
        text2 = new JLabel("Tic Tac Toe ");



        setSize(400, 250);
        setLocation(500, 280);
        welcomepanel.setLayout(null);


        text1.setFont(new Font("Serif",Font.BOLD,50));
        text2.setFont(new Font("Serif",Font.BOLD,50));


        player2.setBounds(150, 170, 100, 40);
        text1.setBounds(100, 1, 300, 100);
        text2.setBounds(70, 70, 300, 100);






        welcomepanel.add(player2);
        welcomepanel.add(text1);
        welcomepanel.add(text2);


        getContentPane().add(welcomepanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



// player1 button action
        player2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                player2 l = new player2();
            }
        });

    }

    public static void main(String[] args) {
        welcomepage l = new welcomepage();


    }
}
