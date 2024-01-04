package ec.edu.ista.springgc1.model.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="referenca_profesional")
public class Referencia_Profesional {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_ref_profesional")
	    private Long id;
	 @ManyToOne
	 @JoinColumn(name = "graduado_id", referencedColumnName = "graduado_id")
	 private Graduado graduado;
	 private String nombre;
	 private  String institucion;
	 private String email;
	 
}
