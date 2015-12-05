/**
 * Clase ConversionExplicitaExtensora
 *
 * Crea la siguiente clase y justifica los resultados.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class ConversionExplicitaExtensora{
	public static void main(String args[]){
		byte b1=100, b2=100, b3;

		//conversión explícita
		b3= (b1 * b2 *b1/100);
		System.out.println("Con conversion Explicita: " + b3);

		//conversión extensora
		int n;
		n= b1 * b2 * b1/100;
		System.out.println("Con conversion Extensora: " + n);
	}
}
