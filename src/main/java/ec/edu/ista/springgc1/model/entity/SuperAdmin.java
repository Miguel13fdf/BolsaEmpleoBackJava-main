package ec.edu.ista.springgc1.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name="superadmin")
public class SuperAdmin {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_super_admi")
	    private Long id;
	 @OneToOne
	   @JoinColumn(name = "id_persona", referencedColumnName = "cod_perso")
	    private Persona persona;
	 private boolean estado=true;

}
