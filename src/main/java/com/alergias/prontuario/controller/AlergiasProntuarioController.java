package com.alergias.prontuario.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alergias.prontuario.controller.dto.DadosAlergiaDto;
import com.alergias.prontuario.model.Alergia_Prontuario;
import com.alergias.prontuario.model.Prontuario;
import com.alergias.prontuario.repository.AlergiaProntuarioRepository;
import com.alergias.prontuario.repository.ProntuarioRepository;
import com.alergias.prontuario.service.Services;




@RestController
@RequestMapping("/")
public class AlergiasProntuarioController {

	@Autowired
	ProntuarioRepository repository;
	@Autowired	
	private Services service;
	@GetMapping ("/consultar/{cpf}")
	public  ResponseEntity<Object> listar(@PathVariable(value="cpf") String cpf){
		List<Prontuario> prontuario =  repository.findByCpf(cpf);
		if ( prontuario.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prontuário não localizado");
		}else
			return ResponseEntity.status(HttpStatus.OK).body(prontuario);
	}

	@Autowired
	AlergiaProntuarioRepository repAlergias;
	
	@PostMapping(value="/cadastrar",
	            produces= MediaType.APPLICATION_JSON_VALUE,
		        consumes =MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	@Transactional
	public ResponseEntity<String> cadastrar(@RequestBody  DadosAlergiaDto dados) {
		repAlergias.save(new Alergia_Prontuario(dados));
		return  ResponseEntity.status(HttpStatus.CREATED).body("Cadastrado com sucesso");

	}
	
	@PutMapping(produces= MediaType.APPLICATION_JSON_VALUE,
		       consumes =MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	@Transactional
	public Alergia_Prontuario update(@RequestBody Alergia_Prontuario alergia)
	{
			
		return service.update(alergia);
				
		
	}
	
	

	
}
