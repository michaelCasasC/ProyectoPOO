package Proyecto_Grupo_J;

import java.util.Scanner;

public class GrupoJ_Cliente {
	
	public String customerName;
	private String cardNumber;
	public String email;
	public String customerAddress;
	private String password;
	protected String ci;
	public String phoneNumber;
	int option;
	String cardComp;
	
	GrupoJ_Compra compra = new GrupoJ_Compra();
	GrupoJ_ProductoPapel papel = new GrupoJ_ProductoPapel("","",0,0,0);
	GrupoJ_ProductoCarton carton = new GrupoJ_ProductoCarton("","","",0,0,0);
	
	Scanner scanner = new Scanner(System.in);
	
	public GrupoJ_Cliente (String customerName,String cardNumber,String email,String customerAddress,String password,String ci, String phoneNumber, int option) {
		this.customerName = customerName;
		this.cardNumber = cardNumber;
		this.email = email;
		this.customerAddress = customerAddress;
		this.password = password;
		this.ci = ci;
		this.phoneNumber = phoneNumber;
		this.option = option;
		
	}
	
	public void IngresarDatosCliente() {
		System.out.println("------------------------------");
		System.out.println("Ingrese su nombre y apellido: ");
		customerName = scanner.nextLine();
		System.out.println("Ingrese su direccion: ");
		customerAddress =scanner.nextLine();
		System.out.println("Ingrese su numero de cedula: ");
		ci = scanner.nextLine();
		System.out.println("Ingrese su correo electronico");
		email = scanner.nextLine();
		System.out.println("Ingrese su numero de telefono");
		phoneNumber = scanner.nextLine();
		System.out.println("------------------------------");
	}
	
	public void RealizarPedido() {
		
		do {
		System.out.println("    Seleccionar producto");
		System.out.println("1.Papel    2.Carton   3.Salir");
		System.out.println("Ingrese una opcion: ");
		option = scanner.nextInt();
		switch (option) {
		case 1:
			do { 
				System.out.println("Producto de papel disponibles");
				System.out.println("1.PAPEL BOND 2.PAPEL MINISTRO "+'\n'
						         + "3.PAPEL CALCO 4.PAPEL A3 "+'\n'
						         + "5.PAPEL PERIODICO 6.Salir");
				option = scanner.nextInt();
				switch (option) {
				case 1:
					papel.precio = compra.preciosPapel[0];
					papel.subProductoPapel = compra.nomProductosPapel[0];
					break;
				case 2: 
					papel.precio = compra.preciosPapel[1];
					papel.subProductoPapel = compra.nomProductosPapel[1];
					break;
				case 3:
					papel.precio = compra.preciosPapel[2];
					papel.subProductoPapel = compra.nomProductosPapel[2];
					break;
				case 4: 
					papel.precio = compra.preciosPapel[3];
					papel.subProductoPapel = compra.nomProductosPapel[3];
					break;
				case 5:
					papel.precio = compra.preciosPapel[4];
					papel.subProductoPapel = compra.nomProductosPapel[4];
					break;
				case 6:
					System.out.println("Ha salido con exito..");
					break;
				default:
					System.out.println("Opcion incorrecta..");
					break;
				}
				
			}while(option !=6);
			papel.IngresarCantProductos();
			
			if (compra.RealizarPago()==true) {
				System.out.println("ingrese el numero de su tarjeta");
				cardComp= scanner.nextLine();
				do {
				if (cardComp==cardNumber) {
					System.out.println("datos correctos");
					System.out.println("Nombre = "+customerName);
				}else {
					System.out.println("numero incorrecto, intentelo denuevo");
		
				}
				}while(cardComp!=cardNumber);
				
			}
			
			
			break;
		case 2:
			break;
		case 3:
			break;
		default: 
			break;
		}
		}while(option !=3);

	}
	
}
