package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishal.entity.City;

public interface CityRepo extends JpaRepository<City, Integer>{

}
