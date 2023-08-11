package by.mikola.shuttle.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "passenger")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String email;
  private String phone;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "passenger_id")
  private List<Ticket> tickets;

  // Getters and Setters
}
