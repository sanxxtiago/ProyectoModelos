package mercado;

import java.util.ArrayList;

import articulos.Alimento;
import articulos.Medicina;
import articulos.Ropa;

public class Mercado {

	private int cantidadAlimentos;
	private int cantidadRopas;
	private int cantidadMedicinas;
		
	private ArrayList<Alimento> alimentos = new ArrayList<Alimento>() ;
	private ArrayList<Ropa> ropas = new ArrayList<Ropa>();
	private ArrayList<Medicina> medicinas = new ArrayList<Medicina>();
	
	public Mercado(int cantidadAlimentos, int cantidadRopa, int cantidadMedicinas) {
		this.cantidadAlimentos = cantidadAlimentos;
		this.cantidadMedicinas = cantidadMedicinas;
		this.cantidadRopas = cantidadRopa;
		
	}

	public int getCantidadAlimentos() {
		return cantidadAlimentos;
	}

	public void setCantidadAlimentos(int cantidadAlimentos) {
		this.cantidadAlimentos = cantidadAlimentos;
	}

	public int getCantidadRopas() {
		return cantidadRopas;
	}

	public void setCantidadRopas(int cantidadRopas) {
		this.cantidadRopas = cantidadRopas;
	}

	public int getCantidadMedicinas() {
		return cantidadMedicinas;
	}

	public void setCantidadMedicinas(int cantidadMedicinas) {
		this.cantidadMedicinas = cantidadMedicinas;
	}
	

	
}
