package sanson.ezequiel41247699;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sanson.ezequiel41247699.Producto;
import sanson.ezequiel41247699.Reporte;
import sanson.ezequiel41247699.TiendaCamion;

public class TestTiendaCamion {
	
	
	
	//Obligatorio
	
	@Test
	public void queSeObtengaUnreporteAlHAcerUnCierreZ() {
		
		TiendaCamion tienda1 = new TiendaCamion("AAA111");
		Producto producto1 = new Producto(1,10.0,"coca",1.0);
		Producto producto2 = new Producto(2,20.0,"agua",1.5);
		Producto producto3 = new Producto(3,30.0,"soda",1.3);
		
		tienda1.abrirCaja();
		
		tienda1.agregarProducto(producto3);
		tienda1.agregarProducto(producto2);
		tienda1.agregarProducto(producto1);
		
		tienda1.cierreZ();
		
	}
	

	//opcional
	@Test
	public void queAlAbrirUnaCajaLaListaDeVentaEsteVacia() {
		
		TiendaCamion tienda1 = new TiendaCamion("AAA111");
		Producto producto1 = new Producto(1,10.0,"coca",1.0);
		Producto producto2 = new Producto(2,20.0,"agua",1.5);
		Producto producto3 = new Producto(3,30.0,"soda",1.3);
		
		tienda1.agregarProducto(producto3);
		tienda1.agregarProducto(producto2);
		tienda1.agregarProducto(producto1);
		
		tienda1.abrirCaja();
		
		assertEquals(0,tienda1.getCantidadVentas(),0.1);
		
	}
	
	@Test
	(expected = ProductoInexsistenteException.class)
	public void queNoEncuentreUnProducto() throws CajaCerradaException, ProductoInexsistenteException{
		
		TiendaCamion tienda1 = new TiendaCamion("AAA111");
		Producto producto1 = new Producto(1,10.0,"coca",1.0);
		Producto producto2 = new Producto(2,20.0,"agua",1.5);
		Producto producto3 = new Producto(3,30.0,"soda",1.3);
		
		tienda1.abrirCaja();
		
		tienda1.agregarProducto(producto3);
		tienda1.agregarProducto(producto2);
		tienda1.agregarProducto(producto1);
		
		tienda1.vender(4);
		
	}
	
	@Test
	(expected = CajaCerradaException.class)
	public void queNoPuedaVenderPorqueLaCajaEstaCerrada() throws CajaCerradaException, ProductoInexsistenteException{
		
		TiendaCamion tienda1 = new TiendaCamion("AAA111");
		Producto producto1 = new Producto(1,10.0,"coca",1.0);
		Producto producto2 = new Producto(2,20.0,"agua",1.5);
		Producto producto3 = new Producto(3,30.0,"soda",1.3);
		
		
		tienda1.agregarProducto(producto3);
		tienda1.agregarProducto(producto2);
		tienda1.agregarProducto(producto1);
		
		tienda1.vender(1);
		
	}

}
