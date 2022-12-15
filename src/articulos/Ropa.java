package articulos;

public class Ropa extends Articulo{
	
	private int talla;

	public Ropa() {}
	
	public Ropa(String nombre, double peso, int talla) {
		super(nombre, peso);
		this.setTalla(talla);
		
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	
}
