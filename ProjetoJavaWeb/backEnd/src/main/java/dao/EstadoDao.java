package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entidades.Estado;

public class EstadoDao {
	
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Estado estado) {
		manager.getTransaction().begin();
		
		manager.persist(estado);
		
		manager.getTransaction().commit();
	}
	
	public void altera(Estado estado) {
		manager.getTransaction().begin();
		
		manager.merge(estado);
		
		manager.getTransaction().commit();		
	}

	public void remove(Estado estado) {
		manager.getTransaction().begin();

		manager.remove(estado);
		
		manager.getTransaction().commit();

	}
	
	public List<Estado> todos() {
	  return manager.createQuery("from Estado", Estado.class).getResultList();
	}

	public List<Estado> ordenadosPeloNome() {
		return manager.createQuery("select e from Estado e order by e.nome", Estado.class).getResultList();
	}	
	
	public Estado porId(Long id) {
		return manager.find(Estado.class, id);
	}

}
