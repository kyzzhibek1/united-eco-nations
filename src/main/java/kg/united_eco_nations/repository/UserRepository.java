package kg.united_eco_nations.repository;

import kg.united_eco_nations.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
