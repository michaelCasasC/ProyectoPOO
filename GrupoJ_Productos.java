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
		do {
		System.out.println("");
		cantProductos=scanner.nextInt();
		if(cantProductos<=0 || cantProductos>1500) {
			System.out.println('\n'+"la cantidad no puede ser menor o igual a cero y tampoco superar las 1500 unidades");
		}
		}while(cantProductos<=0 || cantProductos>1500);
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
