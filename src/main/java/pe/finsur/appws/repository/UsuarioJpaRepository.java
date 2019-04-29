package pe.finsur.appws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.finsur.appws.model.Usuario;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long>{
	Usuario findUsuarioByUsername(String username);

}
