package articulos;

public class Medicina extends Articulo{

	private int cantidad;
	
	public Medicina() {	}
	
	public Medicina(String nombre, double peso, int cantidad) {
		super(nombre, peso);
		this.setCantidad(cantidad);
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
