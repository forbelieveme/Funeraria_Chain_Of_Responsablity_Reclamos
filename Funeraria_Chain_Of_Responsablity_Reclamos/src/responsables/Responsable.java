package responsables;

public interface Responsable {
	
	public void asignarResponsable(Responsable siguienteResponsable);
	
	public void resolver(Receptor recepetor);

}
