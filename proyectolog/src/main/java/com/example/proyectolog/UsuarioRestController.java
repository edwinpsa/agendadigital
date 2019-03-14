package com.example.proyectolog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	public void setUsuarioService(UsuarioService usuarioService){
		this.usuarioService = usuarioService;
	}
	@CrossOrigin(origins = "*")
	@GetMapping("/api/usuario")
	public List<Usuario> consultaUsuario(){
		List<Usuario> usuario = usuarioService.consultaUsuario();
		return usuario;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/usuario/{usuarioId}")
	public Usuario consultaUsuario(@PathVariable(name="usuarioId") Long usuarioId){
		return usuarioService.consultaUsuario(usuarioId);    
	}	
	@CrossOrigin(origins = "*")
	@PostMapping("/api/usuario/")
    public void guardaUsuario(@RequestBody Usuario usuario) {
		usuarioService.guardaUsuario(usuario);  
        System.out.println("Usuario guardado con éxito!");
    }
	@CrossOrigin(origins = "*")
	@DeleteMapping("/api/usuario/{usuarioId}")
	public void borraUsuario(@PathVariable(name="usuarioId") Long usuarioId){
		usuarioService.borraUsuario(usuarioId);
        System.out.println("Usuario eliminado con éxito!");
	}
	@CrossOrigin(origins = "*")
	@PutMapping("/api/usuario/{usuarioId}")
    public void actualizaUsuario(@RequestBody Usuario usuario,
    		@PathVariable(name="usuarioId") Long usuarioId) {
        Usuario usa = usuarioService.consultaUsuario(usuarioId);          
        if(usa != null) {
        	usuarioService.actualizarUsuario(usuario);
        	System.out.println("Usuario actualizado con éxito!");
        }
    }
}
