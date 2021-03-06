//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.21 at 11:31:13 AM EET 
//


package com.company.currency_info;

import java.sql.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pair"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currencyCodeA" type="{http://company.com/currency-info}currencyCode"/&gt;
 *         &lt;element name="currencyCodeB" type="{http://company.com/currency-info}currencyCode"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="rateBuy" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="rateCross" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="rateSell" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pair", propOrder = {
    "currencyCodeA",
    "currencyCodeB",
    "date",
    "rateBuy",
    "rateCross",
    "rateSell"
})
public class Pair {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCodeA;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCodeB;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date date;
    protected double rateBuy;
    protected double rateCross;
    protected double rateSell;

    /**
     * Gets the value of the currencyCodeA property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCodeA() {
        return currencyCodeA;
    }

    /**
     * Sets the value of the currencyCodeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCodeA(CurrencyCode value) {
        this.currencyCodeA = value;
    }

    /**
     * Gets the value of the currencyCodeB property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCodeB() {
        return currencyCodeB;
    }

    /**
     * Sets the value of the currencyCodeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCodeB(CurrencyCode value) {
        this.currencyCodeB = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the rateBuy property.
     * 
     */
    public double getRateBuy() {
        return rateBuy;
    }

    /**
     * Sets the value of the rateBuy property.
     * 
     */
    public void setRateBuy(double value) {
        this.rateBuy = value;
    }

    /**
     * Gets the value of the rateCross property.
     * 
     */
    public double getRateCross() {
        return rateCross;
    }

    /**
     * Sets the value of the rateCross property.
     * 
     */
    public void setRateCross(double value) {
        this.rateCross = value;
    }

    /**
     * Gets the value of the rateSell property.
     * 
     */
    public double getRateSell() {
        return rateSell;
    }

    /**
     * Sets the value of the rateSell property.
     * 
     */
    public void setRateSell(double value) {
        this.rateSell = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "currencyCodeA=" + currencyCodeA +
                ", currencyCodeB=" + currencyCodeB +
                ", date=" + date +
                ", rateBuy=" + rateBuy +
                ", rateCross=" + rateCross +
                ", rateSell=" + rateSell +
                '}';
    }
}
