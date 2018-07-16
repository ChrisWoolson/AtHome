package home;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MineSweeper implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	JButton button11 = new JButton();
	JButton button12 = new JButton();
	JButton button13 = new JButton();
	JButton button14 = new JButton();
	JButton button15 = new JButton();
	JButton button0 = new JButton();
	
	String good;
	String bad1;
	String bad2;
	String bad3;
	
	int random;
	int random1;
	int random2;
	int random3;
	
	ArrayList<JButton> buttons = new ArrayList<JButton>();

	public static void main(String[] args) {
		MineSweeper sweep = new MineSweeper();
		sweep.setup();
		sweep.ChoosingCorrect();
		sweep.GivingActionListeners();
	}

	public void setup() {
		frame.add(panel);
		panel.setLayout(new GridLayout(4, 4));

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button0);

		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		buttons.add(button5);
		buttons.add(button6);
		buttons.add(button7);
		buttons.add(button8);
		buttons.add(button9);
		buttons.add(button10);
		buttons.add(button11);
		buttons.add(button12);
		buttons.add(button13);
		buttons.add(button14);
		buttons.add(button15);
		buttons.add(button0);

		
		
		frame.setSize(600, 500);
		frame.setVisible(true);

	}

	public void ChoosingCorrect() {
		Random rand = new Random();
		random = rand.nextInt(15);
		System.out.println(random);
		//buttons.get(random).setText("Correct");
		good = buttons.get(random).getName();
		
		
		random1 = rand.nextInt(15);
		if (random1 != random) {
			//buttons.get(random1).setText("Bad1");
			bad1 = buttons.get(random1).getName();
		}
		 random2 = rand.nextInt(15);
		if (random2 != random1 && random2 != random) {
			//buttons.get(random2).setText("bad2");
			bad2 = buttons.get(random2).getName();
		}

		random3 = rand.nextInt(15);
		if (random3 != random1 && random3 != random && random3 != random2) {
			//buttons.get(random3).setText("bad3");
			bad3 = buttons.get(random3).getName();
			
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == buttons.get(random)) {
			System.out.println("WINNER");
			buttons.get(random).setText("You win!");
		}else if(buttonPressed == buttons.get(random1)) {
			System.out.println("YOU LOST. you chose random1");
			buttons.get(random1).setText("YOU LOSE");
		}else if(buttonPressed == buttons.get(random2)) {
			System.out.println("YOU LOST. you chose random2");
			buttons.get(random2).setText("YOU LOSE");
		}else if(buttonPressed == buttons.get(random3)) {
			System.out.println("YOU LOST. you chose random3");
			buttons.get(random3).setText("YOU LOSE");
		}else {
			System.out.println("You chose an innocent button");
			for (int i = 0; i < buttons.size(); i++) {
				if(buttonPressed == buttons.get(i)) {
					buttons.get(i).setText("Innocent Button");
				}
			}
		}
	}

	
	public void GivingActionListeners() {
		for (int i = 0; i <= 15; i++) {
			buttons.get(i).addActionListener(this);
		}
	}
	
	
	
	
	
	
}
