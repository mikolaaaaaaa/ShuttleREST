package by.mikola.shuttle.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shuttle")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shuttle {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String driver;
  private int capacity;
  private String licensePlate;
  private String model;

  // Getters and Setters
}
