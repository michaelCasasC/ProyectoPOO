package Proyecto_Grupo_J;
import java.util.Scanner;


public class GrupoJ_ProductoPapel extends GrupoJ_Productos {
	Scanner scanner = new Scanner(System.in);
	String subProductoPapel;
	int option;
	
	GrupoJ_Compra compra = new GrupoJ_Compra();
	
	public GrupoJ_ProductoPapel(String subProductoPapel,String name, double precio, int tiempoEntrega, int cantProductos, double precioVenta) {
		super(name,  precio,  tiempoEntrega,  cantProductos, precioVenta);
		this.subProductoPapel = subProductoPapel;
	}
	
	public void SeleccionarSubProductoPapel() {
		do {
			System.out.println("Productos de papel disponibles: ");
			System.out.println("1.PAPEL BOND             2.PAPEL MINISTRO "+'\n'
			                 + "3.PAPEL CALCO            4.PAPEL A3 "+'\n'
			                 + "5.PAPEL PERIODICO        6.Salir");
			option=scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1:
				subProductoPapel=compra.nomProductosPapel[0];
				precio= compra.preciosPapel[0];
				break;
			case 2:
				subProductoPapel=compra.nomProductosPapel[1];
				precio= compra.preciosPapel[1];
				break;
			case 3:
				subProductoPapel=compra.nomProductosPapel[2];
				precio= compra.preciosPapel[2];
				break;
			case 4:
				subProductoPapel=compra.nomProductosPapel[3];
				precio= compra.preciosPapel[3];
				break;
			case 5:
				subProductoPapel=compra.nomProductosPapel[4];
				precio= compra.preciosPapel[4];
				break;
			case 6:
				System.out.println("------------saliendo-------------");
				break;
			default:
				System.out.println("opción no disponible");
				break;
			}
			 
			
		}while( (option<1 && option>6));
	}
		
	@Override
	public void MostrarDatos() {
		System.out.println("Producto: "+name);
		System.out.println("Nombre del Subproducto: "+subProductoPapel);
		System.out.println("Cantidad: "+cantProductos);
	}
	

}
