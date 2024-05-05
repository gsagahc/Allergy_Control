package com.alergias.prontuario.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.alergias.prontuario.model.Usuario;
import com.alergias.prontuario.repository.UsuarioRepository;



@Service
public class AutenticacaoService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public UserDetails loadUserByUsername(String apelido) throws UsernameNotFoundException {
		Optional<Usuario> usuario = repository.findByApelido(apelido);
		if (usuario.isPresent()) {
			return (UserDetails) usuario.get();
		}
		
		throw new UsernameNotFoundException("Dados inválidos!");
	}

}
