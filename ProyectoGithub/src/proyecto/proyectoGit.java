package proyecto;

import java.util.Scanner;

public class proyectoGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		double ladoA,ladoB,hipotenusa,perimetro;
		
		System.out.println("Escribe Lado A: ");
		ladoA=teclado.nextDouble();
		System.out.println("Escribe Lado B: ");
		ladoB=teclado.nextDouble();
		
		hipotenusa=Math.sqrt(Math.pow(ladoA,2)+Math.pow(ladoB, 2));
		
		
		System.out.println("La hipotenusa es: "+hipotenusa);
		
		perimetro=ladoA+ladoB+hipotenusa;
		
		System.out.println("La hipotenusa es" + hipotenusa);
		
		System.out.println("El perimetro es" + perimetro);
		
		
	teclado.close();	
	}

}
