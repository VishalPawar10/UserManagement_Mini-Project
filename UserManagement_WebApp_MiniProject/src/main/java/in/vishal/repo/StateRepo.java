package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishal.entity.States;

public interface StateRepo extends JpaRepository<States, Integer>{

}
