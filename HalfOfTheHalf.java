/*
SPOJ CODE -> STRHH
Given a sequence of 2*k characters, please print every second character from the first half of the sequence. Start printing with the first character.

Input

In the first line of input your are given the positive integer t (1<=t<=100) - the number of test cases. In the each of the next t lines, you are given 
a sequence of 2*k (1<=k<=100) characters.

Output

For each of the test cases please please print every second character from the first half of a given sequence (the first character should appear).

Example

Input:
4
your 
progress 
is 
noticeable

Output:
y
po
i
ntc
*/
import java.util.*;
import java.lang.*;
 
class Main {
	public static void main(String[] args) throws java.lang.Exception {
		try {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			while (num >= 0) {
				String s = sc.next();
				s = s.substring(0, s.length() / 2);
				for (int i = 0; i < s.length(); i += 2) {
					System.out.print(s.charAt(i));
				}
				System.out.println();
				num--;
			}
		} catch (Exception ex) {
			return;
		}
	}
}