package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entidades.Cidade;


public class CidadeDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Cidade cidade) {
		manager.getTransaction().begin();
		
		manager.persist(cidade);
		
		manager.getTransaction().commit();
	}
	
	public void altera(Cidade cidade) {
		manager.getTransaction().begin();
		
		manager.merge(cidade);
		
		manager.getTransaction().commit();		
	}

	public void remove(Cidade cidade) {
		manager.getTransaction().begin();

		manager.remove(cidade);
		
		manager.getTransaction().commit();

	}
	
	public List<Cidade> todos() {
	  return manager.createQuery("from Cidade", Cidade.class).getResultList();
	}

	public List<Cidade> ordenadosPeloNome() {
		return manager.createQuery("select c from Cidade c order by c.nome", Cidade.class).getResultList();
	}	
	
	public Cidade porId(Long id) {
		return manager.find(Cidade.class, id);
	}

	
}
