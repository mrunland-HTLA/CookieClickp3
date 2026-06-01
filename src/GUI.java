import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JButton cookieButton;
    JButton upgradeButton1;
    JButton upgradeButton2;
    Game game;
    ActionListener guiUpdate;
    Timer updateTimer;

    public GUI() {
        game = new Game();
        frame = new JFrame();//OUR WINDOW
        panel = new JPanel();
        label = new JLabel("Cookies: ");
        cookieButton = new JButton("Cookie");
        upgradeButton1 = new JButton("Upgrade");
        upgradeButton2 = new JButton("Slow Cooker");

        cookieButton.addActionListener(e -> {
            game.cookieClick();
            label.setText("Cookies: " + game.cookieCounter);
        });
        upgradeButton1.addActionListener(e -> game.upgradeButton1());
        upgradeButton2.addActionListener(e -> game.upgradeButton2());

        //panel properties
        panel.add(label);
        panel.add(cookieButton);
        panel.add(upgradeButton1);
        panel.add(upgradeButton2);
        panel.setBackground(Color.PINK);

        frame.add(panel);
        //frame properties
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        //timer go here
        guiUpdate = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //figure out the name of the label
                //set the text of the label to something
            }
        };
        updateTimer = new Timer(500,guiUpdate);
        updateTimer.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
