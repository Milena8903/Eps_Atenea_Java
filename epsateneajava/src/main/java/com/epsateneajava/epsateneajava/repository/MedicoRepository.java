
package com.epsateneajava.epsateneajava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.epsateneajava.epsateneajava.entity.Medico;

@RepositoryRestResource(collectionResourceRel = "medicos", path="medicos")
@CrossOrigin(origins="http://localhost:3000")

public interface MedicoRepository extends CrudRepository<Medico, Long>{

}

