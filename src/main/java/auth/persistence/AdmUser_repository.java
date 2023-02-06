package auth.persistence;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import auth.domain.User;
import auth.domain.repository.User_repository;
import auth.persistence.crud.AdmUserCrud_repository;
import auth.persistence.entity.AdmUser;
import auth.persistence.mapper.UserMapper;


@Repository
public class AdmUser_repository implements User_repository{
	
	@Autowired
	private AdmUserCrud_repository admUserCrudrepo;
	
	@Autowired
	private UserMapper mapper;

	@Override
	public void deleteUser(int userId) {
		admUserCrudrepo.deleteById(userId);
	}

	@Override
	public User createNewUser(User user) {
		AdmUser admUser = mapper.toAdmUser(user);
		System.out.println("from repo layer");
		System.out.println(admUser.getName());
		return mapper.toUser(admUserCrudrepo.save(admUser));
	}

	@Override
	public User getUserByIdentifier(int id) {
		return mapper.toUser(admUserCrudrepo.findById(id));
	}

	
}
