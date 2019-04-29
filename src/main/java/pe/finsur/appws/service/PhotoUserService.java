package pe.finsur.appws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.finsur.appws.model.PhotoUser;
import pe.finsur.appws.repository.PhotoUserJpaRepository;

@Service
public class PhotoUserService {
	
	@Autowired 
	PhotoUserJpaRepository photoRepo;
	
	public PhotoUser savePhotoUser(PhotoUser photoObj) {
		return photoRepo.save(photoObj);
	}
	

	public PhotoUser getPhotoByCodUser(Long codUser) {
		return photoRepo.findByCodUser(codUser);
	}
	
}
