package guru.springframework.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author d.monterey on 10/07/2020
 */
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipoe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipoe() {
        return recipoe;
    }

    public void setRecipoe(Recipe recipoe) {
        this.recipoe = recipoe;
    }
}
