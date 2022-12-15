package constructorarticulo;

import articulos.Alimento;
import articulos.Articulo;

public class BuilderAlimento implements Builder{

	private Alimento alimento;
	
	public BuilderAlimento() {
		this.reset();
		this.setTipo();
	}
	@Override
	public void reset() {
		alimento = new Alimento();
		
	}

	@Override
	public void setNombre(String nombre) {
		alimento.setNombre(nombre);
	}

	@Override
	public void setPeso(double peso) {
		alimento.setPeso(peso);		
	}

	@Override
	public void setTalla(int talla) {}

	@Override
	public void setCantidad(int cantidad) {}

	@Override
	public Articulo getResult() {
		return alimento;
	}
	
	@Override
	public void setTipo() {
		alimento.setTipo("Alimento");
		
	}
	
}
