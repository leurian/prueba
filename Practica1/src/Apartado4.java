
/**
 * @author Roberto Lopez Santoy
 * 
 *         Esta aplicación calcula la media de los 2 numeros introducidos por pantalla
 *        
 */

public class Apartado4 {

	/**
	 * Punto de entrada a la aplicación.
	 * 
	 * Este método calcula la media de los 2 numeros introducidos por pantalla
	 * 
	 * 
	 * @param args
	 *            Los argumentos de la línea de comando. Se esperan 2 numeros como parametros.
	 *           
	 */

	public static void main(String[] args) {
	
		if (args.length != 2) {
			System.out.println("\n Se esperan dos parametros exactamente");
			return;
		}
	
		
		
		String arg1 = args[0];
		String arg2 = args[1];
		// Dos variables String que obtienen los 2 parametros introducidos
		
		double x = Double.parseDouble(arg1);
		double y = Double.parseDouble(arg2);
		// Dos variables double, que convierten los argumentos a double
		
		double media = (x+y)/2;
		
		System.out.println("\n La media de los numeros introducidos es " + media );
	}
}