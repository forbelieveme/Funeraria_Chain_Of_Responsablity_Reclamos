package main;

import responsables.AsignadorResponsables;
import responsables.Receptor;

public class Prueba_Reclamos_Chain_Of_Responsability {

	public static void main(String[] args) {

		AsignadorResponsables asignadorResponsables = new AsignadorResponsables();

		int reclamo = 8;

		asignadorResponsables.responsable1.resolver(new Receptor(reclamo));
	}

}
