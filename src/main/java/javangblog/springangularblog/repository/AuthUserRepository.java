package javangblog.springangularblog.repository;

import javangblog.springangularblog.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserRepository extends JpaRepository<BlogUser, Long> {


}
