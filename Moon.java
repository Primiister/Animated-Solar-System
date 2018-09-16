/**
 * Class inherits from CelestialEntity, moon objects are created here
 * and are drawn onto the solar system (as the draw and move methods are inherited.)
 * @author staunton
 *
 */

public class Moon extends Planet {
	CelestialEntity parent;

	public Moon(CelestialEntity parent, double distance, double diameter, String colour, double angle, double speed) {
		super(distance, diameter, colour, angle, speed);
		this.parent = parent;

	}
	
/**
 * This method overrides the drawEntity method of CE so that the moons can orbit planets
 * parent means the parent planet in this case.
 * @param Sol is the solar system object which is used to draw things onto
 */
	void drawEntity(SolarSystem Sol) { 
										

		Sol.drawSolarObjectAbout(this.getDistance(), this.angle, this.getDiameter(), this.getColour(),
				parent.getDistance(), parent.getAngle());

	}

}
