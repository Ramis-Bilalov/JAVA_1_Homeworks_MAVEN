package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    
    private static final ImageIcon ICON_X = new ImageIcon(Window.class.getResource("X.png"));
    private static final ImageIcon ICON_O = new ImageIcon(Window.class.getResource("O.png"));
    private static final ImageIcon ICON_DEFAULT = new ImageIcon(Window.class.getResource("def.png"));
    private static final ImageIcon ICON_RED_X = new ImageIcon(Window.class.getResource("redX.png"));

    public static Random rand = new Random();
    private final static JButton[][] map = new JButton[3][3];
    private static int clickCount = 0;

    private void initMap(JPanel panel) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = new JButton();
                JButton btn = map[i][j];
                btn.setIcon(ICON_DEFAULT);
                btn.setDisabledIcon(ICON_DEFAULT);
                btn.addActionListener(a -> {
                    btn.setIcon(ICON_X);
                    btn.setDisabledIcon(ICON_X);
                    btn.setEnabled(false);
                    clickCount++;

                    checkCase(btn);



                    if (clickCount == 9) {
                        JFrame frame = new JFrame("Ничья");
                        frame.setSize(300, 100);
                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        JPanel p = new JPanel();

                        JButton close = new JButton("CLOSE");
                        close.addActionListener(e -> {
                            dispose();
                            frame.dispose();
                        });
                        JButton newGame = new JButton("New Game");
                        newGame.addActionListener(e -> {
                            clickCount = 0;
                            new Window();
                            dispose();
                            frame.dispose();
                        });
                        p.add(close);
                        p.add(newGame);
                        frame.add(p);
                        frame.setVisible(true);
                    }


                });

                panel.add(btn);

            }
        }
    }

    private void checkCase(JButton btn) {
        if(ICON_X == btn.getIcon()) {
            setRandom(btn);
        }
    }

    private void setRandom(JButton btn) {

        int k = (int) (0 + Math.random() * 3);
        int d = (int) (0 + Math.random() * 3);
        JButton btn1 = map[k][d];
        System.out.println("k = " + (k+1) + " d = " + (d+1));
        if (!btn1.getIcon().equals(btn.getIcon())) {
            setIcon_O(btn1);

        }
        else if(btn1.getIcon().equals(btn.getIcon())) {

            setRandom(btn);
        }
    }

    private void setIcon_O(JButton btn1) {
        btn1.setIcon(ICON_O);
        btn1.setDisabledIcon(ICON_O);
        btn1.setEnabled(false);

    }


    public Window() throws HeadlessException {
        setSize(300, 300);
        //setLocation(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);                // ставит окно по центру

        JPanel panel = new JPanel(new GridLayout(3, 3));

        initMap(panel);

        add(panel);
        setResizable(false);
        setVisible(true);
    }

    public static void main (String[]args){
        new Window();
    }
}