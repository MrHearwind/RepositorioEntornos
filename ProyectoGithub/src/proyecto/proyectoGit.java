package proyecto;

import java.util.Scanner;

public class proyectoGit {

	private double a;
	private double b;

	public proyectoGit(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double hipotenusa() {

		double hipotenusa;

		hipotenusa = Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));

		return hipotenusa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		proyectoGit triangulo;
		double ladoA, ladoB, hipotenusa;

		System.out.println("Escribe Lado A: ");
		ladoA = teclado.nextDouble();
		System.out.println("Escribe Lado B: ");
		ladoB = teclado.nextDouble();

		triangulo = new proyectoGit(ladoA, ladoB);

		hipotenusa=	triangulo.hipotenusa();
		System.out.println("La hipotenusa es: "+hipotenusa);
		
		
	teclado.close();	
	}

}
