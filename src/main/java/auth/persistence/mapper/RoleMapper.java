package auth.persistence.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import auth.domain.Role;
import auth.persistence.entity.AdmRole;

@Mapper(componentModel = "spring")
public interface RoleMapper {
	
	@Mappings({
		@Mapping(source = "id", target = "idRole"),
		@Mapping(source = "name", target = "roleName"),
		@Mapping(source = "code", target = "roleCode"),
	})
	Role toRole(AdmRole role);
	
	@InheritInverseConfiguration
	// @Mapping(target = "users", ignore = true)
	AdmRole toAdmRole(Role role);
	
}
