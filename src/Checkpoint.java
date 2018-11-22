import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	Robot R=new Robot();
	R.penDown();
	R.setSpeed(70);
	String color = JOptionPane.showInputDialog("What is your favorite color?");
JOptionPane.showInputDialog(null, color+" is my favorite color too!");
for (int i = 0; i < 3;  i++) {
	R.move(150);
	R.turn(120);
}
}
}
