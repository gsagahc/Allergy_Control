package com.alergias.prontuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.alergias.prontuario.model.Prontuario;


@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, String>{

	List<Prontuario> findByCpf(String cpf);
 

}