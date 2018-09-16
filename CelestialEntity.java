/**
 * This is the point in space class we were asked to make but I thought this was a better name.
 * It is an abstract class which every other class ultimately inherits its methods and variables from.
 * @author staunton
 *
 */

public abstract class CelestialEntity {
	
	


	protected double distance;
	protected double angle;
	protected double diameter;   // Variable declarations
	protected String colour;
	protected double speed;

	public CelestialEntity(double distance, double diameter, String colour, double angle, double speed) {

		this.distance = distance;
		this.angle = angle;
		this.diameter = diameter; //Setting the arguments to this objects instance of these variables 
		this.colour = colour;
		this.speed = speed;
	}
	
	/** 
	 * Draws the entity to the solar system
	 * @param Sol is the solar system object which is used to draw things onto
	 */
	void drawEntity(SolarSystem Sol) { //Draws the entity to the solar system
		Sol.drawSolarObject(this.distance, this.angle, this.diameter, this.colour);

	}
	
	/**
	 * Moves the entity around the solar system
	 * @return the angle of this entity
	 */

	public double move() { // When ran in a while loop this will change the angle of the planet making it move

		angle = speed + angle; 
								
		return this.angle;

	}
	
	/**
	 * Allows the user to get the speed of the entity
	 * @return returns the speed
	 */

	double getSpeed() { // Gets the speed of the entity
		return this.speed; 
	}
	
	/**
	 * Allows the user to get the speed of the entity
	 * @return returns the speed
	 */

	double getAngle() {
		return this.angle;
	}
	
	/**
	 * Allows the user to get the diameter of the entity
	 * @return returns the diameter
	 */

	double getDiameter() { // Gets the diameter of the entity
		return this.diameter; 
	}
	
	/**
	 * Allows the user to get the colour of the entity
	 * @return returns the colour
	 */

	String getColour() { // Gets the colour of the entity
		return this.colour; 
	}
	
	/**
	 * Allows the user to get the colour of the distance
	 * @return returns the distance
	 */

	double getDistance() { // Gets the objects distance from the center of the solar system
		return this.distance; 
								
	}

}
