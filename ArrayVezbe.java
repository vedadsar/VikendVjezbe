import java.util.Scanner;
public class ArrayVezbe {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	int [] nizInt;
	nizInt = new int[100];
	
	int zbir=0;
	for (int i=0; i<nizInt.length;i++){
		zbir=zbir +nizInt[i];
		
	}
	System.out.println(zbir);
}
}
