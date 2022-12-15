package conexion;

import java.sql.*;
import java.util.ArrayList;

import articulos.Alimento;
import articulos.Articulo;

public class Conexion {

	
	static private Conexion instance = null;
	
	public Consultas consultas = new Consultas(null);
	
	//singleton
    static public Conexion getSingleton() throws SQLException {

        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public String metodo() {
        return "Singleton instanciado bajo demanda";
    }
	
	public String url = "jdbc:mysql://localhost:3306/proyecto";
	public String usuario = "root";
	public String contrasena = ""; 
	
	public Statement sql = null;
	public Connection conn = null;
	
	public Conexion() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, usuario, contrasena);
			consultas = new Consultas(sql);
			if(conn != null) {
				sql = conn.createStatement();						
			}
			
			
		}catch(ClassNotFoundException e) {
			System.out.println("Class Not Found Exception");

		}catch(SQLException e) {
			System.out.println("SQL Exception");
		}
	}
	
	public ArrayList<Articulo> CargarDatos(CargarDatos cargarDesde) {
		return consultas.CargarDatos(cargarDesde);
	}

	public void InsertarDatos(String ssql) {
		consultas.InsertarDatos(ssql);
	}
	
	public void Desconectar() throws SQLException {
		consultas = null;
		conn.close();
		System.out.println("Se ha cerrado la CONEXION");
	}
}
