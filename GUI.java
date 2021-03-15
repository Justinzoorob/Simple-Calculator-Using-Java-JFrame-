package Devoir2_300174393;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {

    Calculator cal = new Calculator();

    // création de tout les boutons
    private JButton ZERO = new JButton("0");
    private JButton ONE = new JButton("1");
    private JButton TWO = new JButton("2");
    private JButton THREE = new JButton("3");
    private JButton FOUR = new JButton("4");
    private JButton FIVE = new JButton("5");
    private JButton SIX = new JButton("6");
    private JButton SEVEN = new JButton("7");
    private JButton EIGHT = new JButton("8");
    private JButton NINE = new JButton("9");

    private JButton CLEAR = new JButton("C");
    private JButton FACTOR = new JButton("!");
    private JButton ADDI = new JButton("+");
    private JButton SOUS =  new JButton("-");
    private JButton MULTI = new JButton("*");
    private JButton POW = new JButton("POW");
    private JButton SQRT = new JButton("sqrt");
    private JButton LN = new JButton("ln");
    private JButton EGAL = new JButton("=");
    private JButton DIVI = new JButton("/");

    public JTextField textSpot = new JTextField(25);

    // custom font
    Font myFont = new Font("Arial",Font.BOLD,17);

    public GUI(){
        setTitle("Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        // crée une background pour la calculatrice et lui donné une couleur.
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBackground(Color.lightGray);
        add(backgroundPanel, BorderLayout.CENTER);

        // crée un panel pour le text
        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.WHITE);
        add(textPanel, BorderLayout.NORTH);


        // Ajoute toute les boutons et leur ActionListener
        backgroundPanel.add(ZERO);
        backgroundPanel.add(ONE);
        backgroundPanel.add(TWO);
        backgroundPanel.add(THREE);
        backgroundPanel.add(CLEAR);
        backgroundPanel.add(FOUR);
        backgroundPanel.add(FIVE);
        backgroundPanel.add(SIX);
        backgroundPanel.add(SEVEN);
        backgroundPanel.add(FACTOR);
        backgroundPanel.add(EIGHT);
        backgroundPanel.add(NINE);
        backgroundPanel.add(ADDI);
        backgroundPanel.add(SOUS);
        backgroundPanel.add(MULTI);
        backgroundPanel.add(POW);
        backgroundPanel.add(SQRT);
        backgroundPanel.add(LN);
        backgroundPanel.add(EGAL);
        backgroundPanel.add(DIVI);

        ZERO.addActionListener(this);
        ONE.addActionListener(this);
        TWO.addActionListener(this);
        THREE.addActionListener(this);
        FOUR.addActionListener(this);
        FIVE.addActionListener(this);
        SIX.addActionListener(this);
        SEVEN.addActionListener(this);
        EIGHT.addActionListener(this);
        NINE.addActionListener(this);
        CLEAR.addActionListener(this);
        FACTOR.addActionListener(this);
        ADDI.addActionListener(this);
        SOUS.addActionListener(this);
        MULTI.addActionListener(this);
        POW.addActionListener(this);
        SQRT.addActionListener(this);
        LN.addActionListener(this);
        EGAL.addActionListener(this);
        DIVI.addActionListener(this);

        // Crée un gridLayout
        GridLayout calculatorLayout = new GridLayout(4,4);
        backgroundPanel.setLayout(calculatorLayout);

        // Crée La Bar de texte
        textSpot.setBackground(Color.WHITE);
        textSpot.setPreferredSize(new Dimension(380,50));
        textSpot.setEditable(false);
        textSpot.setFont(myFont);
        textPanel.add(textSpot);
    }

    public void actionPerformed(ActionEvent e){

        String command = e.getActionCommand();

        if(command.equals("0")){
            System.out.println("Zero was pressed");
            textSpot.setText(textSpot.getText().concat("0"));
        }
        else if(command.equals("1")){
            System.out.println("One was pressed");
            textSpot.setText(textSpot.getText().concat("1"));
        }
        else if(command.equals("2")){
            System.out.println("Two was pressed");
            textSpot.setText(textSpot.getText().concat("2"));
        }
        else if(command.equals("3")){
            System.out.println("Three was pressed");
            textSpot.setText(textSpot.getText().concat("3"));
        }
        else if(command.equals("4")){
            System.out.println("Four was pressed");
            textSpot.setText(textSpot.getText().concat("4"));
        }
        else if(command.equals("5")){
            System.out.println("Five was pressed");
            textSpot.setText(textSpot.getText().concat("5"));
        }
        else if(command.equals("6")){
            System.out.println("Six was pressed");
            textSpot.setText(textSpot.getText().concat("6"));
        }
        else if(command.equals("7")){
            System.out.println("Seven was pressed");
            textSpot.setText(textSpot.getText().concat("7"));
        }
        else if(command.equals("8")){
            System.out.println("Eight was pressed");
            textSpot.setText(textSpot.getText().concat("8"));
        }
        else if(command.equals("9")){
            System.out.println("Nine was pressed");
            textSpot.setText(textSpot.getText().concat("9"));
        }
        else if(command.equals("C")){
            System.out.println("Clear was pressed");
            textSpot.setText("");
        }
        else if(command.equals("!")){
            System.out.println("Factor was pressed");
            cal.first = Double.parseDouble(textSpot.getText());
            cal.operation("!");
            textSpot.setText(String.valueOf(cal.result));
            cal.first=cal.result;
        }
        else if(command.equals("+")){
            System.out.println("Add was pressed");
            cal.first = Double.parseDouble(textSpot.getText());
            cal.oP=("+");
            textSpot.setText("");
        }
        else if(command.equals("-")){
            System.out.println("Sub was pressed");
            cal.first = Double.parseDouble(textSpot.getText());
            cal.oP=("-");
            textSpot.setText("");
        }
        else if(command.equals("*")){
            System.out.println("Times was pressed");
            cal.first = Double.parseDouble(textSpot.getText());
            cal.oP=("*");
            textSpot.setText("");
        }
        else if(command.equals("POW")){
            System.out.println("Pow was pressed");
            cal.first = Double.parseDouble(textSpot.getText());
            cal.oP=("POW");
            textSpot.setText("");
        }
        else if(command.equals("sqrt")){
            System.out.println("Sqrt was pressed");
            cal.oP=("sqrt");
            textSpot.setText(""); 
        }
        else if(command.equals("ln")){
            System.out.println("Ln was pressed");
            cal.oP = ("ln");
            textSpot.setText("");
        }
        else if(command.equals("/")){
            System.out.println("Div was pressed");
            cal.first = Double.parseDouble(textSpot.getText());
            cal.oP=("/");
            textSpot.setText("");
        }
        else if(command.equals("=")){
            System.out.println("Equal was pressed");
            cal.second = Double.parseDouble(textSpot.getText());
            cal.operation(cal.oP);
            textSpot.setText(String.valueOf(cal.result));
            cal.first=cal.result;
        }
    }

    public static void main(String[] args) {
        GUI calculator = new GUI();
    }
}
