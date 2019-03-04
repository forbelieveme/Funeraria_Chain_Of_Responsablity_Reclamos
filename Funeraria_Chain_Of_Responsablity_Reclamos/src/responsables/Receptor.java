package responsables;

public class Receptor {

	private int rubricaReclamo;

	public Receptor(int rubricaReclamo) {
		this.rubricaReclamo = rubricaReclamo;
	}

	public int obtenerNivelReclamo() {
		return this.rubricaReclamo;
	}

}
