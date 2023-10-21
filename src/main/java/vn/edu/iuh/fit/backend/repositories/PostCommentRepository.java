package vn.edu.iuh.fit.backend.repositories;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.backend.models.PostComment;
//@RestResource(exported = false)
public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}