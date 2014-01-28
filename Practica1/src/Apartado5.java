
/**
 * @author Alan Turing <alan.turing@acm.org>
 * 
 *         Esta aplicación calcula el logaritmo Neperiano de su primer
 *         parámetro.
 */

public class Apartado5 {

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
	
		if (args.length < 1) {
			System.out.println("Se espera por lo menos 1 parametro");
			return;
		}
	
		double longitudCadena = args.length;
		double total=0;
		double x;
		int i = 0;
		
		while ( longitudCadena > 0 ) {
			
			String arg = args[i];
			x = Double.parseDouble(arg);
			total += x;
			System.out.println(" Elemento " + i + ": " + x );
			
			i++;
			longitudCadena -= 1;
		}
		
		
		double resultado = total/args.length;
		System.out.println("\n La media de todos los elementos es: " + resultado );
		
		
		if ((args.length % 2)==1)
				System.out.println("\n Has introducio un numero de elementos impar");
		else System.out.println("\n Has introducio un numero de elementos par");
		
	}
}
