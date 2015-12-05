/**
 * Clase AsignacionVariables
 *
 * Crea una clase AsignacionVariables con el siguiente código.
 * Corrígela si es necesario y coméntala en el mismo código fuente,
 * indicando errores y valores de variables
 * 
 * @author Miguel Angel López Moyano
 */
public class AsignacionVariables{
	public static void main(String[]args) { 
		{
			int i;	/* La variable no ha sido inicializada.
					Debemos darle un valor a i */

			i=18;	/*El valor que debemos darle debe de
					estar dentro del rango byte ya que hay
					una conversión a byte
					*/

			byte b = (byte) i;
			System.out.println(i);
			System.out.println(b);
		}
	}
}
