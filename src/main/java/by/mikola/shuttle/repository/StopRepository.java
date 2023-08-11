package by.mikola.shuttle.repository;

import by.mikola.shuttle.entity.Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepository extends JpaRepository<Stop, Long> {
  // Можно добавить дополнительные методы запросов, если нужно
}
