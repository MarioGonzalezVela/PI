package conexiones;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Querys extends AbstractConexion implements RecursoDAO{

	Recurso recurso = new Recurso();
		
		public List<Recurso> findAll() {
			return null;
			
//			List<Recurso> listaRecursos = new ArrayList<>(5);
//			try {
//				query = "SELECT * FROM recurso";
//				pst = conn.prepareStatement(query);
//
//				rs = pst.executeQuery();
//			
//				while(rs.next()) {
//					
//					int idRecurso = rs.getInt(1);
//					String nombre = rs.getString(2);
//					String habilidad = rs.getString(3);
//					String modo = rs.getString(4);
//					int idSuperempresa = rs.getInt(5);
//					
//					recurso = new Recurso(idRecurso,nombre,habilidad,modo,idSuperempresa);
//					
//					listaRecursos.add(recurso);
//				}
//				
//				
//				pst.close();
//				rs.close();
//				
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
//			return listaRecursos;	
		}


}
