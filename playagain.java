import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class playagain extends JFrame {
    JButton playagain;

    JPanel playagainpanel;

    public playagain(){
        playagainpanel = new JPanel();
        playagain = new JButton("Play Again!!");

        setSize(200, 100);
        setLocation(500, 280);
        playagainpanel.setLayout(null);

        playagain.setBounds(50, 20, 100, 40);

        playagainpanel.add(playagain);

        getContentPane().add(playagainpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        playagain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player2 l = new player2();
                dispose();

            }
        });
    }

    public static void main(String[] args) {
        playagain l = new playagain();


    }
}
