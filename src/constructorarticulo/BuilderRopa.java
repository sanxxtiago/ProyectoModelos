package constructorarticulo;

import articulos.Articulo;
import articulos.Ropa;

public class BuilderRopa implements Builder{

	private Ropa ropa;
	
	public BuilderRopa(){
		this.reset();
		this.setTipo();
	}
	
	@Override
	public void reset() {
		ropa = new Ropa();		
	}

	@Override
	public void setNombre(String nombre) {
		ropa.setNombre(nombre);
	}

	@Override
	public void setPeso(double peso) {
		ropa.setPeso(peso);
	}

	@Override
	public void setTalla(int talla) {
		ropa.setTalla(talla);
	}

	@Override
	public void setCantidad(int cantidad) {	}

	@Override
	public Articulo getResult() {
		return ropa;
	}

	@Override
	public void setTipo() {
		ropa.setTipo("Ropa");
	}

}
