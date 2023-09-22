//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.09.22 às 01:58:22 PM BRT 
//


package https.exemplorequisicao_com.spdata.receberequisicaospdata;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.exemplorequisicao_com.spdata.receberequisicaospdata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.exemplorequisicao_com.spdata.receberequisicaospdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAtendimentoRequest }
     * 
     */
    public GetAtendimentoRequest createGetAtendimentoRequest() {
        return new GetAtendimentoRequest();
    }

    /**
     * Create an instance of {@link Atendimento }
     * 
     */
    public Atendimento createAtendimento() {
        return new Atendimento();
    }

    /**
     * Create an instance of {@link GetAtendimentoResponse }
     * 
     */
    public GetAtendimentoResponse createGetAtendimentoResponse() {
        return new GetAtendimentoResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Paciente }
     * 
     */
    public Paciente createPaciente() {
        return new Paciente();
    }

    /**
     * Create an instance of {@link Medico }
     * 
     */
    public Medico createMedico() {
        return new Medico();
    }

    /**
     * Create an instance of {@link Exame }
     * 
     */
    public Exame createExame() {
        return new Exame();
    }

}
