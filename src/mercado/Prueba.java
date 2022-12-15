package mercado;

public class Prueba {
	
	public static void main(String args[]) {
		SingletonMercado singletonMercado = new SingletonMercado(3);
		Mercado mercado = singletonMercado.getMercado(4);
		Mercado mercado2 = singletonMercado.getMercado(4);

		//Se usa la comparación para determinar que en realidad se retorno 
		//el mismo objeto en lugar de retornar uno nuevo
		
		if(mercado == mercado2) {
			System.out.println("Los objetos son idénticos");
		}
		
		System.out.println(mercado.getCantidadAlimentos());
		System.out.println(mercado2.getCantidadAlimentos());

	}

}

