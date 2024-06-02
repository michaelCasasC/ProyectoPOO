package Proyecto_Grupo_J;

public class GrupoJ_ProductoCarton extends GrupoJ_Productos {
	
	String subProductoCarton;
	String tipoCarton;
	
	public GrupoJ_ProductoCarton(String subProductoCarton, String tipoCarton, String nombre, double precio, int tiempoEntrega, int cantProductos) {
		super(nombre,  precio,  tiempoEntrega,  cantProductos);
		this.subProductoCarton = subProductoCarton;
		this.tipoCarton = tipoCarton;
	}
	
	public void SeleccionarSubProducto() {
		
	}
	
	public void SeleccionarTipoCarton() {
		
	}

}
