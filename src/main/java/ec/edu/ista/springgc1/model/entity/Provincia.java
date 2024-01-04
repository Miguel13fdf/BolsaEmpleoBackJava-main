package ec.edu.ista.springgc1.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "provincia")
public class Provincia {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_provincia")
	    private Long id;
	    @Column(unique = true)
	    private String nombre;

    @NotEmpty
    @Column(nullable = false, length = 50)
    private String pais;


}
