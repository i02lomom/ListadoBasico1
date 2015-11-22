package ListadoBasico1;
/**
 * Class VariableOutOfRange
 *
 * If you assign a value to a variable out of range (greater than that established),
 * what happen? Is there any way to solve it? Demonstrate it with an example. 
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */

public class VariableOutOfRange{
	public static void main(String[]args) { 
		{
			int i= 1800; byte b= (byte)i;
			System.out.println("\nValue within range (int): " +i); // we show the value of i (int) 
			System.out.println("Value out of range (byte): " +b); // we show the value of b (byte)
		}
	}
}
