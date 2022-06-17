package uk.ac.one;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class VSupply {

	public static void main(String[] args) throws IOException{
		
		//declare some variables
		
		double vSupply;
		double vForward;
		double iRated;
		double resistorValue;
		
		String resistorValueStr;
		String vForwardStr;
		String iRatedStr;
		
		//set up a reader form the console window
		BufferedReader console =
				new BufferedReader (new InputStreamReader(System.in));
		
		//read in values interactively from the command line
		System.out.println("Please enter a value for the resistor value of the LED: ");
		resistorValueStr = console.readLine();
		resistorValue = Double.parseDouble(resistorValueStr);
		
		System.out.println("Please enter a value for the forward voltage of the LED:");
		vForwardStr = console.readLine();
		vForward = Double.parseDouble(vForwardStr);
		
		System.out.println("Please enter a value for the rated current of the LED: ");
		iRatedStr = console.readLine();
		iRated = Double.parseDouble(iRatedStr);
		
		
		//for debugging we want to display our values to make sure everything is ok
		System.out.println("We have: ");
		System.out.println("Resistor value = " + resistorValue);
		System.out.println("Forward Voltage = " + vForward);
		System.out.println("Rated Cureent = " + iRated);
		
		
		//Calculate our resistor value
		vSupply = vForward + (iRated * resistorValue);
		
		//Display  the value
		System.out.println("We need a " + vSupply + " Ohm resistor!");
				

	}

}
