package com.alergias.prontuario.service;

import java.time.LocalDateTime;

import org.jtwig.resource.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alergias.prontuario.model.Alergia_Prontuario;

import com.alergias.prontuario.repository.AlergiaProntuarioRepository;





@Service
public class Services {
	@Autowired
	   AlergiaProntuarioRepository alergiaRepository;

	 public Alergia_Prontuario update(Alergia_Prontuario alergia)  {
	     Alergia_Prontuario entity;
		 entity = alergiaRepository.findById(alergia.getId_alergia())
			.orElseThrow(()->new ResourceNotFoundException("Not records for ths id"));
		entity.setCod_pro_canc(alergia.getCod_pro_canc());
		entity.setDt_hr_canc_alergia(LocalDateTime.now());
		return alergiaRepository.save(entity);
	 }
}	 
