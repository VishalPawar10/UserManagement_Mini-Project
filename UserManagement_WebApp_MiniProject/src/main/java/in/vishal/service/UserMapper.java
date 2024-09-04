import org.mapstruct.Mapper;

import in.vishal.dto.LoginFormDTO;
import in.vishal.dto.RegisterFormDTO;
import in.vishal.dto.ResetPwdFormDTO;
import in.vishal.dto.UserDTO;
import in.vishal.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(RegisterFormDTO dto);
    RegisterFormDTO toDTO(User entity);

    User toEntity(LoginFormDTO dto);
   // LoginFormDTO toDTO(User entity);

    User toEntity(ResetPwdFormDTO dto);
    //UserDTO toDTO(User entity);
    User toEntity(UserDTO dto);
}



