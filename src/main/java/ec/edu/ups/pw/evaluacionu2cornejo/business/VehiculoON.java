package ec.edu.ups.pw.evaluacionu2cornejo.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.evaluacionu2cornejo.dao.VehiculoDAO;
import ec.edu.ups.pw.evaluacionu2cornejo.model.Vehiculo;

@Stateless
public class VehiculoON implements VehiculoONRemote{
	
	@Inject
	private VehiculoDAO daoVehiculo;
	
	public void insert(Vehiculo v) throws Exception{
		daoVehiculo.insert(v);
	}
	
	public void update(Vehiculo v) throws Exception{
		daoVehiculo.update(v);
	}
	
	public List<Vehiculo> getVehiculos(){
		return daoVehiculo.getList();
	}

}
