package auth.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import auth.persistence.entity.KrnSession;

public interface KrnSessionCrud_repository extends CrudRepository<KrnSession, Integer>{

}
