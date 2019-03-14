package com.example.proyectolog;

import java.util.List;

public interface UsuarioService {
	public List <Usuario> consultaUsuario();	
	public Usuario consultaUsuario(Long usuarioId);	
	public void guardaUsuario(Usuario usuario);	
	public void borraUsuario (Long usuarioId);	
	public void actualizarUsuario (Usuario usuario);	

}
