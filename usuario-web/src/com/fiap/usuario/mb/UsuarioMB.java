package com.fiap.usuario.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.fiap.endereco.ws.EnderecoWSProviderStub;
import com.fiap.endereco.ws.EnderecoWSProviderStub.ConsultarEndereco;
import com.fiap.endereco.ws.EnderecoWSProviderStub.ConsultarEnderecoResponse;
import com.fiap.endereco.ws.EnderecoWSProviderStub.EnderecoTO;
import com.fiap.usuario.to.UsuarioTO;

@ManagedBean(name="usuario")
@SessionScoped
public class UsuarioMB {
	
	private UsuarioTO usuarioTO;
	private String urlFoto;
	
	public UsuarioMB(){
		
		usuarioTO = new UsuarioTO();
		
	}
	
	public UsuarioTO getUsuarioTO() {
		return usuarioTO;
	}

	public void setUsuarioTO(UsuarioTO usuarioTO) {
		this.usuarioTO = usuarioTO;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	
	public void consultarEndereco(){
		
		
	}
		
	
	
	public void cadastrarFoto(){
		
	}
	
	public void cadastrarUsuario(){
		
	}
	

}
