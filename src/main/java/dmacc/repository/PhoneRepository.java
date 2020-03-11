package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Phones;

@Repository
public interface PhoneRepository extends JpaRepository<Phones, Long>{

}
