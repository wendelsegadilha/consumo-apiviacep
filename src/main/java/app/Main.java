package app;

import java.io.IOException;

import model.Endereco;
import service.ViaCepService;

public class Main {

	public static void main(String[] args) {
		
		ViaCepService vcs = new ViaCepService();
		
		try {
			
			Endereco endereco = vcs.getEndereco("65300855");
			System.out.println(endereco.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
