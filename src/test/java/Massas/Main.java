package Massas;

import mass.MassMap;
import metodos.Metodos;

public class Main {

	public String key;

	public static void mainBoard() {
		Metodos.postMain(MassMap.setBaseUri(), "/boards/", MassMap.CreateBoard());
		Metodos.getStatusCode();
		Metodos.getBody();
		Metodos.validaStatusCode(200);
	}

	public static void mainList() {
		Metodos.postMain(MassMap.setBaseUri(), "/lists", MassMap.CreateList());
		Metodos.getStatusCode();
		Metodos.getBody();
		Metodos.validaStatusCode(200);
	}

	public static void mainCard() {
		Metodos.postMain(MassMap.setBaseUri(), "/cards/", MassMap.CreateCard());
		Metodos.getStatusCode();
		Metodos.getBody();
		Metodos.validaStatusCode(200);
	}

	public static void mainUpdateCard() {
		String id = Metodos.getResponse("id");
		Metodos.putCard(MassMap.setBaseUri(), "/cards/"+id, MassMap.updateCard());
		Metodos.getStatusCode();
		Metodos.getBody();
		Metodos.validaStatusCode(200);
	
	}

	public static void mainDeliteBoard() {
		String id = Metodos.getResponse("idBoard");
		Metodos.DeliteBoard(MassMap.setBaseUri(), "/boards/"+id, MassMap.DeliteBoard());
		Metodos.getStatusCode();
		Metodos.getBody();
		Metodos.validaStatusCode(200);
		
	}
}
