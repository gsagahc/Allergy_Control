package com.alergias.prontuario.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="faususis")
public class Faususis  implements GrantedAuthority{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long matricula;
	public String cod_grupo;

	
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public String getCod_grupo() {
		return cod_grupo;
	}
	public void setCod_grupo(String cod_grupo) {
		this.cod_grupo = cod_grupo;
	}
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return cod_grupo;
	}
	

}
