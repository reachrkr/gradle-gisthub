//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.27 at 01:01:29 PM IST 
//


package com.stack.parser.comments;

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
 *                 &lt;attribute name="PostId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="Score" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="UserId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="UserDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlRootElement(name = "comments")
public class Comments {

    protected List<Comments.Row> row;

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
     * {@link Comments.Row }
     * 
     * 
     */
    public List<Comments.Row> getRow() {
        if (row == null) {
            row = new ArrayList<Comments.Row>();
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
     *       &lt;attribute name="PostId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="Score" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="UserId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="UserDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        @XmlAttribute(name = "PostId")
        protected Short postId;
        @XmlAttribute(name = "Score")
        protected Byte score;
        @XmlAttribute(name = "Text")
        protected String text;
        @XmlAttribute(name = "CreationDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar creationDate;
        @XmlAttribute(name = "UserId")
        protected Short userId;
        @XmlAttribute(name = "UserDisplayName")
        protected String userDisplayName;

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
         * Gets the value of the postId property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getPostId() {
            return postId;
        }

        /**
         * Sets the value of the postId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setPostId(Short value) {
            this.postId = value;
        }

        /**
         * Gets the value of the score property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getScore() {
            return score;
        }

        /**
         * Sets the value of the score property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setScore(Byte value) {
            this.score = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
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
         * Gets the value of the userId property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getUserId() {
            return userId;
        }

        /**
         * Sets the value of the userId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setUserId(Short value) {
            this.userId = value;
        }

        /**
         * Gets the value of the userDisplayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserDisplayName() {
            return userDisplayName;
        }

        /**
         * Sets the value of the userDisplayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserDisplayName(String value) {
            this.userDisplayName = value;
        }

    }

}
