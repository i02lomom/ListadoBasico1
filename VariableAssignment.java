package ListadoBasico1;
/**
 * Class VariableAssignment
 *
 * Create the class VariableAssignment with the following code.
 * Correct this if it's necesary and comment it in the same source code,
 * indicating errors and variable values
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class VariableAssignment{
	public static void main(String[]args) { 
		{
			int i;	/* The variable has not been initialized.
					We must give a value to i */

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
