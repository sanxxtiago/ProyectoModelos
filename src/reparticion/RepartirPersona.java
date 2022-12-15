package reparticion;

import java.util.Hashtable;

import mercado.Mercado;

public class RepartirPersona implements EstrategiaRepartir{

	@Override
	public Mercado Repartir(Hashtable<String, Integer> cantidades) {
		//Repartir una cantidad determinada para una persona
		return new Mercado(0, 0, 0);
	}

}
