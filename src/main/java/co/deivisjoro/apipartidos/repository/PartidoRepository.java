package co.deivisjoro.apipartidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.deivisjoro.apipartidos.entity.Partido;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Integer>{

}
