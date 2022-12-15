package reparticion;

import java.util.Hashtable;

import mercado.Mercado;

public class RepartirFamilia implements EstrategiaRepartir{

	private int cantidadFamilias;
	
	public RepartirFamilia(int cantidadFamilias) {
		this.cantidadFamilias = cantidadFamilias;
	}
	
	@Override
	public Mercado Repartir(Hashtable<String, Integer> cantidades) {
		//Repartir para una cantidad de familiar
		return new Mercado(0, 0, 0);
	}

}
