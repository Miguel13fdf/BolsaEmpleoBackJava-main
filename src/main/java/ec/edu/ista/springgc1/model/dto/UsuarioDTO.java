package ec.edu.ista.springgc1.model.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import ec.edu.ista.springgc1.model.entity.Administrador;
import ec.edu.ista.springgc1.model.entity.Empresario;
import ec.edu.ista.springgc1.model.entity.Graduado;
import ec.edu.ista.springgc1.model.entity.SuperAdmin;
import ec.edu.ista.springgc1.model.entity.UsuarioTipo;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class UsuarioDTO implements Serializable {

    private Long id;
    @NotEmpty
    private String nombreUsuario;
    @NotNull
    private String clave;
    private Graduado graduado;
    private SuperAdmin superadmin;
    private boolean estado;
    private Administrador admin;
	 private Empresario empresario;
	 private UsuarioTipo usuarioTipo;
    @NotEmpty
    private String rol;
}
