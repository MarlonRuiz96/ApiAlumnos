package com.mr.alumnos.DaoRol;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mr.alumnos.DaoRol.Impl.IDaoRol;
import com.mr.alumnos.Entity.Persona;


@Repository
@Transactional
public class DaoRol implements IDaoRol{
	
	 @PersistenceContext
	    private EntityManager em;
	 
	 @Transactional(readOnly = true)
	 @Override
	    public List<Persona> findAll() {
		 try {
	            List<Persona> listaRol = em.createQuery("FROM Persona", Persona.class).getResultList();
	            return listaRol;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	 }

	@Override
	public Persona save(Persona persona) {
		try {
            em.persist(persona);
            return persona;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}

	@Override
	public Persona update(Persona persona) {
		try {
            em.merge(persona);
            return persona;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}
	
	
	
	 }

