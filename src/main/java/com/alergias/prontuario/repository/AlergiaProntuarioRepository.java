package com.alergias.prontuario.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alergias.prontuario.model.Alergia_Prontuario;







@Repository
public interface AlergiaProntuarioRepository extends JpaRepository<Alergia_Prontuario, Long>{
  
	

}
