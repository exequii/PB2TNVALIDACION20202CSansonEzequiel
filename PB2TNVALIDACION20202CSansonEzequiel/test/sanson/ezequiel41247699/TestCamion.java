package sanson.ezequiel41247699;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


import sanson.ezequiel41247699.Camion;
import sanson.ezequiel41247699.Producto;
import sanson.ezequiel41247699.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
		
		Producto producto1 = new Producto(1,10.0,"coca",1.0);
		Camion camion1 = new Camion("AAA111");
		
		assertTrue(camion1.cargarProducto(producto1));
	
	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() throws ProductoInexsistenteException{
		Producto producto1 = new Producto(1,10.0,"coca",1.0);
		Camion camion1 = new Camion("AAA111");
		
		camion1.cargarProducto(producto1);
		assertEquals(producto1,camion1.descargarProducto(1));
		
	
	}
	
	//obligatorio
	@Test
	(expected = ProductoInexsistenteException.class)
	public void queDescargueUnProductoInexistenteLanceUnaException() throws ProductoInexsistenteException{
		Producto producto1 = new Producto(1,10.0,"coca",1.0);
		Camion camion1 = new Camion("AAA111");
		
		camion1.cargarProducto(producto1);
		camion1.descargarProducto(2);
	
	}
	
}
