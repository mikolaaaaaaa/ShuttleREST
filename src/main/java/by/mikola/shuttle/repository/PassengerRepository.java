package by.mikola.shuttle.repository;

import by.mikola.shuttle.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
   public Passenger findByEmail(String email);
}
