package com.fiap.usuario.mb;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.fiap.login.util.Autenticacao;
import com.fiap.usuario.to.LoginTO;

@ManagedBean(name="login")
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
		
		Autenticacao aut = new Autenticacao();
		
		return aut.autenticar(getLoginTO());
	}
	
	public String lougout(){
		
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("loginMB");

		return "logout";
	}
	

}
