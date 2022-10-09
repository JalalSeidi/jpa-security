package Security.jpasecurity.repository;


import Security.jpasecurity.model.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User , Long> {
}
