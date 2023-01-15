package auth.persistence;

import java.util.List;
import org.springframework.stereotype.Repository;
import auth.persistence.crud.AdmUserCrud_repository;
import auth.persistence.entity.AdmUser;


@Repository
public class AdmUser_repository {
	
	private AdmUserCrud_repository admUserCrudrepo;
	
	public Iterable<AdmUser> getAll(){
		return admUserCrudrepo.findAll();
	}
	
	public List<AdmUser> getUserById(int isUser) {
		return admUserCrudrepo.findById(isUser);
	}
	
}
