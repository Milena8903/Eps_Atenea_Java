
package com.epsateneajava.epsateneajava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.epsateneajava.epsateneajava.entity.Cita;

@RepositoryRestResource(collectionResourceRel = "citas", path="citas")
@CrossOrigin(origins="http://localhost:3000")

public interface CitaRepository extends CrudRepository<Cita, Long>{

}

