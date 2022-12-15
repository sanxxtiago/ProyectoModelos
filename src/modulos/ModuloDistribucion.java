package modulos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import articulos.Articulo;
import conexion.CargarAlimento;
import conexion.CargarMedicina;
import conexion.CargarRopa;
import conexion.Conexion;
import dataInput.Input;
import mercado.Mercado;
import reparticion.EstrategiaRepartir;
import reparticion.RepartirFamilia;
import reparticion.RepartirPersona;


public class ModuloDistribucion implements Modulo{

	ArrayList<Articulo> alimentos = new ArrayList<Articulo>();
	ArrayList<Articulo> ropas = new ArrayList<Articulo>();
	ArrayList<Articulo> medicinas = new ArrayList<Articulo>();
	private Hashtable<String, Integer> cantidades = new Hashtable<String, Integer>();
	private Input in = new Input();
	private EstrategiaRepartir estrategiaRepartir;

	@Override
	public void Operacion() {
		try {
			alimentos = Conexion.getSingleton().CargarDatos(new CargarAlimento());
			ropas = Conexion.getSingleton().CargarDatos(new CargarRopa());
			medicinas = Conexion.getSingleton().CargarDatos(new CargarMedicina());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ContarTotalArticulosPorNombre();
	}
	
	private void ContarTotalArticulosPorNombre() {
		Hashtable<String, Integer> cantidades = new Hashtable<String, Integer>();
		//Cuenta el total según el nombre
		//Ejemplo, si hay varios registros de arroz con diferentes cantidades
		//Hace la suma y guarda la cantidad en el diccionario con el nombre de arroz
		for (Articulo alimento : alimentos) {
			
		}
	}
	
	public Mercado RepartirArticulos(int opc) {
		if(opc == 1) {
			int cf = in.getInt();
			estrategiaRepartir = new RepartirFamilia(cf);
		}
		else {
			estrategiaRepartir = new RepartirPersona();
		}
		
		return estrategiaRepartir.Repartir(cantidades);
	}

}
