
public class Zvezde2 {
public static void main(String[] args) {

	int m, n, j, p = 0;

	do {

		System.out.println("Unesite prvi broj: ");

		m = TextIO.getInt();

		System.out.println("Unesite drugi broj: ");

		n = TextIO.getInt();

	} while (m < n || n % 2 == 0);

	int sredina = n / 2;
// crtanje prve dvije linije \/	
	for (int i = 1; i <= sredina; i++)

	{

		for (j = sredina + i; j >= 0; j--) {

			System.out.print(" ");
		}
		System.out.print("*");

		for (int s = 0; s < m / 5 * 3 + p; s++) {

			System.out.print(" ");
		}
		p -= 2;

		System.out.print("*");

		System.out.println();

		//crtanje srednje linije
		
	
	}
	
	
	for (int r = 0; r < m +2; r++){

		System.out.print("*");
	}
	System.out.println();

	p += 2;
	
}
}
