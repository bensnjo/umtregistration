package ke.co.rifttech.umtregistration.umtRepository;

import ke.co.rifttech.umtregistration.userregistration.Umtuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UmtUserRepository extends JpaRepository<Umtuser, Long> {
    void deleteUmtuserById(Long id);

   Optional <Umtuser> findUmtUserById(Long id);
}
