package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class Uom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String uom;
    @OneToOne
    
    private Ingredient ingredient;



}
