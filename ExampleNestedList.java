package ListadoBasico1;
/**
 * Class ExampleNestedList
 *
 * Create class ExampleNestedList that displays the following output.
 * To do this use the method System.out.print() with characters \n and \t
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
class ExampleNestedList{
	public static void main(String[] args){
		System.out.println("\nExample of a nested list in HTML: ");
		System.out.println("\t<ul>" +
			"\n\t\t<li>" +
			"\n\t\t<li>" +
			"\n\t\t<li>" +
			"\n\t\t\t<ul>" +
			"\n\t\t\t\t<li>" +
			"\n\t\t\t\t<li>" +
			"\n\t\t\t\t<li>" +
			"\n\t\t\t<\\ul>" +
			"\n\t<\\ul>" +
			"\n");
	}
}
