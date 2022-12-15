package conexion;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import articulos.Articulo;

public abstract class CargarDatos {
	
	protected ResultSet rs = null;
	protected Statement sql;
	protected ArrayList<Articulo> articulos = new ArrayList<Articulo>();
	
	public void setStatement(Statement sql) {
		this.sql = sql;
	}
	
	public abstract void CargarDesdeTabla();
	
	public ArrayList<Articulo> getArticulos(){
		return articulos;
	}
}
