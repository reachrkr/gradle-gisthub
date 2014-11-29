//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.27 at 01:04:41 PM IST 
//


package com.stack.parser.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="row" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="Reputation" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LastAccessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="WebsiteUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AboutMe" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Views" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                 &lt;attribute name="UpVotes" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="DownVotes" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                 &lt;attribute name="AccountId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="ProfileImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "row"
})
@XmlRootElement(name = "users")
public class Users {

    protected List<Users.Row> row;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Users.Row }
     * 
     * 
     */
    public List<Users.Row> getRow() {
        if (row == null) {
            row = new ArrayList<Users.Row>();
        }
        return this.row;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="Reputation" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LastAccessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="WebsiteUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AboutMe" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Views" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *       &lt;attribute name="UpVotes" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="DownVotes" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *       &lt;attribute name="AccountId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="ProfileImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Row {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Id")
        protected Short id;
        @XmlAttribute(name = "Reputation")
        protected Short reputation;
        @XmlAttribute(name = "CreationDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar creationDate;
        @XmlAttribute(name = "DisplayName")
        protected String displayName;
        @XmlAttribute(name = "LastAccessDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastAccessDate;
        @XmlAttribute(name = "WebsiteUrl")
        protected String websiteUrl;
        @XmlAttribute(name = "Location")
        protected String location;
        @XmlAttribute(name = "AboutMe")
        protected String aboutMe;
        @XmlAttribute(name = "Views")
        protected Byte views;
        @XmlAttribute(name = "UpVotes")
        protected Short upVotes;
        @XmlAttribute(name = "DownVotes")
        protected Byte downVotes;
        @XmlAttribute(name = "AccountId")
        protected Integer accountId;
        @XmlAttribute(name = "ProfileImageUrl")
        protected String profileImageUrl;
        @XmlAttribute(name = "Age")
        protected Byte age;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setId(Short value) {
            this.id = value;
        }

        /**
         * Gets the value of the reputation property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getReputation() {
            return reputation;
        }

        /**
         * Sets the value of the reputation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setReputation(Short value) {
            this.reputation = value;
        }

        /**
         * Gets the value of the creationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreationDate() {
            return creationDate;
        }

        /**
         * Sets the value of the creationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreationDate(XMLGregorianCalendar value) {
            this.creationDate = value;
        }

        /**
         * Gets the value of the displayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * Sets the value of the displayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayName(String value) {
            this.displayName = value;
        }

        /**
         * Gets the value of the lastAccessDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastAccessDate() {
            return lastAccessDate;
        }

        /**
         * Sets the value of the lastAccessDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastAccessDate(XMLGregorianCalendar value) {
            this.lastAccessDate = value;
        }

        /**
         * Gets the value of the websiteUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebsiteUrl() {
            return websiteUrl;
        }

        /**
         * Sets the value of the websiteUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebsiteUrl(String value) {
            this.websiteUrl = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the aboutMe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAboutMe() {
            return aboutMe;
        }

        /**
         * Sets the value of the aboutMe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAboutMe(String value) {
            this.aboutMe = value;
        }

        /**
         * Gets the value of the views property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getViews() {
            return views;
        }

        /**
         * Sets the value of the views property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setViews(Byte value) {
            this.views = value;
        }

        /**
         * Gets the value of the upVotes property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getUpVotes() {
            return upVotes;
        }

        /**
         * Sets the value of the upVotes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setUpVotes(Short value) {
            this.upVotes = value;
        }

        /**
         * Gets the value of the downVotes property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getDownVotes() {
            return downVotes;
        }

        /**
         * Sets the value of the downVotes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setDownVotes(Byte value) {
            this.downVotes = value;
        }

        /**
         * Gets the value of the accountId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAccountId() {
            return accountId;
        }

        /**
         * Sets the value of the accountId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAccountId(Integer value) {
            this.accountId = value;
        }

        /**
         * Gets the value of the profileImageUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileImageUrl() {
            return profileImageUrl;
        }

        /**
         * Sets the value of the profileImageUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileImageUrl(String value) {
            this.profileImageUrl = value;
        }

        /**
         * Gets the value of the age property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setAge(Byte value) {
            this.age = value;
        }

    }

}
