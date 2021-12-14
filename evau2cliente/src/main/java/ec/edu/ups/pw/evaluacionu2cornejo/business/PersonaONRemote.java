package ec.edu.ups.pw.evaluacionu2cornejo.business;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.pw.evaluacionu2cornejo.model.Persona;

@Remote
public interface PersonaONRemote {
	
	public void insert(Persona p) throws Exception;
	public List<Persona> getPersonas();

}
