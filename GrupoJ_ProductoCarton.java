ackage Proyecto_Grupo_J;
import java.util.Scanner;

public class GrupoJ_ProductoCarton extends GrupoJ_Productos {
	Scanner scanner= new Scanner(System.in);
	String subProductoCarton;
	
	int option;
	GrupoJ_Compra compra = new GrupoJ_Compra();
	public GrupoJ_ProductoCarton(String subProductoCarton, String name, double precio, int tiempoEntrega, int cantProductos,double precioVenta) {
		super(name,  precio,  tiempoEntrega,  cantProductos, precioVenta);
		this.subProductoCarton = subProductoCarton;
	
	}
	
	public void SeleccionarSubProductoCarton() {
		do {
			System.out.println("Productos de papel disponibles: ");
			System.out.println("1.CAJA DE CARTON             2.CARTON PRENSADO "+'\n'
			                 + "3.CARTON CORRUGADO            4.CARTULINA "+'\n'
			                 + "5.CARTON PIEDRA"        );
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
			default:
				System.out.println("opción no disponible");
				break;
			}
			 
			
		}while( (option!=1 && option!=2 &&option!=3 &&option!=4 &&option!=5));
	}
	@Override
	public void MostrarDatos() {
		System.out.println("Producto: "+name);
		System.out.println("Nombre del Subproducto: "+subProductoCarton);
		System.out.println("Cantidad: "+cantProductos);
		
	}
	
}
