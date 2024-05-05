package com.alergias.prontuario.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fausgcad")
public class GruposDeUsuarios {
	@Id
	public Long pk_usgcad;
	public String sistema;
	public String cod_grupo;
	public String descricao;
	public String sn_admin;
	
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getCod_grupo() {
		return cod_grupo;
	}
	public void setCod_grupo(String cod_grupo) {
		this.cod_grupo = cod_grupo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSn_admin() {
		return sn_admin;
	}
	public void setSn_admin(String sn_admin) {
		this.sn_admin = sn_admin;
	}
	public Long getPk_usgcad() {
		return pk_usgcad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pk_usgcad);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GruposDeUsuarios other = (GruposDeUsuarios) obj;
		return Objects.equals(pk_usgcad, other.pk_usgcad);
	}
	
	

}
