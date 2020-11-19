package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {

    private static final ImageIcon ICON_X = new ImageIcon(Window.class.getResource("X.png"));
    private static final ImageIcon ICON_O = new ImageIcon(Window.class.getResource("O.png"));
    private static final ImageIcon ICON_DEFAULT = new ImageIcon(Window.class.getResource("def.png"));

    public static Random rand = new Random();
    private final static JButton[][] map = new JButton[3][3];
    private static int clickCount = 0;

    private static int clickCountUS_0 = 0;
    private static int clickCountUS_1 = 0;
    private static int clickCountUS_2 = 0;

    private static int clickCountUS__0 = 0;
    private static int clickCountUS__1 = 0;
    private static int clickCountUS__2 = 0;

    private static int clickCountPC_0 = 0;
    private static int clickCountPC_1 = 0;
    private static int clickCountPC_2 = 0;

    private static int clickCountPC__0 = 0;
    private static int clickCountPC__1 = 0;
    private static int clickCountPC__2 = 0;

    private static int clickCountUS_X_0 = 0;
    private static int clickCountUS_X_1 = 0;
    private static int clickCountUS_X_2 = 0;

    private static int clickCountUS_X_01 = 0;
    private static int clickCountUS_X_11 = 0;
    private static int clickCountUS_X_21 = 0;

    private static int clickCountPC_X_0 = 0;
    private static int clickCountPC_X_1 = 0;
    private static int clickCountPC_X_2 = 0;

    private static int clickCountPC_X_01 = 0;
    private static int clickCountPC_X_11 = 0;
    private static int clickCountPC_X_21 = 0;






    private void initMap(JPanel panel) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = new JButton();
                JButton btn = map[i][j];
                int b = i;
                int c = j;
                btn.setIcon(ICON_DEFAULT);
                btn.setDisabledIcon(ICON_DEFAULT);

                btn.addActionListener(a -> {
                    btn.setIcon(ICON_X);
                    btn.setDisabledIcon(ICON_X);
                    btn.setEnabled(false);
                    clickCount++;
                    if (checkVictory_US(b, c)) {
                        String winUS = "Вы победили";
                        createExitWindow(winUS);
                    } else if (clickCount == 9) {
                        createExitWindow("Ничья");
                    }
                    checkCase(btn);
                });
                panel.add(btn);
            }
        }
    }

    private void createExitWindow(String win) {
        JFrame frame = new JFrame(win);
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
            clickCountPC_0 = 0;
            clickCountPC_1 = 0;
            clickCountPC_2 = 0;
            clickCountPC__0 = 0;
            clickCountPC__1 = 0;
            clickCountPC__2 = 0;

            clickCountUS_0 = 0;
            clickCountUS_1 = 0;
            clickCountUS_2 = 0;
            clickCountUS__0 = 0;
            clickCountUS__1 = 0;
            clickCountUS__2 = 0;

            clickCountPC_X_0 = 0;
            clickCountPC_X_1 = 0;
            clickCountPC_X_2 = 0;

            clickCountPC_X_01 = 0;
            clickCountPC_X_11 = 0;
            clickCountPC_X_21 = 0;

            clickCountUS_X_0 = 0;
            clickCountUS_X_1 = 0;
            clickCountUS_X_2 = 0;

            clickCountUS_X_01 = 0;
            clickCountUS_X_11 = 0;
            clickCountUS_X_21 = 0;
            new Window();
            dispose();
            frame.dispose();
        });
        p.add(close);
        p.add(newGame);
        frame.add(p);
        frame.setVisible(true);
    }

    private boolean checkVictory_US(int k, int d) {
        if(d == 0) clickCountUS_0++;
        if(d == 1) clickCountUS_1++;
        if(d == 2) clickCountUS_2++;
        if(k == 0) clickCountUS__0++;
        if(k == 1) clickCountUS__1++;
        if(k == 2) clickCountUS__2++;
        if(k == 2 && d == 0) clickCountUS_X_0++;
        if(k == 1 && d == 1) clickCountUS_X_1++;
        if(k == 0 && d == 2) clickCountUS_X_2++;

        if(k == 0 && d == 0) clickCountUS_X_01++;
        if(k == 1 && d == 1) clickCountUS_X_11++;
        if(k == 2 && d == 2) clickCountUS_X_21++;

        return clickCountUS_0 == 3 || clickCountUS_1 == 3 || clickCountUS_2 == 3 ||
                clickCountUS__0 == 3 || clickCountUS__1 == 3 || clickCountUS__2 == 3 ||
                (clickCountUS_X_0 == 1 && clickCountUS_X_1 == 1 && clickCountUS_X_2 == 1) ||
                (clickCountUS_X_01 == 1 && clickCountUS_X_11 == 1 && clickCountUS_X_21 == 1);
    }

    private boolean checkVictoryPC(int k, int d) {
        if(d == 0) clickCountPC_0++;
        if(d == 1) clickCountPC_1++;
        if(d == 2) clickCountPC_2++;
        if(k == 0) clickCountPC__0++;
        if(k == 1) clickCountPC__1++;
        if(k == 2) clickCountPC__2++;

        if(k == 2 && d == 0) clickCountPC_X_0++;
        if(k == 1 && d == 1) clickCountPC_X_1++;
        if(k == 0 && d == 2) clickCountPC_X_2++;

        if(k == 0 && d == 0) clickCountPC_X_01++;
        if(k == 1 && d == 1) clickCountPC_X_11++;
        if(k == 2 && d == 2) clickCountPC_X_21++;

        return clickCountPC_0 == 3 || clickCountPC_1 == 3 || clickCountPC_2 == 3 ||
                clickCountPC__0 == 3 || clickCountPC__1 == 3 || clickCountPC__2 == 3 ||
                (clickCountPC_X_0 == 1 && clickCountPC_X_1 == 1 && clickCountPC_X_2 == 1) ||
                (clickCountPC_X_01 == 1 && clickCountPC_X_11 == 1 && clickCountPC_X_21 == 1);
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

        if (btn1.getIcon().equals(ICON_DEFAULT)) {
            setIcon_O(btn1);
            clickCount++;
            if(checkVictoryPC(k, d)) {
               String winPC = "Комп выиграл";
                createExitWindow(winPC);
            }
        }
        else if (clickCount < 9) {
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
        setLocationRelativeTo(null);

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