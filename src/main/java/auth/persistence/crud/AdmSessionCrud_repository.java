package auth.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import auth.persistence.entity.AdmSession;

public interface AdmSessionCrud_repository extends CrudRepository<AdmSession, Integer> {

}
