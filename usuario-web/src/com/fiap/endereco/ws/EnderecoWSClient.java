package com.fiap.endereco.ws;

import java.rmi.RemoteException;

import com.fiap.endereco.ws.EnderecoWSProviderStub.ConsultarEndereco;
import com.fiap.endereco.ws.EnderecoWSProviderStub.ConsultarEnderecoResponse;

public class EnderecoWSClient {
	
	public static void main(String[] args) throws RemoteException {
		
		EnderecoWSProviderStub stub = new EnderecoWSProviderStub();
		
		stub.carregarEnderecos(null);
		
		ConsultarEndereco requestConsulta = new ConsultarEndereco();
		requestConsulta.setCep("69918282");
		
		ConsultarEnderecoResponse responseConsulta = stub.consultarEndereco(requestConsulta);
		
		System.out.println(responseConsulta.get_return().getCidade());

	}

}
