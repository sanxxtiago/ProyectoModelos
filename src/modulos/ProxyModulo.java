package modulos;

public class ProxyModulo implements Modulo{

	private Modulo moduloInsercion;
	private Modulo moduloDistribucion;
	private Modulo moduloReal;
	
	public void UsarModulo(int opc) {
		switch (opc) {
		case 1: 
			if(moduloInsercion == null) {
				moduloInsercion = new ModuloInsercion();
			}
			moduloReal = moduloInsercion;
			break;
		case 2:
			if(moduloDistribucion == null) {
				moduloDistribucion = new ModuloDistribucion();
			}	
			moduloReal = moduloDistribucion;
			break;
		}
		Operacion();
		
	}
	
	@Override
	public void Operacion() {
		moduloReal.Operacion();
	} 
	


}
