package Proyecto_Grupo_J;
import java.util.Scanner;

public class GrupoJ_Productos {
	String nombre;
	double precio;
	int tiempoEntrega;
	int cantProductos;
	double precioVenta;
	Scanner scanner = new Scanner(System.in);
	
	public GrupoJ_Productos(String nombre, double precio, int tiempoEntrega, int cantProductos,double precioVenta) {
		this.nombre = nombre;
		this.precio = precio;
		this.tiempoEntrega = tiempoEntrega;
		this.cantProductos = cantProductos;
		this.precioVenta=precioVenta;
	}
	
	public void IngresarCantProductos() {
		System.out.println("");
		cantProductos=scanner.nextInt();
		
	}
	
	public void PrecioVenta() {
		precioVenta=(precio*cantProductos);
		System.out.println(" el precio de venta sería: "+ precioVenta);
	}
	
	public void MostrarDatos() {
		System.out.println("Producto: "+nombre);
		System.out.println("Cantidad: "+cantProductos);
		System.out.println("precio: "+ precioVenta);
	}

}

