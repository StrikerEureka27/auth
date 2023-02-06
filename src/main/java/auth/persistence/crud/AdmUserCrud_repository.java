package auth.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import auth.persistence.entity.AdmUser;

public interface AdmUserCrud_repository  extends CrudRepository<AdmUser, Integer>{
	public AdmUser findById (int idUser);
}
