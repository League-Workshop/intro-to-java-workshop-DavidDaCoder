package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FirstRobotProgram {
	
public static void main(String[] args) {
	Robot c3po = new Robot();
	c3po.setSpeed(100);
	c3po.setPenColor(Color.CYAN);
	c3po.penDown();
	c3po.miniaturize();
	for (int i = 0; i < 4; i++) {
		c3po.move(200);
		c3po.turn(90);		
	}

	c3po.penUp();
	c3po.turn(-90);
	c3po.move(200);
	c3po.turn(90);
	c3po.penDown();
	c3po.miniaturize();
	c3po.move(200);
	c3po.turn(90);
	c3po.move(200);
	c3po.turn(90);
	c3po.move(200);
	c3po.turn(90);
	c3po.move(200);
	
}
}
