package co.deivisjoro.apipartidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.deivisjoro.apipartidos.entity.Equipo;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer>{

}
