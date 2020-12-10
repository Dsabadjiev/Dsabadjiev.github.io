/*@author:Daniel Abadjiev
 * @date: 12/14/2018
 * @description: This solves the 2018 ACSL Senior Division programming problem.
 */
import java.util.Scanner;
public class ACSLProblem {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		for (int i=1; i<=5; i++){
			String inputString=console.next();
			int n=console.nextInt();
			System.out.println(findSums(inputString, n));
		}

	}
	public static long findSums(String inputString, int n){
		inputString=adjustString(inputString, n);
		long sum=0;
		for (int i=0; i<inputString.length(); i+=n){
			long num=Integer.parseInt(inputString.substring(i, i+n));
			sum+=num;
		}
		return sum;
	}
	public static String adjustString(String inputString, int n){
		while (inputString.length()%n!=0)
			inputString=inputString+"0";
		return inputString;
	}

}
