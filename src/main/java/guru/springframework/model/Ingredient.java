package guru.springframework.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author d.monterey on 10/07/2020
 */
@Entity
@Data
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.EAGER)
    private Recipe recipe;

    @OneToOne
    private UnitOfMeasure unitOfMeasure;
}
