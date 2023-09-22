package webservice.spdata.model;

import https.exemplorequisicao_com.spdata.receberequisicaospdata.Exame;
import https.exemplorequisicao_com.spdata.receberequisicaospdata.Medico;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "atendimentos")
public class Atendimento {
    @Column(name = "cd_atendimento")
    @Id
    protected BigInteger idAtendimento;
    @Transient
    protected String acao;
    protected BigInteger ato;
    protected BigInteger localAtendimento;

    @OneToMany
    protected Paciente paciente;

    @OneToMany
    protected Medico medico;

    @OneToMany
    protected List<Exame> exames;
}
