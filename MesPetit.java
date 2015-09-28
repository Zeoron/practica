package app.mespetit;
import java.util.Scanner;

public class MesPetit {

	private static final int NUMEROSPIDE = 10;

	public static void main(String[] args) {
		System.out.println("Introdueix " + NUMEROSPIDE + " valors");
		Scanner lector = new Scanner(System.in);
		int numeros [] = new int [NUMEROSPIDE];
		for (int i = 0; i<numeros.length;i++) {
			numeros[i] = lector.nextInt();
		}
		lector.close();
		int mesPetit = numeros[0];
		int mesGran = numeros[0];
		for (int i = 0; i<numeros.length-1;i++) {
			if (mesPetit>numeros[i+1]) {
				mesPetit = numeros[i+1];
			}
			if (mesGran<numeros[i+1]) {
				mesGran = numeros[i+1];
			}
		}
		System.out.println("El mes petit es el " + mesPetit);
		System.out.println("El mes gran es el " + mesGran);

	}

}
/*Aquest es el projecte 1*/
