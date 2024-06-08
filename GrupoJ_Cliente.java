package Proyecto_Grupo_J;

import java.util.Scanner;
import java.io.FileWriter;// para escribir archivos
import java.io.IOException;// para excepciones

public class GrupoJ_Cliente {
	String nomCliente;
	String numTarjeta;
	String email;
	String direccionCliente;
	String contrasenia;
	String cedula;
	String numTelefono;
	boolean desicion; //para saber si re realizó la compra o se canceló
	GrupoJ_Compra compra = new GrupoJ_Compra();
	
	Scanner scanner = new Scanner(System.in);
	int option;
	GrupoJ_ProductoPapel papel = new GrupoJ_ProductoPapel("","papel",0,0,0,0);// objeto de la clase ProductoPapel
	GrupoJ_ProductoCarton carton = new GrupoJ_ProductoCarton("","carton",0,0,0,0);//objeto de la clase ProductoCarton
	
	public GrupoJ_Cliente (String nomCliente,String numTarjeta,String email,String direccionCliente,String contrasenia,String cedula, String numTelefono) {
		this.nomCliente = nomCliente;
		this.numTarjeta = numTarjeta;
		this.email = email;
		this.direccionCliente = direccionCliente;
		this.contrasenia = contrasenia;
		this.cedula = cedula;
		this.numTelefono = numTelefono;
		
	}
	
	public void IngresarDatosCliente() { //registar los datos personales del cliente
		System.out.println("------------------------------");
		System.out.println("Ingrese su nombre y apellido: ");
		nomCliente = scanner.nextLine();
		System.out.println("Ingrese su direccion: ");
		direccionCliente =scanner.nextLine();
		System.out.println("Ingrese su numero de cedula: ");
		cedula = scanner.nextLine();
		System.out.println("Ingrese su correo electronico");
		email = scanner.nextLine();
		System.out.println("Ingrese su numero de telefono");
		numTelefono = scanner.nextLine();
		System.out.println("------------------------------");
	}
	
	public void RealizarPedido() {// realizar el pedido
		do {
			System.out.println("    Seleccionar producto");
			System.out.println("1.Papel    2.Carton   3.Salir");
			System.out.println("Ingrese una opcion: ");
			option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1://productos de papel
				papel.SeleccionarSubProductoPapel();
				System.out.println("¿cuantas unidades de "+papel.subProductoPapel+" desea?");
				papel.IngresarCantProductos();
				
				papel.PrecioVenta();
				do {
				System.out.println("¿Desea realizar el pago?"+'\n'
						+ "1. sí           2. No"+'\n');
				option = scanner.nextInt();
				switch (option) {
				case 1:
					desicion=compra.RealizarPago();
					break;
				case 2:
					desicion=compra.CancelarPago();
					break;
				default:
					System.out.println(" porfavor,  ingrese 1 o 2");
					break;
				}
				}while(option<1 && option >2);
				if (desicion==true) {
					papel.MostrarDatos();
					System.out.println("gracias por su compra, el pedido llegará en una semana a su dirección específicada");
					
					System.out.println("se ha generado una factura tipo csv y una factura tipo json");
				}else {
					System.out.println("Okey, Gracias por visitar nuestra página..... que tenga un excelente día");
					return;
				}
				break;
			case 2: // productos de carton 
				carton.SeleccionarSubProductoCarton();
				System.out.println("¿cuantas unidades de "+carton.subProductoCarton+" desea?");
				carton.IngresarCantProductos();
			
				carton.PrecioVenta();
				do {
				System.out.println("¿Desea realizar el pago?"+'\n'
						+ "1. sí           2. No"+'\n');
				option = scanner.nextInt();
				switch (option) {// para saber se se cancela o se lleva a cabo el pago 
				case 1:
					desicion=compra.RealizarPago();
					break;
				case 2:
					desicion=compra.CancelarPago();
					break;
				default:
					System.out.println(" porfavor,  ingrese 1 o 2");
					break;
				}
				}while(option<1 && option >2);
				if (desicion==true) {
					carton.MostrarDatos();
					System.out.println("gracias por su compra, el pedido llegará en una semana a su dirección específicada");
					
					System.out.println("se ha generado una factura tipo csv y una factura tipo json");
				}else {
					System.out.println("Okey, Gracias por visitar nuestra página..... que tenga un excelente día");
					return;
				}
				break;
			case 3:
				System.out.println("saliendo.......");
				break;
			default:
				System.out.println("ingrese una opción válida");
				break;
			}

	}while(option !=3);

}
}
