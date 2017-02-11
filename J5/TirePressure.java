import java.io.*;

public class TirePressure {
	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader (System.in);
		BufferedReader stdin = new BufferedReader (inStream);
		String inData;

	int frontLeft, frontRight, backLeft, backRight;
	
	boolean bolFront1, bolFront2, bolBack1, bolBack2; // decalres variables
		
	String pressureSay = "Tire inflation is the same: ";
	String pressureSayNot = "Tire inflation is NOT the same: ";
	String tireRange = "Tire inflation is within the specified range of 32 and 38 psi: ";
	String tireRangeNot = "Tire inflation is NOT within the specified range of 32 and 38 psi: ";
	String inflation = "Tire inflation is OK";
	String rangePerTire = "Tire out of range: ";
	
	System.out.println("Enter tire pressure of your front left tire.");  // asks user to input first front tire pressure
		inData = stdin.readLine();
		frontLeft = Integer.parseInt(inData);
	
	System.out.println("Enter tire pressure of your front right tire."); // asks user to input second front tire pressure
		inData = stdin.readLine();
		frontRight = Integer.parseInt(inData);
		
	System.out.println("Enter tire pressure of your back left tire."); // asks user to input first back tire pressure
		inData = stdin.readLine();
		backLeft = Integer.parseInt(inData);
	
	System.out.println("Enter tire pressure of your back right tire."); // asks user to input second back tire pressure
		inData = stdin.readLine();
		backRight = Integer.parseInt(inData);
		
		
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
		if((frontLeft == frontRight) && (backLeft == backRight) && (bolFront1 && bolFront2 == true) && (bolBack1 && bolBack2 == true)) {  // if the 1st front tire equals 2nd front tire, AND 1st back tire equals 2nd back tire, AND all
			System.out.println(inflation);
		}
		
		if(frontLeft <= 32 || frontLeft >= 38) {
			System.out.println(rangePerTire + "front left");
		}
		if(frontRight <= 32 || frontRight >= 38) {
			System.out.println(rangePerTire + "front right");
		}
		if(backLeft <= 32 || backLeft >= 38) {
			System.out.println(rangePerTire + "back left");
		}
		if(backRight <= 32 || backRight >= 38) {
			System.out.println(rangePerTire + "back right");
		}
			
		
	}
	
}