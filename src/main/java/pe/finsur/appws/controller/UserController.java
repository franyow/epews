package pe.finsur.appws.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.finsur.appws.model.PhotoUser;
import pe.finsur.appws.model.ResponseBean;
import pe.finsur.appws.service.PhotoUserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	PhotoUserService photoService;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/saveupload")
	public ResponseEntity<?> registro(@RequestBody @Valid PhotoUser uploadRequest) {

		try {
		
				PhotoUser uploadDetalle = new PhotoUser();
				uploadDetalle.setDesContenido(uploadRequest.getDesContenido());
				uploadDetalle.setCodUser(uploadRequest.getCodUser());
			
				photoService.savePhotoUser(uploadDetalle);
			

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(new ResponseBean(false, "Error al guardar"),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(new ResponseBean(true, "Guardado Satisfactoriamente"), HttpStatus.OK);
	}
	
	@GetMapping("/getPhoto/{codUser}")
	public PhotoUser getPhotoByUser(@PathVariable("codUser")Long codUser) {
		return photoService.getPhotoByCodUser(codUser);
	}

}
