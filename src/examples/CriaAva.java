package examples;

import br.com.developer.redu.DefaultReduClient;
import br.com.developer.redu.models.Environment;

public class CriaAva {
	private static final String CONSUMER_KEY = "seuconsumer";
	private static final String CONSUMER_SECRET_KEY = "seusecret";
	private static final String PIN = "seupin";
	
	public static void main(String[] args) {
		DefaultReduClient client = new DefaultReduClient(CONSUMER_KEY, CONSUMER_SECRET_KEY, PIN);
		Environment resposta = client.postEnvironment("O Nome", "O path", 
				"As iniciais", "A descrição");
		// A resposta deve ser um objeto do tipo environment contendo as informações do
		// ava criado
		System.out.println(resposta);
	}
}
