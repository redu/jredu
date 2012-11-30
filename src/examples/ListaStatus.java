package examples;

import java.util.List;

import br.com.developer.redu.DefaultReduClient;
import br.com.developer.redu.models.Status;

public class ListaStatus {
	private static final String CONSUMER_KEY = "seuconsumer";
	private static final String CONSUMER_SECRET_KEY = "seusecret";
	private static final String PIN = "seupin";
	
	public static void main(String[] args) {
		DefaultReduClient client = new DefaultReduClient(CONSUMER_KEY, CONSUMER_SECRET_KEY, PIN);
		// Lista todos os status de um espaço.
		// Note que você pode passar argumentos opcionais como Null
		List<Status> wall = client.getStatusesBySpace("id de uma disciplina que voce tenha acesso", "Log", null);
		for(Status post : wall){
			System.out.println(wall);
		}
	}	

}
