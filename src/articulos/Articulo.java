package articulos;

public class Articulo {

	private String tipo;
	private String nombre;
	private double peso; //Kg

	public Articulo() {}
	
	public Articulo(String nombre, double peso) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.peso = peso;
		
	}
	
	public String getTipo()
	{
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
