//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.27 at 01:01:44 PM IST 
//


package com.stack.parser.posts;

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
 *                 &lt;attribute name="PostTypeId" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                 &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="Score" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                 &lt;attribute name="ViewCount" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="Body" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OwnerUserId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Tags" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AnswerCount" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                 &lt;attribute name="CommentCount" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                 &lt;attribute name="FavoriteCount" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                 &lt;attribute name="ClosedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="AcceptedAnswerId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="LastEditorUserId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="LastEditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="ParentId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                 &lt;attribute name="LastEditorDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OwnerDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CommunityOwnedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
@XmlRootElement(name = "posts")
public class Posts {

    protected List<Posts.Row> row;

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
     * {@link Posts.Row }
     * 
     * 
     */
    public List<Posts.Row> getRow() {
        if (row == null) {
            row = new ArrayList<Posts.Row>();
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
     *       &lt;attribute name="PostTypeId" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *       &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="Score" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *       &lt;attribute name="ViewCount" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="Body" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OwnerUserId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Tags" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AnswerCount" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *       &lt;attribute name="CommentCount" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *       &lt;attribute name="FavoriteCount" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *       &lt;attribute name="ClosedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="AcceptedAnswerId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="LastEditorUserId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="LastEditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="ParentId" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *       &lt;attribute name="LastEditorDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OwnerDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CommunityOwnedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
        @XmlAttribute(name = "PostTypeId")
        protected Byte postTypeId;
        @XmlAttribute(name = "CreationDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar creationDate;
        @XmlAttribute(name = "Score")
        protected Byte score;
        @XmlAttribute(name = "ViewCount")
        protected Short viewCount;
        @XmlAttribute(name = "Body")
        protected String body;
        @XmlAttribute(name = "OwnerUserId")
        protected Short ownerUserId;
        @XmlAttribute(name = "LastActivityDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastActivityDate;
        @XmlAttribute(name = "Title")
        protected String title;
        @XmlAttribute(name = "Tags")
        protected String tags;
        @XmlAttribute(name = "AnswerCount")
        protected Byte answerCount;
        @XmlAttribute(name = "CommentCount")
        protected Byte commentCount;
        @XmlAttribute(name = "FavoriteCount")
        protected Byte favoriteCount;
        @XmlAttribute(name = "ClosedDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar closedDate;
        @XmlAttribute(name = "AcceptedAnswerId")
        protected Short acceptedAnswerId;
        @XmlAttribute(name = "LastEditorUserId")
        protected Short lastEditorUserId;
        @XmlAttribute(name = "LastEditDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastEditDate;
        @XmlAttribute(name = "ParentId")
        protected Short parentId;
        @XmlAttribute(name = "LastEditorDisplayName")
        protected String lastEditorDisplayName;
        @XmlAttribute(name = "OwnerDisplayName")
        protected String ownerDisplayName;
        @XmlAttribute(name = "CommunityOwnedDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar communityOwnedDate;

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
         * Gets the value of the postTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getPostTypeId() {
            return postTypeId;
        }

        /**
         * Sets the value of the postTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setPostTypeId(Byte value) {
            this.postTypeId = value;
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
         * Gets the value of the viewCount property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getViewCount() {
            return viewCount;
        }

        /**
         * Sets the value of the viewCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setViewCount(Short value) {
            this.viewCount = value;
        }

        /**
         * Gets the value of the body property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBody() {
            return body;
        }

        /**
         * Sets the value of the body property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBody(String value) {
            this.body = value;
        }

        /**
         * Gets the value of the ownerUserId property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getOwnerUserId() {
            return ownerUserId;
        }

        /**
         * Sets the value of the ownerUserId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setOwnerUserId(Short value) {
            this.ownerUserId = value;
        }

        /**
         * Gets the value of the lastActivityDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastActivityDate() {
            return lastActivityDate;
        }

        /**
         * Sets the value of the lastActivityDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastActivityDate(XMLGregorianCalendar value) {
            this.lastActivityDate = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the tags property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTags() {
            return tags;
        }

        /**
         * Sets the value of the tags property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTags(String value) {
            this.tags = value;
        }

        /**
         * Gets the value of the answerCount property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getAnswerCount() {
            return answerCount;
        }

        /**
         * Sets the value of the answerCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setAnswerCount(Byte value) {
            this.answerCount = value;
        }

        /**
         * Gets the value of the commentCount property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getCommentCount() {
            return commentCount;
        }

        /**
         * Sets the value of the commentCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setCommentCount(Byte value) {
            this.commentCount = value;
        }

        /**
         * Gets the value of the favoriteCount property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getFavoriteCount() {
            return favoriteCount;
        }

        /**
         * Sets the value of the favoriteCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setFavoriteCount(Byte value) {
            this.favoriteCount = value;
        }

        /**
         * Gets the value of the closedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getClosedDate() {
            return closedDate;
        }

        /**
         * Sets the value of the closedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setClosedDate(XMLGregorianCalendar value) {
            this.closedDate = value;
        }

        /**
         * Gets the value of the acceptedAnswerId property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getAcceptedAnswerId() {
            return acceptedAnswerId;
        }

        /**
         * Sets the value of the acceptedAnswerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setAcceptedAnswerId(Short value) {
            this.acceptedAnswerId = value;
        }

        /**
         * Gets the value of the lastEditorUserId property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getLastEditorUserId() {
            return lastEditorUserId;
        }

        /**
         * Sets the value of the lastEditorUserId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setLastEditorUserId(Short value) {
            this.lastEditorUserId = value;
        }

        /**
         * Gets the value of the lastEditDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastEditDate() {
            return lastEditDate;
        }

        /**
         * Sets the value of the lastEditDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastEditDate(XMLGregorianCalendar value) {
            this.lastEditDate = value;
        }

        /**
         * Gets the value of the parentId property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getParentId() {
            return parentId;
        }

        /**
         * Sets the value of the parentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setParentId(Short value) {
            this.parentId = value;
        }

        /**
         * Gets the value of the lastEditorDisplayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastEditorDisplayName() {
            return lastEditorDisplayName;
        }

        /**
         * Sets the value of the lastEditorDisplayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastEditorDisplayName(String value) {
            this.lastEditorDisplayName = value;
        }

        /**
         * Gets the value of the ownerDisplayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerDisplayName() {
            return ownerDisplayName;
        }

        /**
         * Sets the value of the ownerDisplayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerDisplayName(String value) {
            this.ownerDisplayName = value;
        }

        /**
         * Gets the value of the communityOwnedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCommunityOwnedDate() {
            return communityOwnedDate;
        }

        /**
         * Sets the value of the communityOwnedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCommunityOwnedDate(XMLGregorianCalendar value) {
            this.communityOwnedDate = value;
        }

    }

}
