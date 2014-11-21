/**Napišite program koji za prirodan broj n unesen sa tastature nalazi i ispisuje n-ti po redu prost broj.
 Na primjer, ukoliko se unese n = 30, program treba da ispiše 113, jer je 113 trideseti po redu prost
 broj.

 */

import java.util.Scanner;

public class NtiPrime {
	public static void main(String[] args) {

		int num;
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite broj ");
		num = in.nextInt();
		int brojac = 0;
		int razlika = 0;
        boolean notPrime =true;
		
        for (  int i=2; i<num*num; i++)
		{
			notPrime=true;
			for (int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					notPrime=false;
			
			}
			}
			
			if (notPrime==true)
			{
				brojac++;
				if (brojac==num)
				{
					System.out.println(i);
				}
			}
			
		}
		

	}

}