//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.09.22 às 01:58:22 PM BRT 
//


package https.exemplorequisicao_com.spdata.receberequisicaospdata;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;


/**
 * <p>Classe Java de paciente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="paciente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_paciente" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="nome_paciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="data_nascimento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nome_mae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bloco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acomodacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="leito" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paciente", propOrder = {
    "idPaciente",
    "nomePaciente",
    "dataNascimento",
    "sexo",
    "nomeMae",
    "bloco",
    "acomodacao",
    "leito"
})

@Data
public class Paciente {

    @XmlElement(name = "id_paciente", required = true)
    protected BigInteger idPaciente;
    @XmlElement(name = "nome_paciente", required = true)
    protected String nomePaciente;
    @XmlElement(name = "data_nascimento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(required = true)
    protected String sexo;
    @XmlElement(name = "nome_mae")
    protected String nomeMae;
    @XmlElement(required = true)
    protected String bloco;
    @XmlElement(required = true)
    protected String acomodacao;
    @XmlElement(required = true)
    protected String leito;

    /**
     * Obtém o valor da propriedade idPaciente.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdPaciente() {
        return idPaciente;
    }

    /**
     * Define o valor da propriedade idPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdPaciente(BigInteger value) {
        this.idPaciente = value;
    }

    /**
     * Obtém o valor da propriedade nomePaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePaciente() {
        return nomePaciente;
    }

    /**
     * Define o valor da propriedade nomePaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePaciente(String value) {
        this.nomePaciente = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtém o valor da propriedade nomeMae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * Define o valor da propriedade nomeMae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMae(String value) {
        this.nomeMae = value;
    }

    /**
     * Obtém o valor da propriedade bloco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloco() {
        return bloco;
    }

    /**
     * Define o valor da propriedade bloco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloco(String value) {
        this.bloco = value;
    }

    /**
     * Obtém o valor da propriedade acomodacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcomodacao() {
        return acomodacao;
    }

    /**
     * Define o valor da propriedade acomodacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcomodacao(String value) {
        this.acomodacao = value;
    }

    /**
     * Obtém o valor da propriedade leito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeito() {
        return leito;
    }

    /**
     * Define o valor da propriedade leito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeito(String value) {
        this.leito = value;
    }

}
