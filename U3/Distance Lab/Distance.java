//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.lang.Math;
public class Distance
{
	public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	{
		return Math.sqrt((xOne-xTwo)*(xOne-xTwo) + (yOne-yTwo)*(yOne-yTwo));	
	}
}