package constructorarticulo;

import articulos.Articulo;

public interface Builder {

	public void reset();
	public void setTipo();
	public void setNombre(String nombre);
	public void setPeso(double peso);
	public void setTalla(int talla);
	public void setCantidad(int cantidad);
	public Articulo getResult();
	
}
