package auth.persistence.mapper;
import java.util.List;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import auth.domain.User;
import auth.persistence.entity.AdmUser;




@Mapper(componentModel = "spring", uses =  { RoleMapper.class })
public interface UserMapper {
	// Source: Entity | Target: Domain 
	@Mappings({
		@Mapping(source = "id", target = "userId"), 
		@Mapping(source = "name", target = "userFirstName"), 
		@Mapping(source = "lastName", target = "userLastName"), 
		@Mapping(source = "password", target = "userPassword"),
		@Mapping(source = "number", target = "phone"),
		@Mapping(source = "status", target = "userStatus"), 
		@Mapping(source = "role", target = "role"), 
		@Mapping(source = "roleId", target = "roleId")
	})
	// Converts from entity to domain
	User toUser(AdmUser user);
	List<User> toUsers(List<AdmUser> users);
	
	@InheritConfiguration
	// Converts from domain to entity
	AdmUser toAdmUser(User user);
}
