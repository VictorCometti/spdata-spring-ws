package webservice.spdata.service;

import https.exemplorequisicao_com.spdata.receberequisicaospdata.Atendimento;
import https.exemplorequisicao_com.spdata.receberequisicaospdata.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webservice.spdata.repository.AtendimentoRepository;

@Service
public class SpdataServiceSource implements SpdataService {
    private final AtendimentoRepository atendimentoRepository;

    @Autowired
    public SpdataServiceSource(AtendimentoRepository atendimentoRepository) {
        this.atendimentoRepository = atendimentoRepository;
    }

    @Override
    public Response redirecionaAtendimento(Atendimento atendimento) {
        Response response = new Response();
        switch (atendimento.getAcao()) {
            case "I" -> atendimentoRepository.save(atendimento);
            case "E" -> atendimentoRepository.deleteById(atendimento.getIdAtendimento());
            default -> {
                response.setCodigo("1");
                response.setMensagem("Operação não permitida.");
                return response;
            }
        }
        response.setCodigo("0");
        response.setMensagem("Atendimento recebido com sucesso.");
        return response;
    }
}
