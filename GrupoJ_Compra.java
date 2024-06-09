package Proyecto_Grupo_J;
 import java.util.Scanner;
public class GrupoJ_Compra {
	
	    //arreglos con los nombres de los subproductos de papel y precios
		String []nomProductosPapel = {"PAPEL BOND", "PAPEL MINISTRO", "PAPEL CALCO", "PAPEL A3", "PAPEL PERIODICO"};
		double [] preciosPapel= {0.10 , 0.30, 0.15, 0.40, 0.25 };
		//arreglos con los nombres de los subproductos de carton y precios
		String []nomProductosCarton = {"CAJA DE CARTON", "CARTON PRENSADO", "CARTON CORRUGADO", "CARTULINA", "CARTON PIEDRA"};
		double [] preciosCarton= {0.90 , 0.75, 0.67, 0.80, 1.20 };
		Scanner scanner= new Scanner(System.in);
	
	public void cabezera() {
		System.out.println("----------------------------------------------------------- -");
		System.out.println("--                                                         --");
		System.out.println("--                         BOXPAPER                        --");
		System.out.println("--                                                         --");
		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("Empresa creadora de productos de papel y carton ");
		System.out.println("Amigable con la naturaleza");
		System.out.println("Dueños de la empresa Michael Casas & Lisseth Torres");
		System.out.println(" ");
	}
	
	public void menuPrincipal() {
		System.out.println("--------------------MENÚ DE OPCIONES----------------------");
		System.out.println("1. Ver productos disponibles y precio por unidad");
		System.out.println("2. Realizar pedido");
		System.out.println("3. Salir");
		System.out.println("<<<<<<<<<<INGRESE UNA OPCIÓN>>>>>>>>>>>>");
		System.out.println(" ");
	}
	public void MostrarProductos() {
	  int opciones;
	  do {
		  System.out.println(" -------ESCOJA EL TIPO DE PRODUCTO-----------");
		  System.out.println("1. Ver productos de papel");
		  System.out.println("2. Ver productos de carton");
		  System.out.println("3. Regresar");
		  System.out.println(" ------------INGRESE UNA OPCIÓN---------------");
		  opciones=scanner.nextInt();
		  scanner.nextLine();
		  System.out.println(" ");
		  switch(opciones) {
		  case 1:
			  for (int i=0; i<5; i++) {
				  System.out.println(" ");
				  System.out.println("Nombre: "+nomProductosPapel[i]);
				  System.out.println("precio: "+preciosPapel[i]+"$");
				  System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
			  }
			  break;
		  case 2:
			  for (int i=0; i<5; i++) {
				  System.out.println(" ");
				  System.out.println("Nombre: "+nomProductosCarton[i]);
				  System.out.println("precio: "+preciosCarton[i]+"$");
				  System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
			  }
			  break;
		  case 3:
			  System.out.println(" ");
			  System.out.println("regresando....");
			  System.out.println(" ");
			  break;
		  default:
			  System.out.println("PORFAVOR INGRESE UNA OPCIÓN DISPONIBLE EN EL MENÚ");
			  break;
		  }
		  }while(opciones !=3);
		
	}
	
	public boolean RealizarPago() {// decvuelve un valor verdadero para usarlo en la clase cliente
		return true;
	}
	
	public boolean CancelarPago() {// devuelve un valor falso para usarlo en la clase cliente
		return false;
	}

}
