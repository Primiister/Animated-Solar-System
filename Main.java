import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

/** Main
 * This is the main method where the solar system objects are declared and ran.
 * @author Thomas Staunton
 */

public class Main {
	
	/**
	 * This method generates a random number using the Random class
	 * @param min The minimum possible random number produced
	 * @param max The maximum possible random number produced
	 */

	public static int randomNumber(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	private static final int Sun = 1;
	private static final int Mercury = 2;
	private static final int Venus = 3; // Variables which mean the same as array numbers for more readability
										
	private static final int Earth = 4;
	private static final int Mars = 5;
	private static final int Jupiter = 6;

	private static final int EarthMoon = 7;
	private static final int Phobos = 8; // The moons of Earth and Mars
	private static final int Deimos = 9;

	private static final int IO = 10;
	private static final int Europa = 11; 
	private static final int Ganymede = 12;
	private static final int Callisto = 13; // The Galilean moons of Jupiter
	
	
	private static final int asteroidNo = 200; //set the number of asteroids here
	
	private static final int ObjectNum = 14; //the number of objects (not including asteroids) in the array
	
	private static final int ObjectLimit = asteroidNo + ObjectNum; //the number of objects (including asteroids) in the array
	

	static SolarSystem Sol1 = new SolarSystem(2000, 1050);  //Solar System declaration 
	

	static CelestialEntity[] solarList = new CelestialEntity[ObjectLimit]; 
	//Declaration of the solarList, this list uses polymorphism as every object contained in a sub class of Celestial entity
	

	public static void main(String[] args) {

		solarList[Sun] = new Sun(0, 70, "YELLOW", 0, 0);

		solarList[Mercury] = new Planet(50, 8, "WHITE", 20, 4);
		solarList[Venus] = new Planet(100, 18, "ORANGE", 20, -3);
		solarList[Earth] = new Planet(200, 20, "BLUE", 20, 3);    //Declaring planet objects in the array
		solarList[Mars] = new Planet(300, 14, "RED", 20, 2);
		solarList[Jupiter] = new Planet(500, 40, "RED", 20, 1);

		solarList[EarthMoon] = new Moon(solarList[Earth], 30, 7, "GREY", 0, 5);
		solarList[Phobos] = new Moon(solarList[Mars], 20, 6, "ORANGE", 0, 5); //Declaring Moon objects in the array
		solarList[Deimos] = new Moon(solarList[Mars], 27, 5, "GREY", 0, 4);

		solarList[IO] = new Moon(solarList[Jupiter], 25, 4, "YELLOW", 0, 6);
		solarList[Europa] = new Moon(solarList[Jupiter], 30, 3, "ORANGE", 10, 5);
		solarList[Ganymede] = new Moon(solarList[Jupiter], 35, 10, "DARK GREY", 40, 4); //Declaring Jupiter's Moon objects in the array
		solarList[Callisto] = new Moon(solarList[Jupiter], 45, 6, "GREY", 200, 3);
		

		for (int i = 0; i < asteroidNo; i++) { // Asteroid generator
			solarList[i + 14] = new Planet(randomNumber(350, 450), 5, "GREY", randomNumber(1, 360), 5); 
		} // Asteroids are minor planets according to wikipedia so I used the Planet class to remove bloat

		
		while (true) { //Every loop is a frame of the solar system

			for (int i = 1; i < ObjectLimit; i++) { // Loops through every object in the array 
				solarList[i].drawEntity(Sol1);   //Draws each object to the solar system 
				solarList[i].move();           //Moves the object around the solar system
			}

			Sol1.finishedDrawing(); 

		}

	}

}
