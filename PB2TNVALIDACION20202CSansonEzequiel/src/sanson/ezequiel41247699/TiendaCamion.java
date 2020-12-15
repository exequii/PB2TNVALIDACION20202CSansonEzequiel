package sanson.ezequiel41247699;

import java.util.ArrayList;
import java.util.List;


/*
 * La clase tiendaCamion pertenece a la familia de los camiones y tambien se comporta como una tienda
 * 
 * Desarrolle  e implemente los metodos pedido para que la clase cumpla con sus funcionalidades
 */
public class TiendaCamion  implements ITienda{
	
	private List<Producto> ventas = new ArrayList<Producto>();
	private Boolean estadoDeCaja=false; // True Abierta - False Cerrada
	private String patente;
	private Integer cantidadVentas=0;
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	public TiendaCamion(String Patente) {
		this.patente=patente;
	}

	
	

	public Integer getCantidadVentas() {
		return cantidadVentas;
	}




	public void setCantidadVentas(Integer cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}




	public void abrirCaja() {
		// Al Inicicio del dia limpia todas las ventas
		// y abre la caja diaria
		this.estadoDeCaja=true;
		this.ventas.removeAll(ventas);
		
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}




	@Override
	public void vender(Integer idProducto) throws CajaCerradaException, ProductoInexsistenteException{
		
		if(!estadoDeCaja)
			throw new CajaCerradaException("Caja Cerrada");
		
		else {
		Producto productoABuscar;
		for(Producto producto : productos) {
			if(producto.getId().equals(idProducto)) {
				productoABuscar = producto;
				this.ventas.add(productoABuscar);
			}
		}
		}
		
		throw new ProductoInexsistenteException("Producto no encontrado");
		
	}




	@Override
	public Reporte cierreZ() {
			this.estadoDeCaja=false;
		
		
		return null;
	}



}
