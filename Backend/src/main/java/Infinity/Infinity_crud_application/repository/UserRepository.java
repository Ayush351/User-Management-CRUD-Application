package Infinity.Infinity_crud_application.repository;

import Infinity.Infinity_crud_application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
