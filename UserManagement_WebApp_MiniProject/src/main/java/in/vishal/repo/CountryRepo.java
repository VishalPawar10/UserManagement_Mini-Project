package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishal.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{

}
