package webservice.spdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Entity
@Table(name = "pacientes")
@Data
@NoArgsConstructor
public class Paciente {

    @Id
    @Column(name = "cd_paciente")
    protected Long idPaciente;

    @Column(name = "ds_paciente")
    protected String nomePaciente;

    @Column(name = "dt_nascimento")
    protected Time dataNascimento;

    @Column(name = "ds_sexo")
    protected String sexo;

    @Column(name = "ds_mae")
    protected String nomeMae;

    protected String bloco;

    protected String acomodacao;

    protected String leito;
}
