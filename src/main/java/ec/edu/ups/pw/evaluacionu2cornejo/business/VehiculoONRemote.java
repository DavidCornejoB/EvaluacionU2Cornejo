package ec.edu.ups.pw.evaluacionu2cornejo.business;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.pw.evaluacionu2cornejo.model.Vehiculo;

@Remote
public interface VehiculoONRemote {
	
	public void insert(Vehiculo v) throws Exception;
	public List<Vehiculo> getVehiculos();

}
