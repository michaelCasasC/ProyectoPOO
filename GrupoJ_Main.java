package Proyecto_Grupo_J;
import java.util.Scanner;

public class GrupoJ_Main {

	public static void main(String[] args) {
		int opciones;//para el menú
		Scanner scanner = new Scanner(System.in);
		GrupoJ_Compra compra= new GrupoJ_Compra();//objeto de la clase GrupoJ_Compra
		
		compra.cabezera();//cabecera de la empreza
		
		do { 
			System.out.println("--------------------MENÚ DE OPCIONES----------------------");
			System.out.println("1. Ver productos disponibles y precio por unidad");
			System.out.println("2. Realizar pedido");
			System.out.println("3. salir");
			System.out.println("<<<<<<<<<<INGRESE UNA OPCIÓN>>>>>>>>>>>>");
			System.out.println(" ");
			opciones=scanner.nextInt();
			System.out.println(" ");
			switch(opciones) {
			case 1:
				compra.MostrarProductos();
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
			}
		}while(opciones!=3);
		
	}

}
