package guru.springframework.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author d.monterey on 10/07/2020
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
