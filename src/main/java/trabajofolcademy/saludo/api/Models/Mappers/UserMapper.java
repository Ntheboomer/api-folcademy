package trabajofolcademy.saludo.api.Models.Mappers;

import org.springframework.stereotype.Component;
import trabajofolcademy.saludo.api.Models.Dtos.UserAddDTO;
import trabajofolcademy.saludo.api.Models.Dtos.UserReadDTO;
import trabajofolcademy.saludo.api.Models.Entities.UserEntity;

@Component
public class UserMapper {
    public UserReadDTO userEntityToUserReadDTO(UserEntity userEntity) {
        UserReadDTO userReadDTO = new UserReadDTO();
        userReadDTO.setId(userEntity.getId());
        userReadDTO.setName(userEntity.getName());
        userReadDTO.setSurname(userEntity.getSurname());
        userReadDTO.setEmail(userEntity.getEmail());
        return userReadDTO;
    }

    public UserEntity userAddDTOToUserEntity(UserAddDTO userAddDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userAddDTO.getName());
        userEntity.setSurname(userAddDTO.getSurname());
        userEntity.setEmail(userAddDTO.getEmail());
        userEntity.setPassword(userAddDTO.getPassword());
        return userEntity;
    }
}