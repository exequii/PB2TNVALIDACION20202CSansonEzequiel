package sanson.ezequiel41247699;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion  {
	
	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	
	
	private String patente;
	private List <Producto> listaProductos = new ArrayList<Producto>();
	
	
	public Camion (String patente) {
		this.patente=patente;
	}
	
	
	public Boolean cargarProducto(Producto producto) {
		/*
		 * carga el producto en la lista de producto 
		 *   
		 * 
		 */
		Boolean seCargo=false;
		
		if(producto !=null){	
			this.listaProductos.add(producto);
			seCargo=true;
		}
		
		return seCargo;
	
	}
	
	
	public Producto descargarProducto(Integer idProducto) throws ProductoInexsistenteException{
	
		/*
		 * buesca y un producto por su id y devuelve el producto encontrado
		 * por otro lado elimina dicho producto de la coleccion
		 * encaso que el idProducto no se encuentre retorna una exception ProductoInexistenteException
		 */
		Producto productoAbuscar;
		for(Producto producto : listaProductos) {
			if(producto.getId().equals(idProducto)) {
				productoAbuscar = producto;
				listaProductos.remove(producto);
				return productoAbuscar;
			}
		}
		
		throw new ProductoInexsistenteException("El producto no existe");
		
	}
	

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public List<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	
}
