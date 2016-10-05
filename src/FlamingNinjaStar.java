import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;


/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variables in this recipe. 

 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */

public class FlamingNinjaStar {
  public static void main(String[] args) {

    int baseSize = 300;    //the size of the black part of the star
    int flameSize = 200;    //the length of the flaming arms

    // 1. Make a new robot, and set it's pen down
Robot rbmcgroup = new Robot();
    rbmcgroup.penDown();
    // *14. Use the methods setX and setY to move the ninja star into the center of the screen
    
    // *15. Make some adjustments to see what other kinds of shapes you can make.

    // 12. Set the robot speed to 10
    rbmcgroup.setSpeed(10);
    // 13. Make all the code below repeat 25 times
for (int  i = 0; i < 25; i++) {
	

      // 2. Turn the robot 1/8 of a circle
    rbmcgroup.turn(360/8);
      // 3. Move the robot 64 pixels
    rbmcgroup.move(64);
      
      // 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
    rbmcgroup.turn(-40);
    rbmcgroup.setPenColor(Color.YELLOW);
      // 5. Move the robot the distance in the variable flameSize
    rbmcgroup.move(flameSize);
      // 6. Turn the robot 170 degrees
    rbmcgroup.turn(170);
    rbmcgroup.setPenColor(Color.YELLOW);
      // 7. Move the robot the distance in the variable flameSize (again)
    rbmcgroup.move(flameSize);
      // 8. Turn the robot 64 degrees to the right
    rbmcgroup.turn(64);
      // 9. Move the robot the distance in the variable baseSize
    rbmcgroup.setPenColor(Color.BLACK);
    rbmcgroup.move(baseSize);
      // 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
      // 11. Color your ninja star like Figure 2.
}
  }

}




