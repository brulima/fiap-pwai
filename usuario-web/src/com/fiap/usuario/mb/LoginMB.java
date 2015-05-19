package com.fiap.usuario.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.fiap.usuario.to.LoginTO;
import com.fiap.usuario.to.UsuarioTO;

@ManagedBean
@SessionScoped
public class LoginMB {
	
	private List<LoginTO> logins;
	private LoginTO loginTO;
	
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

	public LoginMB() {
		
	}
	
	public String logar(){
		return null;
	}
	
	public String lougout(){
		return null;
	}

}
