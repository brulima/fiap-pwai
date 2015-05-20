package com.fiap.usuario.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.fiap.usuario.to.UsuarioTO;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	
	private UsuarioTO usuarioTO;
	private String urlFoto;
	
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

	public UsuarioMB(){
		
		usuarioTO = new UsuarioTO();
		
	}
	
	public void consultarEndereco(){
		
	}
	
	public void cadastrarFoto(){
		
	}
	
	public void cadastrarUsuario(){
		
	}
	

}
