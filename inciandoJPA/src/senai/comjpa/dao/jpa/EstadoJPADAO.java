package senai.comjpa.dao.jpa;

import senai.comjpa.dao.EstadoDAO;
import senai.comjpa.dao.JPAAbstract;
import senai.comjpa.pojo.Estado;

public class EstadoJPADAO extends JPAAbstract<Estado> implements EstadoDAO {
	
	public String getEntityName() {
		return "Estado";
	}

}
