package task1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI {
    private int madrid = 0, milan = 0;
    private JFrame frame;
    private JPanel left, right, top, bottom, center;
    private JLabel last, winner;
    private JTextArea result;

    private void winnerText() {
        if (milan > madrid)
            winner.setText("Winner: AC Milan");
        else if (madrid > milan)
            winner.setText("Winner: Read Madrid");
        else
            winner.setText("Winner: DRAW");
    }

    public GUI() {
        frame = new JFrame();

        result = new JTextArea("Result: " + milan + " X " + madrid);
        last = new JLabel("Last Scorer: N/A");
        winner = new JLabel("Winner: DRAW");

        result.setWrapStyleWord(true);
        result.setLineWrap(true);
        result.setOpaque(false);
        result.setEditable(false);
        result.setFocusable(false);
        result.setBackground(UIManager.getColor("Label.background"));
        result.setFont(UIManager.getFont("Label.font"));
        result.setBorder(UIManager.getBorder("Label.border"));

        JButton milanButton = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                result.setText("Result: " + milan + " X " + madrid);
                last.setText("Last Scorer: AC Milan");
                winnerText();
            }
        });

        JButton madridButton = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                result.setText("Result: " + milan + " X " + madrid);
                last.setText("Last Scorer: Real Madrid");
                winnerText();
            }
        });

        milanButton.setText("AC Milan");
        madridButton.setText("Real Madrid");

        center = new JPanel();
        center.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        center.setLayout(new GridLayout());
        center.add(result);

        top = new JPanel();
        top.setBorder(BorderFactory.createEmptyBorder(10, 120, 10, 10));
        top.setLayout(new GridLayout());
        top.add(winner);

        bottom = new JPanel();
        bottom.setBorder(BorderFactory.createEmptyBorder(10, 120, 10, 10));
        bottom.setLayout(new GridLayout());
        bottom.add(last);

        left = new JPanel();
        left.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        left.setLayout(new GridLayout());
        left.add(milanButton);

        right = new JPanel();
        right.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        right.setLayout(new GridLayout());
        right.add(madridButton);

        frame.add(center, BorderLayout.CENTER);
        frame.add(top, BorderLayout.NORTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Score Table");
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
