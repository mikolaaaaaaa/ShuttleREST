package by.mikola.shuttle.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stop {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private double latitude;
  private double longitude;

  // Getters and Setters
}
