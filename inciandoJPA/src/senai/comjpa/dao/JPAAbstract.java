package senai.comjpa.dao;

import javax.persistence.EntityManager;
import senai.comjpa.dao.jpa.JPAConnection;

public abstract class JPAAbstract<T> extends JPAConnection {
	public void incluir(T p1) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		em.close();
	}

	public abstract String getEntityName();
}
