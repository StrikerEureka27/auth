package auth.persistence.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import auth.persistence.entity.AdmUser;

public interface AdmUserCrud_repository  extends CrudRepository<AdmUser, Integer>{
	public List<AdmUser> findById (int idUser);
}
