package reparticion;

import java.util.Hashtable;

import mercado.Mercado;

public interface EstrategiaRepartir {

	public Mercado Repartir(Hashtable<String, Integer> cantidades);
	
}
