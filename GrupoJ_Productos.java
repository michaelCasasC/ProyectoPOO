package Proyecto_Grupo_J;
import java.util.Scanner;

public class GrupoJ_Productos {
	Scanner scanner= new Scanner(System.in);
	String nombre;
	double precio;
	int tiempoEntrega;
	int cantProductos;
	
	public GrupoJ_Productos(String nombre, double precio, int tiempoEntrega, int cantProductos) {
		this.nombre = nombre;
		this.precio = precio;
		this.tiempoEntrega = tiempoEntrega;
		this.cantProductos = cantProductos;
	}
	
	public void IngresarCantProductos() {
		System.out.println("ingrese la cantidad de productos que desea ");
		cantProductos= scanner.nextInt();
	}
	
	public void PrecioVenta() {
		System.out.println(" el precio de venta sería "+ (precio*cantProductos));
	}
	
	public void MostrarDatos() {
		
	}

}
