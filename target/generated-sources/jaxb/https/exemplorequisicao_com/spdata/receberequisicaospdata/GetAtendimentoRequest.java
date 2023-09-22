//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.09.22 às 01:58:22 PM BRT 
//


package https.exemplorequisicao_com.spdata.receberequisicaospdata;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atendimento" type="{https://exemplorequisicao.com/spdata/receberequisicaospdata}atendimento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "atendimento"
})
@XmlRootElement(name = "getAtendimentoRequest")
public class GetAtendimentoRequest {

    @XmlElement(required = true)
    protected Atendimento atendimento;

    /**
     * Obtém o valor da propriedade atendimento.
     * 
     * @return
     *     possible object is
     *     {@link Atendimento }
     *     
     */
    public Atendimento getAtendimento() {
        return atendimento;
    }

    /**
     * Define o valor da propriedade atendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Atendimento }
     *     
     */
    public void setAtendimento(Atendimento value) {
        this.atendimento = value;
    }

}
