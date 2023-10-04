package trabajofolcademy.saludo.api.Models.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trabajofolcademy.saludo.api.Models.Entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository <UserEntity,Integer>{

}
