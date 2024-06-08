package Proyecto_Grupo_J;
import java.util.Scanner;

public class GrupoJ_Main {

	public static void main(String[] args) {
		int opciones;//para el menú
		Scanner scanner = new Scanner(System.in);
		GrupoJ_Compra compra= new GrupoJ_Compra();//objeto de la clase GrupoJ_Compra
		GrupoJ_Cliente cliente = new GrupoJ_Cliente("","","","","","","");
		
		compra.cabezera();//cabecera de la empreza
		do { 
			compra.menuPrincipal();
			opciones=scanner.nextInt();
			System.out.println(" ");
			scanner.nextLine();
			switch(opciones) {
			
			case 1:
				compra.MostrarProductos();
				break;
			case 2:
				cliente.IngresarDatosCliente();
				cliente.RealizarPedido();
				break;
			case 3:
				break;
			default:
				break;
			}
		}while(opciones!=3);
		
	}

}
