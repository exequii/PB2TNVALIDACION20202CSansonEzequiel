package sanson.ezequiel41247699;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Empresa {

	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private HashMap<Integer, Camion> flota = new HashMap<Integer, Camion>();
	private Integer identificadorCamion=0;
	private Integer cantidadDeCamiones=0;
	private ArrayList<Camion> camionesAOrdenar = new ArrayList<Camion>();

	

	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void agregarCamion(Camion camion) {

		// se agrega uncamion el primer camion tiene como identificador 0 el el segundo
		// 1 2 3.4
			this.flota.put(this.identificadorCamion++,camion);
			this.camionesAOrdenar.add(camion);
			++cantidadDeCamiones;
	}

	public Integer cantidadDeCamiones() {

		return cantidadDeCamiones;
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		
		PorPatenteComparator ordenador = new PorPatenteComparator();
		TreeSet<Camion> camionesOrdenados = new TreeSet<Camion>(ordenador);
		camionesOrdenados.addAll(camionesAOrdenar);
		
		return camionesOrdenados;
	}

}
