/**
 * Clase PotenciaConversion
 *
 * Crea la siguiente clase y justifica por qué el sufijo float (f ó F) es necesario:
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */

public class PotenciaConversion{
	public static void main(String args[]){
		//float f = (float)1e-39;
		float f = 1e-39f;
		double d = 1e-39;

		System.out.println("float: " + f);
		System.out.println("double: " + d);
	}
}
