package by.mikola.shuttle.repository;

import by.mikola.shuttle.entity.Shuttle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShuttleRepository extends JpaRepository<Shuttle, Long> {
  // Можно добавить дополнительные методы запросов, если нужно
}
