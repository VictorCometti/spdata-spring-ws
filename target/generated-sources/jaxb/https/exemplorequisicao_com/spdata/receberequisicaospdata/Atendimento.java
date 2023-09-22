//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.09.22 às 01:58:22 PM BRT 
//


package https.exemplorequisicao_com.spdata.receberequisicaospdata;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de atendimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atendimento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ato" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="id_atendimento" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="local_atendimento" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="paciente" type="{https://exemplorequisicao.com/spdata/receberequisicaospdata}paciente"/&gt;
 *         &lt;element name="medico" type="{https://exemplorequisicao.com/spdata/receberequisicaospdata}medico"/&gt;
 *         &lt;element name="exames" type="{https://exemplorequisicao.com/spdata/receberequisicaospdata}exame" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atendimento", propOrder = {
    "acao",
    "ato",
    "idAtendimento",
    "localAtendimento",
    "paciente",
    "medico",
    "exames"
})
public class Atendimento {

    @XmlElement(required = true)
    protected String acao;
    @XmlElement(required = true)
    protected BigInteger ato;
    @XmlElement(name = "id_atendimento", required = true)
    protected BigInteger idAtendimento;
    @XmlElement(name = "local_atendimento", required = true)
    protected BigInteger localAtendimento;
    @XmlElement(required = true)
    protected Paciente paciente;
    @XmlElement(required = true)
    protected Medico medico;
    @XmlElement(required = true)
    protected List<Exame> exames;

    /**
     * Obtém o valor da propriedade acao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcao() {
        return acao;
    }

    /**
     * Define o valor da propriedade acao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcao(String value) {
        this.acao = value;
    }

    /**
     * Obtém o valor da propriedade ato.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAto() {
        return ato;
    }

    /**
     * Define o valor da propriedade ato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAto(BigInteger value) {
        this.ato = value;
    }

    /**
     * Obtém o valor da propriedade idAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdAtendimento() {
        return idAtendimento;
    }

    /**
     * Define o valor da propriedade idAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdAtendimento(BigInteger value) {
        this.idAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade localAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalAtendimento() {
        return localAtendimento;
    }

    /**
     * Define o valor da propriedade localAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalAtendimento(BigInteger value) {
        this.localAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade paciente.
     * 
     * @return
     *     possible object is
     *     {@link Paciente }
     *     
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Define o valor da propriedade paciente.
     * 
     * @param value
     *     allowed object is
     *     {@link Paciente }
     *     
     */
    public void setPaciente(Paciente value) {
        this.paciente = value;
    }

    /**
     * Obtém o valor da propriedade medico.
     * 
     * @return
     *     possible object is
     *     {@link Medico }
     *     
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * Define o valor da propriedade medico.
     * 
     * @param value
     *     allowed object is
     *     {@link Medico }
     *     
     */
    public void setMedico(Medico value) {
        this.medico = value;
    }

    /**
     * Gets the value of the exames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exame }
     * 
     * 
     */
    public List<Exame> getExames() {
        if (exames == null) {
            exames = new ArrayList<Exame>();
        }
        return this.exames;
    }

}
