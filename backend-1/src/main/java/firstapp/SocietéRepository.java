package firstapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocietéRepository extends JpaRepository<Sociéte,Long> {

}
