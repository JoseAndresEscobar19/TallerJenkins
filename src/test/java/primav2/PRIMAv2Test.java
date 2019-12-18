package primav2;

import static org.junit.Assert.*;

import org.junit.Test;

import prima.InvalidEdadException;
import prima.InvalidPuntosException;
import prima.PRIMAv2;

public class PRIMAv2Test {

	public PRIMAv2Test() {
	}
	
	
	@Test(expected = InvalidEdadException.class)
	public void testCalcularPrima_1() {
		System.out.println("calcularPrima");
		int edad = 17;
		int puntos =30;
		PRIMAv2 instance = new PRIMAv2();
		float expResult = 750;
		float result = instance.calcularPrima(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	@Test(expected = InvalidEdadException.class)
	public void testCalcularPrima_7() {
		System.out.println("calcularPrima");
		int edad = 94;
		int puntos =30;
		PRIMAv2 instance = new PRIMAv2();
		float expResult = 750;
		float result = instance.calcularPrima(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	@Test
	public void testCalcularPrima_2() {
		System.out.println("calcularPrima");
		int edad = 20;
		int puntos =30;
		PRIMAv2 instance = new PRIMAv2();
		float expResult = 1350;
		float result = instance.calcularPrima(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	@Test(expected = InvalidPuntosException.class)
	public void testCalcularPrima_3() {
		System.out.println("calcularPrima");
		int edad = 35;
		int puntos = -1;
		PRIMAv2 instance = new PRIMAv2();

		instance.calcularPrima(edad, puntos);
	
		// TODO review the generated test code and remove the default call to fail.
	}
	
	@Test(expected = InvalidPuntosException.class)
	public void testCalcularPrima_4() {
		System.out.println("calcularPrima");
		int edad = 25;
		int puntos = 40;
		PRIMAv2 instance = new PRIMAv2();

		instance.calcularPrima(edad, puntos);
	
		// TODO review the generated test code and remove the default call to fail.
	}
	
	@Test(expected = InvalidPuntosException.class)
	public void testCalcularPrima_5() {
		System.out.println("calcularPrima");
		int edad = 40;
		int puntos = 0;
		PRIMAv2 instance = new PRIMAv2();

		instance.calcularPrima(edad, puntos);
	
		// TODO review the generated test code and remove the default call to fail.
	}
	

	@Test
	public void testCalcularPrima_6() {
		System.out.println("calcularPrima");
		int edad = 70;
		int puntos = 23;
		PRIMAv2 instance = new PRIMAv2();
		float expResult = 750;
		float result = instance.calcularPrima(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}

}
