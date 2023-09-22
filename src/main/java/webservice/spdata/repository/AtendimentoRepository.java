package webservice.spdata.repository;

import https.exemplorequisicao_com.spdata.receberequisicaospdata.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, BigInteger> {


}
