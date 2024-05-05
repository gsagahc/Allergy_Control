package com.alergias.prontuario.controller.dto;

import java.time.LocalDateTime;

import com.alergias.prontuario.model.Alergia_Prontuario;

public class DadosAlergiaDto {
	private long id_alergia;
	private String cod_prt;
	private String cod_sal;
	private String complemento;
	private String cod_pro;
	private String cod_pro_canc;
	private LocalDateTime dt_hr_incl_alergia;
	private LocalDateTime dt_hr_canc_alergia;
	private String alerg_txt;

	
	public DadosAlergiaDto(Alergia_Prontuario alergias) {
		this.id_alergia = alergias.getId_alergia() ;
		this.cod_prt = alergias.getCod_prt();
		this.cod_sal = alergias.getCod_sal();
		this.complemento = alergias.getComplemento();
		this.cod_pro =  alergias.getCod_pro();
		this.cod_pro_canc = alergias.getCod_pro_canc();
		this.dt_hr_canc_alergia = alergias.getDt_hr_canc_alergia();
		this.dt_hr_incl_alergia = alergias.getDt_hr_incl_alergia();
		this.alerg_txt = alergias.getAlerg_txt();
	}
	
	public DadosAlergiaDto() {
		
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

}
