package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface ReporteDAO {
	
	void create(ReporteDAO entity);

	List<ReporteDAO> read(ReporteDAO entity);

	void update(ReporteDAO entity);

	void delete(ReporteDAO entity);

}
