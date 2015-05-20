package com.fiap.usuario.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.fiap.login.util.Autenticacao;
import com.fiap.usuario.to.LoginTO;

@ManagedBean
@SessionScoped
public class LoginMB {
	
	private List<LoginTO> logins;
	private LoginTO loginTO;
	
	public LoginMB() {
		
		loginTO = new LoginTO();
		
	}

	public List<LoginTO> getLogins() {
		return logins;
	}

	public void setLogins(List<LoginTO> logins) {
		this.logins = logins;
	}

	public LoginTO getLoginTO() {
		return loginTO;
	}

	public void setLoginTO(LoginTO loginTO) {
		this.loginTO = loginTO;
	}
	
	public String logar(){
		
		String retorno = "falha";
		
		Autenticacao aut = new Autenticacao();
		
		if(aut.autenticar(getLoginTO())) {
			retorno = "autenticado";
		}
		
		return retorno;
	}
	
	public String lougout(){
		
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("loginMB");

		return "logout";
	}

}
