package ec.edu.ups.pw.evaluacionu2cornejo.view;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import ec.edu.ups.pw.evaluacionu2cornejo.business.PersonaONRemote;
import ec.edu.ups.pw.evaluacionu2cornejo.business.VehiculoONRemote;
import ec.edu.ups.pw.evaluacionu2cornejo.model.Persona;
import ec.edu.ups.pw.evaluacionu2cornejo.model.Vehiculo;
import ec.edu.ups.pw.evaluacionu2cornejo.view.VentanaIngreso;

public class VentanaIngreso {

	private PersonaONRemote personaRemote;
	private VehiculoONRemote vehiculoRemote;

	public void conectar() throws Exception {
		try {
			final Hashtable<String, Comparable> jndiProperties = new Hashtable<String, Comparable>();

			jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.wildfly.naming.client.WildFlyInitialContextFactory");
			jndiProperties.put("jboss.naming.client.ejb.context", true);

			jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			jndiProperties.put(Context.SECURITY_PRINCIPAL, "demop59");
			jndiProperties.put(Context.SECURITY_CREDENTIALS, "demop59");

			final Context context = new InitialContext(jndiProperties);

			final String lookupName = "ejb:/evaluacionu2cornejo/PersonaON!ec.edu.ups.pw.evaluacionu2cornejo.business.PersonaONRemote";

			this.personaRemote = (PersonaONRemote) context.lookup(lookupName);

			final String lookupName2 = "ejb:/evaluacionu2cornejo/VehiculoON!ec.edu.ups.pw.evaluacionu2cornejo.business.VehiculoONRemote";

			this.vehiculoRemote = (VehiculoONRemote) context.lookup(lookupName2);

		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	// INSERTAMOS PERSONAS
	public void crearPersona() {
		Persona p = new Persona();
		p.setCedula("0105585525");
		p.setNombre("David Cornejo");
		p.setDireccion("Misicata");

		try {
			personaRemote.insert(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// INSERTAMOS VEHICULOS
	public void crearVehiculo() {
		Vehiculo pr = new Vehiculo();
		pr.setCodigo(1);
		pr.setMarca("Ford");
		pr.setModelo("Mustang 68'");
		pr.setColor("rojo");

		try {
			vehiculoRemote.insert(pr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void actualizarVehiculo() {
		Vehiculo pr = new Vehiculo();
		pr.setCodigo(1);
		pr.setMarca("Chevrolet");
		pr.setModelo("Impala");
		pr.setColor("negro");

		try {
			vehiculoRemote.update(pr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaIngreso vtnClc = new VentanaIngreso();
		try {
			vtnClc.conectar();

			//vtnClc.crearPersona();

			//vtnClc.crearVehiculo();
			
			vtnClc.actualizarVehiculo();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
