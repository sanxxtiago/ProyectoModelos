package conexion;

import java.sql.SQLException;

import articulos.Ropa;

public class CargarRopa extends CargarDatos{

	@Override
	public void CargarDesdeTabla() {
		articulos.clear();
		String ssql = "Select * FROM Ropa";
		try {
			rs = sql.executeQuery(ssql);
			boolean r = rs.next();
			int i = 0;
			while (r) {
				Ropa auxRopa = new Ropa();
				auxRopa.setNombre(rs.getString("nombre"));
				auxRopa.setPeso(Double.parseDouble(rs.getString("peso")));
				auxRopa.setTalla(Integer.parseInt(rs.getString("talla")));
				articulos.add(auxRopa);
				r=rs.next();
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
