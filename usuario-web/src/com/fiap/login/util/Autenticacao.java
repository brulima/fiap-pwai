package com.fiap.login.util;

import java.util.ArrayList;
import java.util.List;

import com.fiap.usuario.to.LoginTO;

public class Autenticacao {
	
	private List<LoginTO> logins;
	
	public Autenticacao() {
		
		logins = new ArrayList<LoginTO>();
		
		LoginTO loginTO = new LoginTO();
		
		loginTO.setUsuario("Jefferson");
		loginTO.setSenha("Senha1");
		loginTO.setPerfil("consulta");
		
		logins.add(loginTO);
		
		loginTO = new LoginTO();
		
		loginTO.setUsuario("Admin");
		loginTO.setSenha("senhaAdm");
		loginTO.setPerfil("cadastro");
		
		logins.add(loginTO);
		
		loginTO = new LoginTO();
		
		loginTO.setUsuario("Admin1");
		loginTO.setSenha("fiapA");
		loginTO.setPerfil("cadastro");
		
		logins.add(loginTO);
		
	}
	
	public String autenticar(LoginTO loginTO) {
		
		
		for (LoginTO user : logins) {
			
			if(loginTO.equals(user)) {
				if (user.getPerfil().equals("cadastro")) {
					return "cadastro";
				}
				if (user.getPerfil().equals("consulta")) {
					return "consulta";
				}
			}
		}
		
		return "falha";	
	}
}
