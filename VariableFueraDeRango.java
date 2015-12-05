/**
 * Clase VariableFueraDeRango
 *
 * Si se asigna un valor a una variable fuera de rango (mayor de lo establecido),
 * ¿qué ocurre? ¿Existe alguna manera de resolverlo? Demuéstralo mediante un ejemplo. 
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */

public class VariableFueraDeRango{
	public static void main(String[]args) { 
		{
			int i= 1800; byte b= (byte)i;
			System.out.println("\nValor dentro de rango (int): " +i); //mostramos el valor de i (int) 
			System.out.println("Valor fuera de rango (byte): " +b); //mostramos el valor de b (byte)
		}
	}
}
