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
import lombok.Data;


/**
 * <p>Classe Java de exame complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="exame"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id_lanc_exame" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="codigo_exame" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="obs_exame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urgencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigo_material" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exame", propOrder = {
    "acao",
    "idLancExame",
    "codigoExame",
    "obsExame",
    "urgencia",
    "codigoMaterial"
})
@Data
public class Exame {

    @XmlElement(required = true)
    protected String acao;
    @XmlElement(name = "id_lanc_exame", required = true)
    protected BigInteger idLancExame;
    @XmlElement(name = "codigo_exame", required = true)
    protected String codigoExame;
    @XmlElement(name = "obs_exame")
    protected String obsExame;
    @XmlElement(required = true)
    protected String urgencia;
    @XmlElement(name = "codigo_material", required = true)
    protected BigInteger codigoMaterial;


}
