package com.alergias.prontuario.model;




import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.alergias.prontuario.controller.dto.DadosAlergiaDto;



@Entity(name = "Alergia")
@Table(name="alergia_prontuario")

public class Alergia_Prontuario implements Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="sequence_alerg", sequenceName="sq_seq_aleprt")
	@Column(name="id_alergia")
	private long id_alergia;
	
	@JoinColumn(name="cod_prt")
	private String cod_prt;
	@Column(name="cod_sal")
	private String cod_sal;
	
	@Column(name="complemento")
	private String complemento;
	@Column(name="cod_pro")
	private String cod_pro;
	@Column(name="cod_pro_canc")
	private String cod_pro_canc;
	
	@Column(name="dt_hr_incl_alergia")
	private LocalDateTime dt_hr_incl_alergia = LocalDateTime.now();
	@Column(name="dt_hr_canc_alergia")
	private LocalDateTime dt_hr_canc_alergia;
	@Column(name="alerg_txt")
	private String alerg_txt;  
	
	
    public Alergia_Prontuario() {
	
	}


	public Alergia_Prontuario(DadosAlergiaDto dados) {
       this.cod_prt = dados.getCod_prt();
	   this.cod_pro_canc = dados.getCod_pro();
	   this.cod_sal = dados.getCod_sal();
	   this.complemento = dados.getComplemento();
	   this.cod_pro  = dados.getCod_pro();
	   this.alerg_txt = dados.getAlerg_txt();
	 
	}


	public long getId_alergia() {
		return id_alergia;
	}


	public void setId_alergia(long id_alergia) {
		this.id_alergia = id_alergia;
	}


	public String getCod_prt() {
		return cod_prt;
	}


	public void setCod_prt(String cod_prt) {
		this.cod_prt = cod_prt;
	}


	public String getCod_sal() {
		return cod_sal;
	}


	public void setCod_sal(String cod_sal) {
		this.cod_sal = cod_sal;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCod_pro() {
		return cod_pro;
	}


	public void setCod_pro(String cod_pro) {
		this.cod_pro = cod_pro;
	}


	public String getCod_pro_canc() {
		return cod_pro_canc;
	}


	public void setCod_pro_canc(String cod_pro_canc) {
		this.cod_pro_canc = cod_pro_canc;
	}


	public LocalDateTime getDt_hr_incl_alergia() {
		return dt_hr_incl_alergia;
	}


	public void setDt_hr_incl_alergia(LocalDateTime dt_hr_incl_alergia) {
		this.dt_hr_incl_alergia = dt_hr_incl_alergia;
	}


	public LocalDateTime getDt_hr_canc_alergia() {
		return dt_hr_canc_alergia;
	}


	public void setDt_hr_canc_alergia(LocalDateTime dt_hr_canc_alergia) {
		this.dt_hr_canc_alergia = dt_hr_canc_alergia;
	}


	public String getAlerg_txt() {
		return alerg_txt;
	}


	public void setAlerg_txt(String alerg_txt) {
		this.alerg_txt = alerg_txt;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cod_prt);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alergia_Prontuario other = (Alergia_Prontuario) obj;
		return Objects.equals(cod_prt, other.cod_prt);
	}


	
}