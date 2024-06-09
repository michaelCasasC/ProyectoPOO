package Proyecto_Grupo_J;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class GrupoJ_Productos {
	String name;
	double precio;// precio de venta por unidad
	int tiempoEntrega;
	int cantProductos;
	double precioVenta;//precio final (suma de todas la unidades que se van a comprar)
	Scanner scanner = new Scanner(System.in);
	
	public GrupoJ_Productos(String name, double precio, int tiempoEntrega, int cantProductos,double precioVenta) {
		this.name = name;
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
		System.out.println("Producto: "+name);
		System.out.println("Cantidad: "+cantProductos);
		System.out.println("precio: "+ precioVenta);
	}
	

}

