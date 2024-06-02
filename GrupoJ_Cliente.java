package Proyecto_Grupo_J;

import java.util.Scanner;

public class GrupoJ_Cliente {
	String nomCliente;
	String numTarjeta;
	String email;
	String direccionCliente;
	String contrasenia;
	
	Scanner scanner = new Scanner(System.in);
	
	public GrupoJ_Cliente (String nomCliente,String numTarjeta,String email,String direccionCliente,	String contrasenia) {
		this.nomCliente = nomCliente;
		this.numTarjeta = numTarjeta;
		this.email = email;
		this.direccionCliente = direccionCliente;
		this.contrasenia = contrasenia;
		
	}
	
	public void IngresarDatosCliente() {
		System.out.println();
	}
	
	public void RealizarPedido() {

	}

}
