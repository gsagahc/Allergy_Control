package com.alergias.prontuario.controller.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {

	private String apelido;
	private String senha;


	public String getApelido() {
		return apelido;
	}

	public String getSenha() {
		return senha;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(apelido, senha);
	}

}