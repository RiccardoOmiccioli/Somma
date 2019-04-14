import java.util.Scanner ;

public class Somma {
public static void main ( String [] args ) {

	int n1, n2;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println(" Inserisci due numeri interi :");
	n1 = input.nextInt ();
	n2 = input.nextInt ();

	System.out.print("Somma : ");
	System.out.println(n1 + n2);
	
	input.close();
	}
}
