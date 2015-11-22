package ListadoBasico1;
/**
 * Class PotencyConversion
 *
 * Create the following class and justifies why the suffix float (f ó F) it is necesary:
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */

public class PotencyConversion{
	public static void main(String args[]){
		float f = 1e-39f;		// if we do not put the suffix it gives us an error
		double d = 1e-39;		// because that number would be taken as double

		System.out.println("float: " + f);
		System.out.println("double: " + d);
	}
}
