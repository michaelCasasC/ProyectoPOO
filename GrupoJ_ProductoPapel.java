package Proyecto_Grupo_J;

public class GrupoJ_ProductoPapel extends GrupoJ_Productos {
	 
	String subProductoPapel;
	
	public GrupoJ_ProductoPapel(String subProductoPapel,String nombre, double precio, int tiempoEntrega, int cantProductos) {
		super(nombre,  precio,  tiempoEntrega,  cantProductos);
		this.subProductoPapel = subProductoPapel;
	}
	
	public void SeleccionarSubProducto() {
		
	}
	

}
