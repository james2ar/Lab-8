import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class guessingGame implements ActionListener {
  JtextField guess;
  Jbutton guessButton;
  Jbutton playAgain;
  Jlabel enterGuess;
  Jlabel highLow;
  Jlabel lastGuess;

  Random r = new Random();
  int randomNum;

  guessingGame() {
    int randomNum = r.nextint(100);

    JFrame frame = new JFrame("Guessing Game");
    frame.setLayout(new FlowLayout());
    frame.setSize(240,120);

    guess = new JTextField(10);
    userGuess.setActionCommand("myTF");

    JButton guessButton = new JButton("Button");
    JButton playAgain = new JButton("Play Again");

    userGuess.addActionListener(this);
    guessButton.addActionListener(this);
    playAgain.addActionListener(this);

    enterGuess = new JLabel ("");
    

  }
  }