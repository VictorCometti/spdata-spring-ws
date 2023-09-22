//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.09.22 às 01:58:22 PM BRT 
//


package https.exemplorequisicao_com.spdata.receberequisicaospdata;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de medico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="medico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crm_medico" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="nome_medico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uf_medico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medico", propOrder = {
    "crmMedico",
    "nomeMedico",
    "ufMedico"
})
public class Medico {

    @XmlElement(name = "crm_medico", required = true)
    protected BigInteger crmMedico;
    @XmlElement(name = "nome_medico", required = true)
    protected String nomeMedico;
    @XmlElement(name = "uf_medico")
    protected String ufMedico;

    /**
     * Obtém o valor da propriedade crmMedico.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCrmMedico() {
        return crmMedico;
    }

    /**
     * Define o valor da propriedade crmMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCrmMedico(BigInteger value) {
        this.crmMedico = value;
    }

    /**
     * Obtém o valor da propriedade nomeMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMedico() {
        return nomeMedico;
    }

    /**
     * Define o valor da propriedade nomeMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMedico(String value) {
        this.nomeMedico = value;
    }

    /**
     * Obtém o valor da propriedade ufMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfMedico() {
        return ufMedico;
    }

    /**
     * Define o valor da propriedade ufMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfMedico(String value) {
        this.ufMedico = value;
    }

}
