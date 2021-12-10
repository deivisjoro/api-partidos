package co.deivisjoro.apipartidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.deivisjoro.apipartidos.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario getByUsernameAndPassword(String username, String password);
	
}
