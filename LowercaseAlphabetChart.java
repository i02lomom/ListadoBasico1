package ListadoBasico1;
/**
 * Class LowercaseAlphabetChart
 *
 * Create class LowercaseAlphabetChart that shows the following output.
 * To do this use the method System.out.print() with characters \n and \t.
 * You must use a char variable with the Unicode code to show the letter ñ.
 * Do not use \udddd.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
class LowercaseAlphabetChart{
	public static void main(String[] args){
		char enye=241;

		System.out.println("This is a chart with the lowercase alphabet: \n"+
			"\ta\tb\tc\td\n" +
			"\te\tf\tg\th\n" +
			"\ti\tj\tk\tl\n" +
			"\tm\tn\t"+enye+"\to\n" +
			"\tp\tq\tr\ts\n" +
			"\tt\tu\tv\tw\n" +
			"\tx\ty\tz\n");
	}
}
