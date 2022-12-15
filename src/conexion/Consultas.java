package conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import articulos.Articulo;

public class Consultas {
	
	private ResultSet rs = null;
	private Statement sql;
	
	public Consultas(Statement sql) {
		this.sql = sql;
	}
	
	//La tabla a carga está implícita en la sentencia sql
	public ArrayList<Articulo> CargarDatos(CargarDatos cargarDesde) {
		cargarDesde.setStatement(sql);
		cargarDesde.CargarDesdeTabla();
		return cargarDesde.getArticulos();
	}
	
	public void InsertarDatos(String ssql) {
		
		try {
			sql.executeUpdate(ssql);
		} catch (SQLException e) {
			System.out.println("No fue posible realizar la operación.");
		}		
		
	}
	
}
