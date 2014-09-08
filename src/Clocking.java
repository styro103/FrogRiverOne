/*
 * The class and function to solve for minute. If not possible for frog, it returns a -1.
 * If so, minute is returned. This runs in O(N).
 */
import java.util.Arrays; //Needed for Arrays.fill Method

class Clocking 
{
	public int getMinute(int X, int[] A) //Function to Return Earliest Minute
	{
		long [] count = new long [X]; //Array of Longs to Hold Count of Positions at Minutes
        
        Arrays.fill(count, 0); //Fill Array With Zeroes
        
        //This Function Uses Variable X to Keep Count of Zeroes
        
        for (int K=0; K<A.length; K++) //Loop Through Array A
        {
             count[A[K]-1] += 1; //Increment Count of Position at Minute K
             
             if (count[A[K]-1] == 1) //If Count of Position Became One, Decrement Count of Zeroes
                X--;
             
             if (X == 0) //If No More Zeros, Return Minute
                return K;
        }
        
        return -1; //No Way to Jump to Other Side If Reached
	}
}
