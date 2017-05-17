/*
SPOJ CODE -> CPTTRN1
Using two characters: . (dot) and * (asterisk) print a chessboard-like pattern. The first character printed should be * (asterisk).

Input

You are given t < 100 - the number of test cases and for each of the test cases two positive integers: l - the number of lines and c - 
the number of columns in the pattern (l, c < 100).

Output

For each of the test cases output the requested pattern (please have a look at the example). Use one line break in between successive patterns.

Example

Input:
3
3 1
4 4
2 5

Output:
*
.
*

*.*.
.*.*
*.*.
.*.*

*.*.*
.*.*.
*/
import java.util.*;
import java.lang.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
			Scanner sc = new Scanner(System.in);
			int rows = sc.nextInt();
			char[] arr = {'*','.'};
			int printIndex = 0;
			while(rows > 0){
				int r = sc.nextInt();
				int c = sc.nextInt();
				for(int i = 0; i < r; i++){
					for(int j = 0; j < c; j++){
						System.out.print(arr[printIndex]);
						if(printIndex == 0){
							printIndex = 1;
						}else{
							printIndex = 0;
						}
					}
					if(c % 2 == 0){
						if(printIndex == 0){
							printIndex = 1;
						}else{
							printIndex = 0;
						}
					}
					System.out.println();
				}
				printIndex = 0;
				System.out.println();
				rows--;
			}
		} catch (Exception ex) {
			return;
		}
	}
}