package Proyecto_Grupo_J;

import java.util.Scanner;
import java.io.FileWriter;// para escribir archivos
import java.io.IOException;// para excepciones

public class GrupoJ_Cliente {
	public String CustomerName;//variable nombre del cliente
	public String numTarjeta;// numero de la tarjeta de credito
	protected String email; // correo electrónico
	public String direccionCliente; // lugar donde vive
	private String contrasenia;// contraseña de su cuenta
	public String CI; //cedula de identidad 
	protected String numTelef; // numero de telefono del cliente
	boolean desicion; //para saber si re realizó la compra o se canceló
	GrupoJ_Compra compra = new GrupoJ_Compra();
	
	Scanner scanner = new Scanner(System.in);
	int option;
	GrupoJ_ProductoPapel papel = new GrupoJ_ProductoPapel("","papel",0,0,0,0);// objeto de la clase ProductoPapel
	GrupoJ_ProductoCarton carton = new GrupoJ_ProductoCarton("","carton",0,0,0,0);//objeto de la clase ProductoCarton
	
	public GrupoJ_Cliente (String CustomerName,String numTarjeta,String email,String direccionCliente,String contrasenia,String CI, String numTelef) {
		this.CustomerName = CustomerName;
		this.numTarjeta = numTarjeta;
		this.email = email;
		this.direccionCliente = direccionCliente;
		this.contrasenia = contrasenia;
		this.CI = CI;
		this.numTelef = numTelef;
		
	}
	
	public void IngresarDatosCliente() { //registar los datos personales del cliente
		
		System.out.println("------------------------------");
		
		System.out.println("Ingrese su nombre y apellido: ");
		CustomerName = scanner.nextLine();
		System.out.println("Ingrese su direccion: ");
		direccionCliente =scanner.nextLine();
		do {
		System.out.println("Ingrese su numero de cedula: ");
		CI = scanner.nextLine();
		if(CI.length()<10 || CI.length()>10) {
			System.out.println("La cedula debe contener 10 digitos");
		}
		}while(CI.length()<10 || CI.length()>10);
		System.out.println("Ingrese su correo electronico");
		email = scanner.nextLine();
		do {
		System.out.println("Ingrese su numero de telefono");
		numTelef = scanner.nextLine();
		if(numTelef.length()<10 || numTelef.length()>10) {
			System.out.println("El numero de telefono debe contener 10 digitos");
		}
		}while(numTelef.length()<10||numTelef.length()>10);
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
				System.out.println("¿Cuantas unidades de "+papel.subProductoPapel+" desea?");
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
					System.out.println(" ");
					System.out.println("gracias por su compra, el pedido llegará en una semana a su dirección específicada");
					json (papel.name,papel.subProductoPapel,papel.cantProductos,papel.precioVenta,CustomerName,direccionCliente,email);
					csv (papel.name,papel.subProductoPapel,papel.cantProductos,papel.precioVenta,CustomerName,direccionCliente,email);
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
					System.out.println(" ");
					System.out.println("gracias por su compra, el pedido llegará en una semana a su dirección específicada");
					json (carton.name,carton.subProductoCarton,carton.cantProductos,carton.precioVenta,CustomerName,direccionCliente,email);
					csv(carton.name,carton.subProductoCarton,carton.cantProductos,carton.precioVenta,CustomerName,direccionCliente,email);
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
	// generador del jason
	public void json (String nombre, String subproducto,int unidades, double precio, String Cliente, String direccion, String email ) {
		try(FileWriter writer = new FileWriter("factura.json")){
			writer.write("{"+'\n');
			writer.write("cliente: "+Cliente+'\n');
			writer.write("Producto: "+nombre+'\n');
			writer.write("sub producto: "+subproducto+'\n');
			writer.write("Cantidad de unidades: "+unidades+'\n');
			writer.write("precio de Venta: "+Cliente+'\n');
			writer.write("dirección: "+direccion+'\n');
			writer.write("emain: "+email+'\n');
			writer.write("}"+'\n');
			
		}catch(IOException e) {
			System.out.println("error al generar el archivo");
		}
		
	}
	//generador del csv
	public void csv(String nombre, String subproducto,int unidades, double precio, String Cliente, String direccion, String email) {
		try(FileWriter csWriter = new FileWriter("factura.csv") ){
			
			csWriter.write("Cliente , producto , sub producto , cantidad , precio de venta , direccion , email "+'\n');
			csWriter.write(nombre +" , "+nombre+" , "+ subproducto +" , "+unidades+ " , "+Cliente+" , "+direccion+" , "+ email );
		}catch(IOException e) {
		
	}
	}
}
