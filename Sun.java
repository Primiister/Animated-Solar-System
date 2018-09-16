/**
 * Class inherits from CelestialEntity, Sun objects are created here
 * and are drawn onto the solar system (as the draw and move methods are inherited.)
 * @author staunton
 *
 */

public class Sun extends CelestialEntity {

	public Sun(double distance, double diameter, String colour, double angle, double speed) {
		super(distance, diameter, colour, angle, speed);
		
		// As everything is inherited from "ClestialEntity", this is all the  code needed for this class
		
	}

}
