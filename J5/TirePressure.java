import java.io.*;

public class TirePressure {
	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader (System.in);
		BufferedReader stdin = new BufferedReader (inStream);
		String inData;	// declares inData string for the input

	int frontLeft, frontRight, backLeft, backRight;		// declares integers
	
	boolean bolFront1, bolFront2, bolBack1, bolBack2; // declares booleans
		
	String pressureSay = "Tire inflation is the same: ";	// declaring and initializing all the Strings 
	String pressureSayNot = "Tire inflation is NOT the same: ";
	String tireRange = "Tire inflation is within the specified range of 32 and 38 psi: ";
	String tireRangeNot = "Tire inflation is NOT within the specified range of 32 and 38 psi: ";
	String inflation = "Tire inflation is OK";
	String rangePerTire = "Tire out of range: ";
	
	System.out.println("Enter tire pressure of your front left tire.");  // asks user to input first front tire pressure
		inData = stdin.readLine();
		frontLeft = Integer.parseInt(inData);	// declares the integer frontLeft as the input data
	
	System.out.println("Enter tire pressure of your front right tire."); // asks user to input second front tire pressure
		inData = stdin.readLine();
		frontRight = Integer.parseInt(inData);	// declares the integer frontRight as the input data
		
	System.out.println("Enter tire pressure of your back left tire."); // asks user to input first back tire pressure
		inData = stdin.readLine();
		backLeft = Integer.parseInt(inData);	// declares the integer backLeft as the input data
	
	System.out.println("Enter tire pressure of your back right tire."); // asks user to input second back tire pressure
		inData = stdin.readLine();
		backRight = Integer.parseInt(inData);	// declares the integer backRight as the input data
		
		
		if(frontLeft == frontRight) {             // if the first front tire pressure equals the second front tire pressure..
			System.out.println(pressureSay + "front");    // it will say that the tire pressure is the same in the front
		}
		else {
			System.out.println(pressureSayNot + "front");  // or else it will say its not
		}
		if(backLeft == backRight) {      // if the first back tire pressure equals the second back tire pressure..
			System.out.println(pressureSay + "back");   // it will display that the tire pressure is the same in the front
		}
		else {
			System.out.println(pressureSayNot + "back");   // or else it will say its not
		}								
		  
		if( (frontLeft >= 32 && frontLeft <= 38) && (frontRight >= 32 && frontRight <= 38) ) {  // if the first AND second front tire is between 32 and 38 PSI..
			System.out.println(tireRange + "front"); // it will display that tire pressure is in the specified range
			bolFront1 = true;
			bolFront2 = true;  // and will make the two front tire booleans as true
		}
		else {
			System.out.println(tireRangeNot + "front"); // if not, it will say its not in the specified range..
			bolFront1 = false;
			bolFront2 = false;   // and will make the two front tire booleans as false
		}
		if( (backLeft >= 32 && backLeft <= 38) && (backRight >= 32 && backRight <= 38) ) {   // if the first AND second back tire is between 32 and 38 PSI..
			System.out.println(tireRange + "back");  // it will display that tire pressure is in the specified range
			bolBack1 = true;
			bolBack2 = true;  // and will make two back tire booleans as true
		}
		else {
			System.out.println(tireRangeNot + "back");  // if not, it will say its not in the specified range..
			bolBack1 = false;
			bolBack2 = false;   // and will make two back tire booleans as false
		}
		if((frontLeft == frontRight) && (backLeft == backRight) && (bolFront1 && bolFront2 == true) && (bolBack1 && bolBack2 == true)) {  // if all 3 conditions are true..
			System.out.println(inflation);	// it will say that tire inflation is OK
		}
		
		if(frontLeft <= 32 || frontLeft >= 38) {		// if the front left tire is out of PSI range
			System.out.println(rangePerTire + "front left");	// it will let you know 
		}
		if(frontRight <= 32 || frontRight >= 38) {		// if the front right tire is out of PSI range
			System.out.println(rangePerTire + "front right");	// it will let you know 	
		}
		if(backLeft <= 32 || backLeft >= 38) {			// if the front right tire is out of PSI range
			System.out.println(rangePerTire + "back left");		// it will let you know 		
		}
		if(backRight <= 32 || backRight >= 38) {		// if the front right tire is out of PSI range
			System.out.println(rangePerTire + "back right");	// it will let you know 	
			
		}
	}
}