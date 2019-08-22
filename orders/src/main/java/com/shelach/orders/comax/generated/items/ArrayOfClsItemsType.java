//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.21 at 09:26:37 PM IDT 
//


package com.shelach.orders.comax.generated.items;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfClsItemsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfClsItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsItems" type="{}ClsItemsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsItemsType", propOrder = {
        "clsItems"
})
@Data
@XmlRootElement(name = "ArrayOfClsItems", namespace = "http://ws.comax.co.il/Comax_WebServices/")
public class ArrayOfClsItemsType {
    @XmlElement(name = "ClsItems", required = true, namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected List<ClsItemsType> clsItems;

    /**
     * Gets the value of the clsItems property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsItems property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsItems().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsItemsType }
     */
    public List<ClsItemsType> getClsItems() {
        if (clsItems == null) {
            clsItems = new ArrayList<>();
        }
        return this.clsItems;
    }

}
