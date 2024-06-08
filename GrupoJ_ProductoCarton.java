package Proyecto_Grupo_J;
import java.util.Scanner;

public class GrupoJ_ProductoCarton extends GrupoJ_Productos {
	Scanner scanner= new Scanner(System.in);
	String subProductoCarton;
	
	int option;
	GrupoJ_Compra compra = new GrupoJ_Compra();
	public GrupoJ_ProductoCarton(String subProductoCarton, String nombre, double precio, int tiempoEntrega, int cantProductos,double precioVenta) {
		super(nombre,  precio,  tiempoEntrega,  cantProductos, precioVenta);
		this.subProductoCarton = subProductoCarton;
	
	}
	
	public void SeleccionarSubProductoCarton() {
		do {
			System.out.println("Productos de papel disponibles: ");
			System.out.println("1.PAPEL BOND             2.PAPEL MINISTRO "+'\n'
			                 + "3.PAPEL CALCO            4.PAPEL A3 "+'\n'
			                 + "5.PAPEL PERIODICO        6.Salir");
			option=scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1:
				subProductoCarton=compra.nomProductosCarton[0];
				precio= compra.preciosCarton[0];
				break;
			case 2:
				subProductoCarton=compra.nomProductosCarton[1];
				precio= compra.preciosCarton[1];
				break;
			case 3:
				subProductoCarton=compra.nomProductosCarton[2];
				precio= compra.preciosCarton[2];
				break;
			case 4:
				subProductoCarton=compra.nomProductosCarton[3];
				precio= compra.preciosCarton[3];
				break;
			case 5:
				subProductoCarton=compra.nomProductosCarton[4];
				precio= compra.preciosCarton[4];
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
		System.out.println("Producto: "+nombre);
		System.out.println("Nombre del Subproducto: "+subProductoCarton);
		System.out.println("Cantidad: "+cantProductos);
		
	}
	
}
