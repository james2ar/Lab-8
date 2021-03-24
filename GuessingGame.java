import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField Uguess;
  JButton guessButton;
  JButton playAgainButton;
  JLabel userGuess;
  JLabel highLow;
  JLabel lastGuess;

  Random r = new Random();
  int randomNum;

  GuessingGame() {

    randomNum = r.nextInt(101);

    JFrame frame = new JFrame("Guessing Game");

    frame.setLayout(new FlowLayout()); 
    frame.setSize(240, 120);

    Uguess = new JTextField(10); 

    Uguess.setActionCommand("myTF");
    guessButton = new JButton("Guess");
    playAgainButton = new JButton("Play Again");

    Uguess.addActionListener(this);
    guessButton.addActionListener(this);
    playAgainButton.addActionListener(this);

    userGuess = new JLabel("Enter your guess:");
    highLow = new JLabel("");
    lastGuess = new JLabel("");

    frame.add(userGuess);
    frame.add(Uguess);
    frame.add(guessButton);
    frame.add(highLow);
    frame.add(lastGuess);
    frame.add(playAgainButton);

    frame.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae) {

    if(ae.getActionCommand().equals("Guess")) {
      int guess = Integer.parseInt(Uguess.getText());

      if (guess < randomNum) {
        highLow.setText("Too low");
        lastGuess.setText("Last guess was " + guess);
      }

      else if (guess > randomNum) {
        highLow.setText("Too high");
        lastGuess.setText("Last guess was " + guess);
      }

      else {
        highLow.setText("You got it");
        lastGuess.setText("Last guess was " + guess);
      }
    }

    else if(ae.getActionCommand().equals("Play Again")) {
      randomNum = r.nextInt(101);

      highLow.setText("");
      lastGuess.setText("");
      Uguess.setText("");
    }

    else {
      highLow.setText("You pressed Enter. Please press Guess");
    }
  }
}