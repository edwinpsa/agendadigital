package com.example.proyectolog;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void setUsuarioRepository(UsuarioRepository usuarioRepository){
		this.usuarioRepository = usuarioRepository;
	}	
	public List<Usuario> consultaUsuario(){
		List<Usuario> usuario = usuarioRepository.findAll();
		return usuario;
	}	
	@Override
	public Usuario consultaUsuario(Long usuarioId){
		Optional<Usuario> optUsuario = usuarioRepository.findById(usuarioId);
		return optUsuario.get();
	}
	@Override
	public void guardaUsuario(Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	@Override
	public void borraUsuario(Long usuarioId){
		usuarioRepository.deleteById(usuarioId);
	}
	
	@Override
	public void actualizarUsuario(Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
}
