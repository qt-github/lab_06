package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.backend.models.User;
//@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Long> {
}