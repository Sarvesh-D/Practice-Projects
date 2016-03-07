//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.26 at 09:38:01 PM IST 
//


package com.ds.appmanager.model;

import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationLaunch" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="live" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationId",
    "applicationName",
    "applicationDesc",
    "applicationLaunch",
    "live"
})
@XmlRootElement(name = "ApplicationView")
public class ApplicationView {

    protected int applicationId;
    @XmlElement(required = true)
    protected String applicationName;
    @XmlElement(required = true)
    protected String applicationDesc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date applicationLaunch;
    protected boolean live;
    
    protected Set<UserView> users;

    /**
     * Gets the value of the applicationId property.
     * 
     */
    public int getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     */
    public void setApplicationId(int value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the applicationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDesc() {
        return applicationDesc;
    }

    /**
     * Sets the value of the applicationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDesc(String value) {
        this.applicationDesc = value;
    }

    /**
     * Gets the value of the applicationLaunch property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getApplicationLaunch() {
        return applicationLaunch;
    }

    /**
     * Sets the value of the applicationLaunch property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationLaunch(Date value) {
        this.applicationLaunch = value;
    }

    /**
     * Gets the value of the live property.
     * 
     */
    public boolean isLive() {
        return live;
    }

    /**
     * Sets the value of the live property.
     * 
     */
    public void setLive(boolean value) {
        this.live = value;
    }

	public Set<UserView> getUsers() {
		return users;
	}

	public void setUsers(Set<UserView> users) {
		this.users = users;
	}
    
    

}
