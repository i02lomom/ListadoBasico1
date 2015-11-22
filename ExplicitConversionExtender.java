package ListadoBasico1;
/**
 * Class ExplicitConversionExtender
 *
 * Create the following class and justify the results
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class ExplicitConversionExtender{
	public static void main(String args[]){
		byte b1=100, b2=100, b3;

		//explicit conversion
		b3= (b1 * b2 *b1/100);		// A byte can not store a big number
		System.out.println("With explicit conversion: " + b3);

		//extensor conversion
		int n;
		n= b1 * b2 * b1/100;
		System.out.println("With extensor conversion: " + n);
	}
}
