package webservice.spdata.endpoint;

import https.exemplorequisicao_com.spdata.receberequisicaospdata.Atendimento;
import https.exemplorequisicao_com.spdata.receberequisicaospdata.GetAtendimentoRequest;
import https.exemplorequisicao_com.spdata.receberequisicaospdata.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import webservice.spdata.service.SpdataServiceSource;

@Endpoint
public class SpdataEndPoint {
    private static final String NAMESPACE_URI = "https://exemplorequisicao.com/spdata/receberequisicaospdata";
    private final SpdataServiceSource spdataServiceSource;

    @Autowired
    public SpdataEndPoint(SpdataServiceSource spdataServiceSource) {
        this.spdataServiceSource = spdataServiceSource;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAtendimentoRequest")
    @ResponsePayload
    public Response getAtendimentoRequest(@RequestPayload GetAtendimentoRequest request) {
        Atendimento atendimento = request.getAtendimento();
        return spdataServiceSource.redirecionaAtendimento(atendimento);
    }
}
