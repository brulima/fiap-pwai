package com.fiap.endereco.ws;

import java.util.HashMap;
import java.util.Map;

import com.fiap.endereco.to.EnderecoTO;

public class EnderecoWSProvider {
	
	private Map<String, EnderecoTO> enderecos = new HashMap<>();
	
	public void carregarEnderecos() {
		
		EnderecoTO endereco = new EnderecoTO();
		
		endereco.setCep("69905008");
		endereco.setLogradouro("Travessa Felisbela do Nascimento");
		endereco.setBairro("Capoeira");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.put(endereco.getCep(), endereco);
		
		
		endereco = new EnderecoTO();
		
		endereco.setCep("69918282");
		endereco.setLogradouro("Rua Fernando Lira");
		endereco.setBairro("Isaura Parente");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.put(endereco.getCep(), endereco);
		
		endereco = new EnderecoTO();
		
		endereco.setCep("69917556");
		endereco.setLogradouro("Alameda Flamboyant");
		endereco.setBairro("Ch�cara Ip�");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.put(endereco.getCep(), endereco);
		
		
		endereco = new EnderecoTO();
		
		endereco.setCep("69918848");
		endereco.setLogradouro("Rua Fluminense");
		endereco.setBairro("Conquista");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.put(endereco.getCep(), endereco);

		
		endereco = new EnderecoTO();
		
		endereco.setCep("69915437");
		endereco.setLogradouro("Alameda Fran�a");
		endereco.setBairro("Jardim Europa");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.put(endereco.getCep(), endereco);
		
	}

	public EnderecoTO consultarEndereco(String cep) {
		
		for (EnderecoTO e : enderecos.values()) {
			if (e.getCep().equals(cep)) {
				return e;
			}
		}
		
		return null;
		
	}
	
	

}
