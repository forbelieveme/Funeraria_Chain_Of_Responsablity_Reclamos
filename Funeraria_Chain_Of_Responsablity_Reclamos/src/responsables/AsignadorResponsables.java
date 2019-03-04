package responsables;



public class AsignadorResponsables {

public Responsable responsable1;
	
	public AsignadorResponsables() {
		this.responsable1 = new Secretarix(2);
		Responsable responsable2 = new Supervisor(4);
		Responsable responsable3 = new Gerente(7);
		Responsable responsable4 = new Presidente(10);
		
		responsable1.asignarResponsable(responsable2);
		responsable2.asignarResponsable(responsable3);
		responsable3.asignarResponsable(responsable4);
	}

}
