/*
SPOJ CODE -> CPTTRN2
Using two characters: . (dot) and * (asterisk) print a frame-like pattern.

Input

You are given t - the number of test cases and for each of the test cases two positive integers: l - the number of lines and c - the number of columns of a frame.

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
*
*

****
*..*
*..*
****


*****
*****
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
			while(rows > 0){
				int r = sc.nextInt();
				int c = sc.nextInt();
				for(int i = 0; i < r; i++){
					for(int j = 0; j < c; j++){
						if(i == 0 || i == r - 1 || j == 0 || j == c - 1){
							System.out.print("*");
						}else{
							System.out.print(".");
						}
					}
					System.out.println();
				}
				System.out.println();
				rows--;
			}
			sc.close();
		} catch (Exception ex) {
			return;
		}
	}
} 