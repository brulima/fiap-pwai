package com.fiap.endereco.teste;

import com.fiap.endereco.to.EnderecoTO;
import com.fiap.endereco.ws.EnderecoWSProvider;

public class ClasseTeste {

	public static void main(String[] args) {

		EnderecoWSProvider tes = new EnderecoWSProvider();
		
		tes.carregarEnderecos();
		
		EnderecoTO endereco = tes.consultarEndereco("69918282");
		
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		
		endereco = tes.consultarEndereco("231");
		
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());

	}

}
