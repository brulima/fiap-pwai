package com.fiap.endereco.ws;

import java.util.List;

import com.fiap.endereco.to.EnderecoTO;

public class EnderecoWSProvider {
	
	private List<EnderecoTO> enderecos;

	public EnderecoTO consultarEndereco(String cep) {
		
		for (EnderecoTO endereco : enderecos) {
			if (endereco.getCep().equals(cep)) {
				return endereco;
			}
		}
		
		return null;
		
	}
	
	public void carregarEnderecos() {
		
		EnderecoTO endereco = new EnderecoTO();
		
		endereco.setCep("69905008");
		endereco.setLogradouro("Travessa Felisbela do Nascimento");
		endereco.setBairro("Capoeira");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.add(endereco);
		
		
		endereco = new EnderecoTO();
		
		endereco.setCep("69918282");
		endereco.setLogradouro("Rua Fernando Lira");
		endereco.setBairro("Isaura Parente");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.add(endereco);
		
		endereco = new EnderecoTO();
		
		endereco.setCep("69917556");
		endereco.setLogradouro("Alameda Flamboyant");
		endereco.setBairro("Chácara Ipê");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.add(endereco);
		
		
		endereco = new EnderecoTO();
		
		endereco.setCep("69918848");
		endereco.setLogradouro("Rua Fluminense");
		endereco.setBairro("Conquista");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.add(endereco);

		
		endereco = new EnderecoTO();
		
		endereco.setCep("69915437");
		endereco.setLogradouro("Alameda França");
		endereco.setBairro("Jardim Europa");
		endereco.setCidade("Rio Branco");
		endereco.setEstado("AC");
		
		enderecos.add(endereco);
		
	}

}
