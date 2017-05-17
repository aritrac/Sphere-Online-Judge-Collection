/*
SPOJ CODE -> DPRSDCDR
Tinni is passionate about coding. But due to classes, CTs, and lab report, everyday she cannot code for at least three hours as suggested by Sadivai. 
So, sometimes she becomes depressed. But when she is able to code up to the mark she is jolly. Everyday Tinni eats, sleeps and does other household 
chores for 10 hours. She spends rest of her day attending classes, writing lab reports and preparing for CTs. And if there's time she smiles and does 
programming. Tinni's BF knows this fact but as he is illiterate he cannot calculate. So he seeks your help to make a program which can calculate whether 
Tinni will be jolly or depressed based on the input data.

Input

The input contains a number (1≤ N ≤ 1000 ) at the first line representing the number of test case. The next N lines contain 5 integers each, 
representing number of CT (0 ≤ nCT ≤3), number of Lab Reports (0 ≤ nLab ≤ 3), time required for each CT preparation (1≤ tCT≤ 5) hours, time required 
for each Lab Report writing (1 ≤ tLab ≤ 5) hours and time for attending classes (3 ≤ tCls ≤8) hours.

Output

For each test cases print "Khushi" (means Jolly in Bengali) or "Hotash" (means Depressed in Bengali) in a new line.

Example

Input:

2
2 2 3 1 6
1 2 1 2 3


Output:

Hotash
Khushi
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
				int numberOfCTs = sc.nextInt();
				int numberOfLabReports = sc.nextInt();
				int timeForCTs = sc.nextInt();
				int timeForLabReports = sc.nextInt();
				int timeForClasses = sc.nextInt();
				
				if((numberOfCTs * timeForCTs) + (numberOfLabReports * timeForLabReports) + timeForClasses < 14){
					System.out.println("Khushi");
				}else{
					System.out.println("Hotash");
				}
				rows--;
			}
		} catch (Exception ex) {
			return;
		}
	}
} 