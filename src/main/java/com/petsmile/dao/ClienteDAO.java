package com.petsmile.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.petsmile.model.Agenda;
import com.petsmile.model.JPAUtil;

public class ClienteDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	// guardar cliente
	public void guardar(Agenda agenda) {
		entity.getTransaction().begin();
		entity.persist(agenda);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// editar cliente
	public void editar(Agenda agenda) {
		entity.getTransaction().begin();
		entity.merge(agenda);
		entity.getTransaction().commit();
		/// JPAUtil.shutdown();
	}

	// buscar cliente
	public Agenda buscar(Long id) {
		Agenda c = new Agenda();
		c = entity.find(Agenda.class, id);
		// JPAUtil.shutdown();
		return c;
	}

	/// eliminar cliente
	public void eliminar(Long id) {
		Agenda c = new Agenda();
		c = entity.find(Agenda.class, id);
		entity.getTransaction().begin();
		entity.remove(c);
		entity.getTransaction().commit();
	}

	// obtener todos los cliente
	public List<Agenda> obtenerAgendas() {
		List<Agenda> listaAgendas = new ArrayList<>();
		Query q = entity.createQuery("SELECT c FROM Cliente c");
		listaAgendas = q.getResultList();
		return listaAgendas;
	}

}
