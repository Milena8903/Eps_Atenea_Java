
package com.epsateneajava.epsateneajava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.epsateneajava.epsateneajava.entity.Paciente;

//rutas de acceso
@RepositoryRestResource(collectionResourceRel = "pacientes", path="pacientes")
@CrossOrigin(origins="http://localhost:3000")

public interface PacienteRepository extends CrudRepository<Paciente, Long>{

}

