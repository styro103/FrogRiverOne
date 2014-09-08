/*
 * Shaun Mbateng
 * Frog River 1
 * This program computes the time when a frog can jump across of river, given times of leaves falling.
 * This program has an O(N) time complexity.
 */
import java.util.Scanner;

public class FrogRiverOne 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		int posX; //Desired Finish Position
		int [] A; //Array of Values
		int len; //Length of Array
		int minute; //Minute Frog can Jump to Other Side
		Clocking Leaves = new Clocking();
		
		//Get Input Values
		System.out.print("Enter Desired Ending Position: ");
		posX = cin.nextInt();
		
		//Enter and Set Array Length
		System.out.print("Enter the Length of the Array: ");
		len = cin.nextInt();
		A = new int [len];
					
		//Fill Array
		for (int i=0; i<A.length; i++)
		{
			System.out.print("Enter Position At Minute "+i+": ");
			A[i] = cin.nextInt();
		}
		
		cin.close(); //Close cin, No Longer Needed
		minute = Leaves.getMinute(posX, A); //Call Function to get Minute, If Possible
		
		//Display Message
		System.out.println("");
		if (minute == -1)
			System.out.println("The frog cannot get to the other side with those leaves.");
		else
			System.out.println("The frog can get to the other side at "+minute+" minute(s).");
	}
}
