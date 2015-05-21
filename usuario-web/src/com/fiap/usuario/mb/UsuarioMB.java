package com.fiap.usuario.mb;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

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
		
		EnderecoWSProviderStub stub;
		
		try {
			
			stub = new EnderecoWSProviderStub();
			ConsultarEndereco request = new ConsultarEndereco();
			
			request.setCep("cep");
			
			ConsultarEnderecoResponse response = stub.consultarEndereco(request);
			
			EnderecoTO enderecoTO = new EnderecoTO();
			
			enderecoTO = response.get_return();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public void carregarFoto(){
		
		UsuarioTO usu = new UsuarioTO();
		
		FacesContext context = FacesContext.getCurrentInstance();
		Map<String, Object> map = context.getExternalContext().getSessionMap();
		UsuarioMB frmCadastro= (UsuarioMB)map.get("usuario");
		
		
		usu.setUrlFoto(frmCadastro.getUrlFoto());
		
	}
	
	public void cadastrarUsuario(){
		
	}
	

}
