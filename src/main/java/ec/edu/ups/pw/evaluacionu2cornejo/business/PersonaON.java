package ec.edu.ups.pw.evaluacionu2cornejo.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.evaluacionu2cornejo.dao.PersonaDAO;
import ec.edu.ups.pw.evaluacionu2cornejo.model.Persona;

@Stateless
public class PersonaON implements PersonaONRemote{
	
	@Inject
	private PersonaDAO daoPersona;
	
	public void insert(Persona p) throws Exception{
		daoPersona.insert(p);
	}
	
	public List<Persona> getPersonas(){
		return daoPersona.getList();
	}

}
