package pe.finsur.appws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.finsur.appws.model.PhotoUser;
import pe.finsur.appws.model.Usuario;
import pe.finsur.appws.model.UsuarioResponse;
import pe.finsur.appws.repository.UsuarioJpaRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioJpaRepository usuarioRepo;
	
	public UsuarioResponse validarUsuario(String username,String password)  {
		Usuario user= new Usuario();
		try {
			 user = usuarioRepo.findUsuarioByUsername(username.toLowerCase());
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		if(user!=null && user.getPassword().matches(password.toLowerCase())){
			return new UsuarioResponse(true,user.getNombre());
			
		}else
			return new UsuarioResponse(false,null);
	}
	

}
