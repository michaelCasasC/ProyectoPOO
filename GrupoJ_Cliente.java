package Proyecto_Grupo_J;

import java.util.Scanner;

public class GrupoJ_Cliente {
	
	String nomCliente;
	String numTarjeta;
	String email;
	String direccionCliente;
	String contrasenia;
	String cedula;
	String numTelefono;
	
	Scanner scanner = new Scanner(System.in);
	
	public GrupoJ_Cliente (String nomCliente,String numTarjeta,String email,String direccionCliente,String contrasenia,String cedula, String numTelefono) {
		this.nomCliente = nomCliente;
		this.numTarjeta = numTarjeta;
		this.email = email;
		this.direccionCliente = direccionCliente;
		this.contrasenia = contrasenia;
		this.cedula = cedula;
		this.numTelefono = numTelefono;
		
	}
	
	public void IngresarDatosCliente() {
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
	
	public void RealizarPedido() {

	}

}
