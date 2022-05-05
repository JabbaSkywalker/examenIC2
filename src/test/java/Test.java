import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import db.conexion;

public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("static-access")
	@org.junit.Test
	public void test() {
		System.out.println("Prueba de Conexión");
		try {
			conexion instance = new db.conexion();
			String resultado = "";
			if(instance.conectar() != null) {
				resultado = "Conexion Establecida..";
			}else {
				resultado = "Conexion fallo";
			}
			assertEquals(resultado, "Conexion Establecida..");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}

}
