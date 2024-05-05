package com.alergias.prontuario.model;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;



@Table(name="Faprtcad")
@Entity(name = "Prontuario")
public class Prontuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String cod_prt;
	private String cpf;
    private String nome_pac;
    
	
	@OneToMany(mappedBy = "cod_prt")
	@OrderBy("dt_hr_incl_alergia DESC")
	private List<Alergia_Prontuario> alergias;
	
	public String getCod_prt() {
		return cod_prt;
	}

	public void setCod_prt(String cod_prt) {
		this.cod_prt = cod_prt;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome_pac() {
		return nome_pac;
	}

	public void setNome_pac(String nome_pac) {
		this.nome_pac = nome_pac;
	}

	public List<Alergia_Prontuario> getAlergias() {
		return alergias;
	}

	public void setAlergias(List<Alergia_Prontuario> alergias) {
		this.alergias = alergias;
	}

	
	

}
