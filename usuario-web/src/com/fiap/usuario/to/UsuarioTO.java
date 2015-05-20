package com.fiap.usuario.to;

import java.io.Serializable;
import java.util.Calendar;

import com.fiap.endereco.ws.EnderecoWSProviderStub.EnderecoTO;

public class UsuarioTO implements Serializable {

	public UsuarioTO() {
		super();
	}
	
	private String nome;
	private String sobrenome;
	private EnderecoTO enderecoTO;
	private String telefone;
	private int idade;
	private Calendar dataNascimento = Calendar.getInstance();
	private String urlFoto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public EnderecoTO getEnderecoTO() {
		return enderecoTO;
	}
	public void setEnderecoTO(EnderecoTO enderecoTO) {
		this.enderecoTO = enderecoTO;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

}
