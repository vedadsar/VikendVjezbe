/**Napišite program koji za prirodan broj n unesen sa tastature nalazi i ispisuje n-ti po redu prost broj.
 Na primjer, ukoliko se unese n = 30, program treba da ispiše 113, jer je 113 trideseti po redu prost
 broj.

 */

import java.util.Scanner;

public class NtPrimeTest {
	public static void main(String[] args) {

		int num;
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite broj ");
		num = in.nextInt();
		int brojac = 0;

		for (int i = 3; brojac < num; i++) {

			int n;
			int razlika = 0;
			
			for (n = 2; n < i; i++) {

				if (i %n == 0) {
					razlika = 1;
				}
			
			if (razlika == 1) {
				            
				
				
			}
				
			
			if(razlika == 0){
					System.out.println("broj " + i + "je prime");
					brojac = brojac + 1;
			}
		

			

		

	

			}
			
		}
		System.out.println(brojac);
	}
}