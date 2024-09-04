package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishal.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
