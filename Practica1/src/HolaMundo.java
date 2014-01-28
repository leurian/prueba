/**
 * @author Alan Turing <alan.turing@acm.org>
 * 
 *         Esta aplicación calcula el logaritmo Neperiano de su primer
 *         parámetro.
 */

public class HolaMundo {

	/**
	 * Punto de entrada a la aplicación.
	 * 
	 * Este método imprime el logaritmo Neperiano del número que se le pasa como
	 * entrada
	 * 
	 * @param args
	 *            Los argumentos de la línea de comando. Se espera un número
	 *            como primer parámetro
	 */

	public static void main(String[] args) {
	
		if (args.length != 2) {
			System.out.println("Se esperan dos parametros exactamente");
			return;
		}
	
		
		
		String arg1 = args[0];
		String arg2 = args[1];
		// una variable String que obtiene el primer parametro
		
		double x = Double.parseDouble(arg1);
		double y = Double.parseDouble(arg2);
		// una variable double, que convierte arg a numerico
		
		double z = (x+y)/2;
		
		System.out.println("El logaritmo de " + arg1 + " es: " + z );
	}
}
