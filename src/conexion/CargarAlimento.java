package conexion;

import java.sql.SQLException;

import articulos.Alimento;

public class CargarAlimento extends CargarDatos{

	@Override
	public void CargarDesdeTabla() {
		articulos.clear();
		String ssql = "Select * FROM Alimento";
		try {
			rs = sql.executeQuery(ssql);
			boolean r = rs.next();
			int i = 0;
			while (r) {
				Alimento auxAlimento = new Alimento();
				auxAlimento.setNombre(rs.getString("nombre"));
				auxAlimento.setPeso(Double.parseDouble(rs.getString("peso")));
				
				articulos.add(auxAlimento);
				r=rs.next();
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
