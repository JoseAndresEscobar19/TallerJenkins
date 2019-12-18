/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prima;

import java.util.Scanner;

/**
 * Programa Principal
 * 
 * @author joseandres
 */
public class PRIMAv2 {

	private static final String NEGATIVE_POINTS = "Cantidad de puntos no puede ser negativa";
	private static final String HIGHER_MAX = "Valor fuera del rango de puntos permitido";
	private static final String NO_POINTS = "No puede ser asegurado por falta de puntos en la licencia.";
	private int reduccion;
	private float factorEdad;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "utf-8");
		
		String edad_c;
		String puntos_c;
		int edad = 0;
		int puntos = 0;

		while (true) {
			System.out.print("Ingrese la edad del conductor: ");
			edad_c = sc.nextLine();
			try {
				edad = Integer.parseInt(edad_c);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Entrada no válida");
			}
		}
		while (true) {
			System.out.print("Ingrese los puntos de licencia del conductor: ");
			puntos_c = sc.nextLine();
			try {
				puntos = Integer.parseInt(puntos_c);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Entrada no válida");
			}
		}
		sc.close();

		PRIMAv2 primav2 = new PRIMAv2();
		try {
			float prima = primav2.calcularPrima(edad, puntos);
			System.out.println("Valor a pagar: " + prima);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Setea los valores de factor_edad y reduccion segun la condicion basado en la
	 * edad y puntos
	 * 
	 * @param edad   Entero que representa la edad del conductor
	 * @param puntos Entero que representa los puntos del conductor
	 */
	public void getReduccion_Factor_Edad(int edad, int puntos) {

		if (edad >= 18 && edad < 25) {
			this.factorEdad = 2.8f;
			if (puntos >= 30 - 1) {
				this.reduccion = 50;
			}
		} else if (edad >= 25 && edad < 35) {
			this.factorEdad = 1.8f;
			if (puntos >= 30 - 3) {
				this.reduccion = 50;
			}
		} else if (edad >= 35 && edad < 45) {
			this.factorEdad = 1.0f;
			if (puntos >= 30 - 5) {
				this.reduccion = 100;
			}
		} else if (edad >= 45 && edad < 65) {
			this.factorEdad = 0.8f;
			if (puntos >= 30 - 7) {
				this.reduccion = 150;
			}
		} else if (edad >= 65 && edad <= 90) {
			this.factorEdad = 1.5f;
			if (puntos >= 30 - 5) {
				this.reduccion = 200;
			}
		}
	}

	/**
	 * Calcula el valor final a pagar basado en la edad y los puntos
	 * 
	 * @param edad   Entero que representa la edad del conductor
	 * @param puntos Entero que representa los puntos del conductor
	 * @return un flotante con el cálculo del valor final a pagar para el seguro.
	 */
	public float calcularPrima(final int edad, final int puntos) {
		float tarifa_basica = 500f;
		if (edad < 18 || edad > 90) {
			throw new InvalidEdadException();
		}
		if (puntos > 30) {
			throw new InvalidPuntosException(HIGHER_MAX);
		} else if (puntos < 0) {
			throw new InvalidPuntosException(NEGATIVE_POINTS);
		} else if (puntos == 0) {
			throw new InvalidPuntosException(NO_POINTS);

		} else {
			getReduccion_Factor_Edad(edad, puntos);
			float prima = tarifa_basica * this.factorEdad - this.reduccion;
			return prima;
		}
	}
}