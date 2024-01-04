package ec.edu.ista.springgc1.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ciudad")
public class Ciudad {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_ciudad")
	 private Long id;
	 @Column(unique = true)
	 private String nombre;
	  @ManyToOne
	    @JoinColumn(name = "id_provincia", referencedColumnName = "id_provincia")
	    private Provincia provincia;
	 
}
