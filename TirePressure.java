import java.io.*;

public class TirePressure {
	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader (System.in);
		BufferedReader stdin = new BufferedReader (inStream);
		String inData;
	
	/*
	 * TO DO: MAKE IF ELSE STATEMENTS FOR EACH TIRE, CHANGE TIRE # TO LEFT AND RIGHTS
	 * 
	 */
		
		
	int frontTire1, frontTire2, backTire1, backTire2;
	
	int bothFrontTires, bothBackTires;      // declares variables
	boolean bolFront1, bolFront2, bolBack1, bolBack2; // decalres variables
		
	String pressureSay = "Tire inflation is the same: ";
	String pressureSayNot = "Tire inflation is not the same: ";
	String tireRange = "Tire inflation is within the specified range of 32 and 38 psi: ";
	String tireRangeNot = "Tire inflation is not within the specified range of 32 and 38 psi: ";
	String inflation = "Tire inflation is ok";
	String rangePerTire = "Tire out of range: ";
	
	System.out.println("Enter tire pressure of your first FRONT tire.");  // asks user to input first front tire pressure
		inData = stdin.readLine();
		frontTire1 = Integer.parseInt(inData);
	
	System.out.println("Enter tire pressure of your second FRONT tire."); // asks user to input second front tire pressure
		inData = stdin.readLine();
		frontTire2 = Integer.parseInt(inData);
		
	System.out.println("Enter tire pressure of your first BACK tire."); // asks user to input first back tire pressure
		inData = stdin.readLine();
		backTire1 = Integer.parseInt(inData);
	
	System.out.println("Enter tire pressure of your first BACK tire."); // asks user to input second back tire pressure
		inData = stdin.readLine();
		backTire2 = Integer.parseInt(inData);
		
		
		if(frontTire1 == frontTire2)              // if the first front tire pressure equals the second front tire pressure..
			system.out.println(pressureSay + "front");    // it will say that the tire pressure is the same in the front
		else
			sysout.out.println(pressureSayNot + "front");  // or else it will say its not
	
		if(backTire1 == backTire2)      // if the first back tire pressure equals the second back tire pressure..
			system.out.println(pressureSay + "back");   // it will display that the tire pressure is the same in the front
		else
			sysout.out.println(pressureSayNot + "back");   // or else it will say its not
										
		  
		if( (frontTire1 >= 32 && frontTire1 <= 38) && (frontTire2 >= 32 && frontTire2 <= 38) )    // if the first AND second front tire is between 32 and 38 PSI..
			system.out.println(tireRange + "front"); // it will display that tire pressure is in the specified range
			bolFront1 = true;
			bolFront2 = true;  // and will make the two front tire booleans as true
		else
			system.out.println(tireRangeNot + "front"); // if not, it will say its not in the specified range..
			bolFront1 = false;
			bolFront2 = false;   // and will make the two front tire booleans as false
		
		if( (backTire1 >= 32 && backTire1 <= 38) && (backTire2 >= 32 && backTire2 <= 38) )   // if the first AND second back tire is between 32 and 38 PSI..
			system.out.println(tireRange + "back");  // it will display that tire pressure is in the specified range
			return bolBack1 && bolBack2 == true;  // and will make two back tire booleans as true
		else
			system.out.println(tireRangeNot + "back");  // if not, it will say its not in the specified range..
			bolBack1 = false;
			bolBack2 = false;   // and will make two back tire booleans as false

		
		if((frontTire1 == frontTire2) && (backTire1 == backTire2) && (bolFront1 && bolFront2 == true) && (bolBack1 && bolBack2 == true))  // if the 1st front tire equals 2nd front tire, AND 1st back tire equals 2nd back tire, AND all
			system.out.println(inflation);
		else
			system.out.println("Tire inflation is NOT ok");
	}
	
}