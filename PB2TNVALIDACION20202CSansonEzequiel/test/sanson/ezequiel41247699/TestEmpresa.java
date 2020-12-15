package sanson.ezequiel41247699;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.TreeSet;

import org.junit.Test;

import sanson.ezequiel41247699.Camion;
import sanson.ezequiel41247699.Empresa;
import sanson.ezequiel41247699.TiendaCamion;

public class TestEmpresa {
	
	
	//Opcional
	@Test
	public void queSeAgregueUnCamion() {
		Empresa nueva = new Empresa("samsung");
		Camion camion1 = new Camion("AAA111");
		
		nueva.agregarCamion(camion1);
		
		assertEquals(1,nueva.cantidadDeCamiones(),0.01);
		
		
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCamionesTiendaOrdenadosPorPatentes() {
		Empresa nueva = new Empresa("samsung");
		Camion camion1 = new Camion("AAA111");
		Camion camion2 = new Camion("BBB111");
		Camion camion3 = new Camion("CCC111");
		Camion camion4 = new Camion("DDD111");
		
		nueva.agregarCamion(camion1);
		nueva.agregarCamion(camion2);
		nueva.agregarCamion(camion3);
		nueva.agregarCamion(camion4);
		
		assertEquals(camion1, nueva.obtenerTiendascamionOrdenadoPorPatente().first());
		assertEquals(camion4, nueva.obtenerTiendascamionOrdenadoPorPatente().last());
		
	}


}
