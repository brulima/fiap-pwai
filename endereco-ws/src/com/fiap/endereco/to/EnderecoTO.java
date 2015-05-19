package com.fiap.endereco.to;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="TAB_ENDERECO")
@GenericGenerator(name="seqEndereco", strategy="increment")
public class EnderecoTO implements Serializable{
	
	public EnderecoTO() {	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqEndereco")
	@Column(name="DS_CEP")
	private String cep;
	
	@Column(name="DS_LOGRADOURO")
	private String logradouro;
	
	@Column(name="DS_BAIRRO")
	private String bairro;
	
	@Column(name="DS_CIDADE")
	private String cidade;
	
	@Column(name="DS_ESTADO")
	private String estado;
	
	@Column(name="DS_COMLEMENTO")
	private String complemento;
	
	@Column(name="NR_NUMERO")
	private int numero;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
