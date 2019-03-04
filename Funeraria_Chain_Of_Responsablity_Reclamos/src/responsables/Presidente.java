package responsables;

import singleton.Impresora;

public class Presidente implements Responsable{
	
	private Responsable responsable;
	private int nivelAutoridad;

	public Presidente(int nivelAutoridad) {
		this.nivelAutoridad = nivelAutoridad;
	}

	@Override
	public void asignarResponsable(Responsable siguienteResponsable) {
		this.responsable = siguienteResponsable;
	}

	@Override
	public void resolver(Receptor recepetor) {

		if (recepetor.obtenerNivelReclamo() <= nivelAutoridad) {
			Impresora.getInstance().imprimir("Sera atendido por nuestra persona a cargo: " + getClass().getName());
		} else {
			this.responsable.resolver(new Receptor(recepetor.obtenerNivelReclamo()));
		}

	}

}
