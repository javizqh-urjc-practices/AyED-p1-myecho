import edu.princeton.cs.algs4.*;

public class MyEcho {
	public static void main(String[] args) {
        // El array args es el input
	// Compruebo si se le han pasado argumentos
	if (args.length==0) {
		// Si no tiene argumento devuelve error
		System.err.println("usage: myecho arg...");
		System.exit(1);
	} else {
		// Si tiene argumentos, añado las tabulaciones y el final de linea
		System.out.print(args[0]);
		for (int i = 1; i < args.length; i++) {
			StdOut.print("\t");
			StdOut.print(args[i]);
		}
		StdOut.print("\n");
		System.exit(0);

		}
	}
}
