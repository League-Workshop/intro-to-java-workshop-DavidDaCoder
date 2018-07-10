package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	
	// 2. Create a new Robot
	Robot c3po = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		c3po.setSpeed(100);
		c3po.setPenColor(Color.CYAN);
		c3po.penDown();
		c3po.miniaturize();

		// 5. Set the pen width to 5
c3po.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
	for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random

		c3po.setRandomPenColor();
		
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
	c3po.turn(90);
	
	}	
	}
	


	

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {
			c3po.move(200);
			c3po.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



