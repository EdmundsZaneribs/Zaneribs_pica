import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PicerijasSakums {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Picērija");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        ImageIcon imageIcon = new ImageIcon("sakums.png");
        JLabel imageLabel = new JLabel(imageIcon);
        frame.add(imageLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton createOrderButton = new JButton("Izveidot pasūtījumu");
        createOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	PasutijumaSaraksts saraksts = new PasutijumaSaraksts();
                saraksts.setVisible(true);
                frame.dispose();
            }
        });
        buttonPanel.add(createOrderButton);
        JButton exitButton = new JButton("Iziet");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(exitButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

