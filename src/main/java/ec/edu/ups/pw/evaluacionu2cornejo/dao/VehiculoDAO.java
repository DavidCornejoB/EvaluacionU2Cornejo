package ec.edu.ups.pw.evaluacionu2cornejo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.evaluacionu2cornejo.model.Vehiculo;

@Stateless
public class VehiculoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Vehiculo ve) {
		em.persist(ve);
		
	}
	
	public void update(Vehiculo ve) {
			em.merge(ve);
		}
	
	public Vehiculo read(int id) {
		Vehiculo ve = em.find(Vehiculo.class, id);
		return ve;
	}
	
	public void delete(int id) {
		Vehiculo ve = em.find(Vehiculo.class, id);
		em.remove(ve);
	}
	
	public List<Vehiculo> getList(){
		List<Vehiculo> listado = new ArrayList<Vehiculo>();
		
		String jpql = "SELECT ve FROM Vehiculo ve";
				
		
		Query query = em.createQuery(jpql, Vehiculo.class);
		
		listado = query.getResultList();
		
		return listado;
		
		//JSPQL -> SQL
		
	}

}
