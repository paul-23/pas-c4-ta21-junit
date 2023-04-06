/**
 * 
 */
package JUnit.Junit09_Geometria.dto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author paul_
 *
 */

class GeometriaTest {
	Geometria geo = new Geometria();

	// Método para calcular el area del cuadrado
	@Test
	void testAreaCuadrado() {
		System.out.println("Area cuadrado");
		assertEquals(4, geo.areacuadrado(2));
	}

	// Método para calcular el area del circulo
	@Test
	void testAreaCirculo() {
		System.out.println("Area circulo");
		assertEquals(12.5, geo.areaCirculo(2), 0.1);
	}

	// Método para calcular el area del triangulo
	@Test
	void testAreaTriangulo() {
		System.out.println("Area triangulo");
		assertEquals(5, geo.areatriangulo(2, 5));
	}

	// Método para calcular el area del rectangulo
	@Test
	void testAreaRectangulo() {
		System.out.println("Area rectangulo");
		assertEquals(10, geo.arearectangulo(2, 5));
	}

	// Método para calcular el area del pentagono
	@Test
	void testAreaPentagono() {
		System.out.println("Area pentagono");
		assertEquals(10, geo.areapentagono(5, 4));
	}

	// Método para calcular el area del rombo
	@Test
	void testAreaRombo() {
		System.out.println("Area rombo");
		assertEquals(4, geo.arearombo(4, 2));
	}

	// Método para calcular el area del romboiode
	@Test
	void testAreaRomboide() {
		System.out.println("Area romboiode");
		assertEquals(10, geo.arearomboide(2, 5));
	}

	// Método para calcular el area del trapecio
	@Test
	void testAreaTrapecio() {
		System.out.println("Area trapecio");
		assertEquals(16, geo.areatrapecio(3, 5, 4));
	}

	
	@Test
	void testFigura() {
		// Comprobamos que todas las figuras coinciden con la id
		assertEquals("cuadrado", geo.figura(1));
		assertEquals("Circulo", geo.figura(2));
		assertEquals("Triangulo", geo.figura(3));
		assertEquals("Rectangulo", geo.figura(4));
		assertEquals("Pentagono", geo.figura(5));
		assertEquals("Rombo", geo.figura(6));
		assertEquals("Romboide", geo.figura(7));
		assertEquals("Trapecio", geo.figura(8));
		assertEquals("Default", geo.figura(9));
	}

	@Test
	void testGetId() {
		// Verificar que el valor de id (default) es correcto
		assertEquals(9, geo.getId());
	}

	@Test
	void testSetId() {
		// Asignamos un valor de 5 a la id
		geo.setId(5);
		// Verificar que el valor de id se haya actualizado correctamente
		assertEquals(5, geo.getId());
	}

	@Test
	void testGetNom() {
		// Crear objeto Geometria con id = 3
		geo = new Geometria(3);
		// Verificar que el nombre de la figura es correcto
		assertEquals("Triangulo", geo.getNom());
	}

	@Test
	void testSetNom() {
		// Asignamos el nombre del objeto a Triangulo
		geo.setNom("cuadrado");
		// Comprobamos si se haactualizado correctamente
		assertEquals("cuadrado", geo.getNom());
	}

	@Test
	void testGetArea() {
		// Asignamos el area
		geo.setArea(5.5);
		// Comprobamos que se ha asignado correctamente
		assertEquals(5.5, geo.getArea());
	}
	
	@Test
	void testToString() {
		geo = new Geometria(1);
		geo.setArea(geo.areacuadrado(2));
		assertEquals("Geometria [id=1, nom=cuadrado, area=4.0]", geo.toString());
	}
}
