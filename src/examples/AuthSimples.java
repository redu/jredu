package examples;

import java.util.Scanner;

import br.com.developer.redu.DefaultReduClient;

public class AuthSimples {
	private static final String CONSUMER_KEY = "seuconsumer";
	private static final String CONSUMER_SECRET_KEY = "seusecret";
	
	public static void main(String[] args) {
		DefaultReduClient redu = new DefaultReduClient(CONSUMER_KEY, CONSUMER_SECRET_KEY);
		Scanner in = new Scanner(System.in);
		System.out.println("Visit this url: "+redu.getAuthorizeUrl());
		System.out.println("Enter your pin:");
		String pin = in.nextLine();
		
		redu.initClient(pin); // Só é necessário pedir um pin por usuário.
		
		// Teste a autenticação com uma requisição simples, este metódo deve retornar
		// as informações do usuário autorizado.
		System.out.println(redu.getMe());
	}	
}
