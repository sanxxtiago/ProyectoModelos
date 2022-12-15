package mercado;

public class SingletonMercado {

	static private Mercado[] mercados;
	
	public SingletonMercado(int cantidadMercados) {
		mercados = new Mercado[cantidadMercados];

	}
	
	public Mercado getMercado(int cantidad) {
		
		Mercado mercado = null;
		for (int i = 0; i< mercados.length ; i++) {
			if(mercados[i] == null) {
				mercados[i] = new Mercado(cantidad, 0, 0);
			}
			if(mercados[i].getCantidadAlimentos() == cantidad){
				mercado = mercados[i];
			}else {
				return null;
			}
		}	
		return mercado;
	}
	
}

