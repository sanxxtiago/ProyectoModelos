package constructorarticulo;

import articulos.Articulo;
import articulos.Medicina;

public class BuilderMedicina implements Builder{

	private Medicina medicina;
	
	public BuilderMedicina() {
		this.reset();
		this.setTipo();
	}
	
	@Override
	public void reset() {
		medicina = new Medicina();		
	}

	@Override
	public void setNombre(String nombre) {
		medicina.setNombre(nombre);
	}

	@Override
	public void setPeso(double peso) {
		medicina.setPeso(peso);
	}

	@Override
	public void setTalla(int talla) {}

	@Override
	public void setCantidad(int cantidad) {
		medicina.setCantidad(cantidad);
	}

	@Override
	public Articulo getResult() {
		return medicina;
	}

	@Override
	public void setTipo() {
		medicina.setTipo("Medicina");		
	}

}
