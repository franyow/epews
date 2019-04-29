package pe.finsur.appws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.finsur.appws.model.LoginRequest;
import pe.finsur.appws.model.UsuarioResponse;
import pe.finsur.appws.service.UsuarioService;

@RestController
@RequestMapping("/")
public class AuthController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping("/login")
	public ResponseEntity<?> validarUsuario(@RequestBody LoginRequest request){
		UsuarioResponse user = usuarioService.validarUsuario(request.getUsername(), request.getPassword());
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
