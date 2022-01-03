/**
 * @author Anmol Tiwari
 */

package module3.guimodule;
import processing.core.*;

public class MyDisplay extends PApplet {
	public void setup() {
		size(500,500);
		background(200,200,200);
	}
	
	public void draw() {
		fill(255,255,0);
		ellipse(250,250, 490,490);
		fill(0,0,0);
		ellipse(150,175, 60,80);
		ellipse(350,175, 60,80);
		fill(255,255,255);
		arc(250,325, 225,150, 0 ,PI, CHORD);
		
		
	}
}
