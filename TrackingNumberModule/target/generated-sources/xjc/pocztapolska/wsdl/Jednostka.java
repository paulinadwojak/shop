//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.31 at 01:46:06 PM CEST 
//


package pocztapolska.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Jednostka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Jednostka"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="daneSzczegolowe" type="{http://ws.sledzenie.pocztapolska.pl/xsd}SzczDaneJednostki" minOccurs="0"/&gt;
 *         &lt;element name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Jednostka", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "daneSzczegolowe",
    "nazwa"
})
public class Jednostka {

    @XmlElementRef(name = "daneSzczegolowe", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SzczDaneJednostki> daneSzczegolowe;
    @XmlElementRef(name = "nazwa", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwa;

    /**
     * Gets the value of the daneSzczegolowe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SzczDaneJednostki }{@code >}
     *     
     */
    public JAXBElement<SzczDaneJednostki> getDaneSzczegolowe() {
        return daneSzczegolowe;
    }

    /**
     * Sets the value of the daneSzczegolowe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SzczDaneJednostki }{@code >}
     *     
     */
    public void setDaneSzczegolowe(JAXBElement<SzczDaneJednostki> value) {
        this.daneSzczegolowe = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwa(JAXBElement<String> value) {
        this.nazwa = value;
    }

}