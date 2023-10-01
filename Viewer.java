import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Font;


public class Viewer {

    private JTextField textFieldTemp;
    private JTextField textFieldExpression;

    public Viewer(){
        Controller controller = new Controller(this);
        Font fontTextField = new Font("Times New Roman", Font.ITALIC,25);
        Font fontButtons = new Font("Times New Roman", Font.CENTER_BASELINE,30);
        JFrame frame = new JFrame("Frontend MVC");
        frame.setSize(300, 400);
        frame.setLocation(700, 100);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textFieldTemp = new JTextField();
        textFieldTemp.setBounds(10, 40, 265, 35);
        textFieldTemp.setFont(fontTextField);
        textFieldTemp.setBackground(Color.DARK_GRAY);
        textFieldTemp.setForeground(Color.WHITE);

        textFieldTemp.setEditable(false);

        textFieldExpression = new JTextField();
        textFieldExpression.setBounds(10, 10, 265, 30);
        textFieldExpression.setFont(fontTextField);
        textFieldExpression.setBackground(Color.DARK_GRAY);
        textFieldExpression.setForeground(Color.WHITE);
        textFieldExpression.setEditable(false);

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(75, 245, 60, 50);
        buttonZero.setFont(fontButtons);
        buttonZero.setForeground(new Color(255, 255, 255));
        buttonZero.setBackground(new Color(75, 66, 71));
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("0");
        buttonZero.setFocusable(false);

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(10, 190, 60, 50);
        buttonOne.setFont(fontButtons);
        buttonOne.setForeground(new Color(255, 255, 255));
        buttonOne.setBackground(new Color(75, 66, 71));
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("1");
        buttonOne.setFocusable(false);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(75, 190, 60, 50);
        buttonTwo.setFont(fontButtons);
        buttonTwo.setForeground(new Color(255, 255, 255));
        buttonTwo.setBackground(new Color(75, 66, 71));
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("2");
        buttonTwo.setFocusable(false);

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(140, 190, 60, 50);
        buttonThree.setFont(fontButtons);
        buttonThree.setForeground(new Color(255, 255, 255));
        buttonThree.setBackground(new Color(75, 66, 71));
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("3");
        buttonThree.setFocusable(false);

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(10, 135, 60, 50);
        buttonFour.setFont(fontButtons);
        buttonFour.setForeground(new Color(255, 255, 255));
        buttonFour.setBackground(new Color(75, 66, 71));
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("4");
        buttonFour.setFocusable(false);

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(75, 135, 60, 50);
        buttonFive.setFont(fontButtons);
        buttonFive.setForeground(new Color(255, 255, 255));
        buttonFive.setBackground(new Color(75, 66, 71));
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("5");
        buttonFive.setFocusable(false);

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(140, 135, 60, 50);
        buttonSix.setFont(fontButtons);
        buttonSix.setForeground(new Color(255, 255, 255));
        buttonSix.setBackground(new Color(75, 66, 71));
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("6");
        buttonSix.setFocusable(false);

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(10, 80, 60, 50);
        buttonSeven.setFont(fontButtons);
        buttonSeven.setForeground(new Color(255, 255, 255));
        buttonSeven.setBackground(new Color(75, 66, 71));
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("7");
        buttonSeven.setFocusable(false);

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(75, 80, 60, 50);
        buttonEight.setFont(fontButtons);
        buttonEight.setForeground(new Color(255, 255, 255));
        buttonEight.setBackground(new Color(75, 66, 71));
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("8");
        buttonEight.setFocusable(false);

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(140, 80, 60, 50);
        buttonNine.setFont(fontButtons);
        buttonNine.setForeground(new Color(255, 255, 255));
        buttonNine.setBackground(new Color(75, 66, 71));
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("9");
        buttonNine.setFocusable(false);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(213, 245, 60, 50);
        buttonPlus.setFont(fontButtons);
        buttonPlus.setBackground(new Color(24, 4, 121));
        buttonPlus.setForeground(new Color(255, 255, 255));
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("+");
        buttonPlus.setFocusable(false);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(213, 190, 60, 50);
        buttonMinus.setFont(fontButtons);
        buttonMinus.setBackground(new Color(24, 4, 121));
        buttonMinus.setForeground(new Color(255, 255, 255));
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("-");
        buttonMinus.setFocusable(false);

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(213, 135, 60, 50);
        buttonMultiply.setFont(fontButtons);
        buttonMultiply.setBackground(new Color(24, 4, 121));
        buttonMultiply.setForeground(new Color(255, 255, 255));
        buttonMultiply.addActionListener(controller);
        buttonMultiply.setActionCommand("*");
        buttonMultiply.setFocusable(false);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(213, 80, 62, 50);
        buttonDivide.setFont(fontButtons);
        buttonDivide.setBackground(new Color(24, 4, 121));
        buttonDivide.setForeground(new Color(255, 255, 255));
        buttonDivide.addActionListener(controller);
        buttonDivide.setActionCommand("/");
        buttonDivide.setFocusable(false);

        JButton buttonPoint = new JButton(".");
        buttonPoint.setBounds(10, 245, 60, 50);
        buttonPoint.setFont(fontButtons);
        buttonPoint.setForeground(new Color(255, 255, 255));
        buttonPoint.setBackground(new Color(Color.DARK_GRAY.getRGB()));
        buttonPoint.addActionListener(controller);
        buttonPoint.setActionCommand(".");
        buttonPoint.setFocusable(false);

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(140, 300, 133, 50);
        buttonEqual.setFont(fontButtons);
        buttonEqual.setBackground(new Color(3, 9, 93));
        buttonEqual.setForeground(new Color(255, 255, 255));
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("=");
        buttonEqual.setFocusable(false);

        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(10, 300, 125, 50);
        buttonClear.setFont(fontButtons);
        buttonClear.setBackground(new Color(121, 3, 3));
        buttonClear.setForeground(new Color(255, 255, 255));
        buttonClear.addActionListener(controller);
        buttonClear.setActionCommand("symclear");
        buttonClear.setFocusable(false);

        JButton buttonDelete = new JButton("Del");
        buttonDelete.setBounds(140, 245, 60, 50);
        buttonDelete.setFont(new Font("Times New Roman", Font.CENTER_BASELINE,15));
        buttonDelete.setForeground(new Color(255, 255, 255));
        buttonDelete.setBackground(new Color(152, 3, 3));
        buttonDelete.addActionListener(controller);
        buttonDelete.setActionCommand("symdel");
        buttonDelete.setFocusable(false);

        frame.setLayout(null);
        frame.add(buttonSeven);
        frame.add(buttonFour);
        frame.add(buttonPoint);
        frame.add(buttonClear);
        frame.add(buttonOne);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonDivide);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonMultiply);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonMinus);
        frame.add(buttonZero);
        frame.add(buttonDelete);
        frame.add(buttonPlus);
        frame.add(buttonEqual);

        frame.add(textFieldTemp);
        frame.add(textFieldExpression);
        frame.setVisible(true);
    }

    public void updateTemp(String result) {
        textFieldTemp.setText(result);
    }

    public void updateExpression(String fullExpression) {
        textFieldExpression.setText(fullExpression);
    }
}
