package modulos;

import java.sql.SQLException;

import articulos.Alimento;
import articulos.Articulo;
import articulos.Medicina;
import articulos.Ropa;
import conexion.Conexion;
import constructorarticulo.Builder;
import constructorarticulo.BuilderAlimento;
import constructorarticulo.BuilderMedicina;
import constructorarticulo.BuilderRopa;
import dataInput.Input;

public class ModuloInsercion implements Modulo{
	
	private Input input = null;
	private Builder builderArticulo = null;
	private Articulo articulo;
	String tipoArticulo;
	
	public ModuloInsercion() {
		input = new Input();
	}

	public void ConstruirArticulo() {
		tipoArticulo = input.getString();
		switch (tipoArticulo) {
		case "Alimento": 
			builderArticulo = new BuilderAlimento();
			builderArticulo.setNombre(input.getString());
			builderArticulo.setPeso(input.getDouble());
			break;
		case "Ropa":
			builderArticulo = new BuilderRopa();
			builderArticulo.setNombre(input.getString());
			builderArticulo.setPeso(input.getDouble());
			builderArticulo.setTalla(input.getInt());
			break;
		case "Medicina":
			builderArticulo = new BuilderMedicina();
			builderArticulo.setNombre(input.getString());
			builderArticulo.setPeso(input.getDouble());
			builderArticulo.setCantidad(input.getInt());
			break;
		default:
		}
		
		articulo = builderArticulo.getResult();
	}
	
	@Override
	public void Operacion() {
		ConstruirArticulo();
		String ssql = "INSERT INTO " + tipoArticulo;
		switch (tipoArticulo) {
		case "Alimento": 
			ssql += " VALUES("+ articulo.getNombre() +","+ articulo.getPeso() +")";
			break;
		case "Ropa":
			Ropa auxRopa = (Ropa) articulo;
			ssql += " VALUES("+ articulo.getNombre() +","+ articulo.getPeso() +","+ auxRopa.getTalla() +")";
			break;
		case "Medicina":
			Medicina auxMedicina = (Medicina) articulo;
			ssql += " VALUES("+ articulo.getNombre() +","+ articulo.getPeso() +","+ auxMedicina.getCantidad() +")";
			break;
		default:
		}
		try {
			Conexion.getSingleton().InsertarDatos(ssql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

}
