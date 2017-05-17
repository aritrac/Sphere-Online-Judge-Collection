/*
Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... 
rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

Example

The example of communication.

Input:
3
15
42

Output:
3
15
42
*/
import java.util.*;
import java.lang.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		while(true){
			int input = sc.nextInt();
			System.out.println(input);
			if(input == 42)
				break;
		}
	}
}