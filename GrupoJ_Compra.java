package Proyecto_Grupo_J;
 import java.util.Scanner;
public class GrupoJ_Compra {
	
		String []nomProductosPapel = {"PAPEL BOND", "PAPEL MINISTRO", "PAPEL CALCO", "PAPEL A3", "PAPEL PERIODICO"};
		double [] preciosPapel= {0.10 , 0.30, 0.15, 0.40, 0.25 };
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
	
	public void MostrarProductos() {
	  int opciones;
	  do {
		  System.out.println(" -------ESCOJA EL TIPO DE PRODUCTO-----------");
		  System.out.println("1. ver productos de papel");
		  System.out.println("2. ver productos de carton");
		  System.out.println("3. regresar");
		  System.out.println(" ------------INGRESE UNA OPCIÓN---------------");
		  opciones=scanner.nextInt();
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
	
	public boolean RealizarPago() {
		return false;
	}
	
	public boolean CancelarPago() {
		return false;
	}

}
