//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.08 at 01:50:44 PM EEST 
//


package ro.infrasoft.ws.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDosarSedinta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDosarSedinta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DosarSedinta" type="{portalquery.just.ro}DosarSedinta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDosarSedinta", propOrder = {
    "dosarSedinta"
})
public class ArrayOfDosarSedinta {

    @XmlElement(name = "DosarSedinta", nillable = true)
    protected List<DosarSedinta> dosarSedinta;

    /**
     * Gets the value of the dosarSedinta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosarSedinta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosarSedinta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DosarSedinta }
     * 
     * 
     */
    public List<DosarSedinta> getDosarSedinta() {
        if (dosarSedinta == null) {
            dosarSedinta = new ArrayList<DosarSedinta>();
        }
        return this.dosarSedinta;
    }

}