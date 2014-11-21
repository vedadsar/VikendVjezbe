import java.util.Scanner;

public class PrintSquareAndTriangle {

	public static void main(String[] args) {
      
		Scanner in = new Scanner(System.in);
		
		int m, n, j, p=0;

          do{
        	  System.out.println("Unesi a");
        	  n = in.nextInt();
        	  System.out.println("Unesi b");
        	  m = in.nextInt();
          }while( m<n || n%2==0);
        	  int sredina=n/2;
        	  for(int i=1; i<=sredina; i++){
        		  for(j=sredina-1; j>0;j--)
        			 System.out.println(" ");
        		 System.out.println("*");
        	     for(int s=0; s<m/5*3+p; s++)
        	    	 System.out.println(" ");
        	     p+=2;
        	     System.out.println("*");
        	     System.out.println();
        	    		 
        		  
        	  }  
         	  
        	  
          




	}
}