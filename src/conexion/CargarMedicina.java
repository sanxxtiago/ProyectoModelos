package conexion;

import java.sql.SQLException;

import articulos.Medicina;

public class CargarMedicina extends CargarDatos{

	@Override
	public void CargarDesdeTabla() {
		articulos.clear();
		String ssql = "Select * FROM Medicina";
		try {
			rs = sql.executeQuery(ssql);
			boolean r = rs.next();
			int i = 0;
			while (r) {
				Medicina auxMedicina = new Medicina();
				auxMedicina.setNombre(rs.getString("nombre"));
				auxMedicina.setCantidad(Integer.parseInt(rs.getString("cantidad")));
				auxMedicina.setPeso(Double.parseDouble(rs.getString("peso")));
				
				articulos.add(auxMedicina);
				r=rs.next();
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
