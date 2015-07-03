//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import edu.isi.bmkeg.lapdf.pmcXml.mathml.PmcXmlMath;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}inline-supplementary-material"/>
 *         &lt;element ref="{}related-article"/>
 *         &lt;element ref="{}related-object"/>
 *         &lt;element ref="{}address"/>
 *         &lt;element ref="{}alternatives"/>
 *         &lt;element ref="{}array"/>
 *         &lt;element ref="{}boxed-text"/>
 *         &lt;element ref="{}chem-struct-wrap"/>
 *         &lt;element ref="{}fig"/>
 *         &lt;element ref="{}fig-group"/>
 *         &lt;element ref="{}graphic"/>
 *         &lt;element ref="{}media"/>
 *         &lt;element ref="{}preformat"/>
 *         &lt;element ref="{}supplementary-material"/>
 *         &lt;element ref="{}table-wrap"/>
 *         &lt;element ref="{}table-wrap-group"/>
 *         &lt;element ref="{}disp-formula"/>
 *         &lt;element ref="{}disp-formula-group"/>
 *         &lt;element ref="{}element-citation"/>
 *         &lt;element ref="{}mixed-citation"/>
 *         &lt;element ref="{}nlm-citation"/>
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}award-id"/>
 *         &lt;element ref="{}funding-source"/>
 *         &lt;element ref="{}open-access"/>
 *         &lt;element ref="{}chem-struct"/>
 *         &lt;element ref="{}inline-formula"/>
 *         &lt;element ref="{}inline-graphic"/>
 *         &lt;element ref="{}private-char"/>
 *         &lt;element ref="{}def-list"/>
 *         &lt;element ref="{}list"/>
 *         &lt;element ref="{}tex-math"/>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *         &lt;element ref="{}abbrev"/>
 *         &lt;element ref="{}milestone-end"/>
 *         &lt;element ref="{}milestone-start"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}disp-quote"/>
 *         &lt;element ref="{}speech"/>
 *         &lt;element ref="{}statement"/>
 *         &lt;element ref="{}verse-group"/>
 *         &lt;element ref="{}fn"/>
 *         &lt;element ref="{}target"/>
 *         &lt;element ref="{}xref"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "p")
public class PmcXmlP {

    @XmlElementRefs({
        @XmlElementRef(name = "sub", type = PmcXmlSub.class, required = false),
        @XmlElementRef(name = "ext-link", type = PmcXmlExtLink.class, required = false),
        @XmlElementRef(name = "milestone-end", type = PmcXmlMilestoneEnd.class, required = false),
        @XmlElementRef(name = "target", type = PmcXmlTarget.class, required = false),
        @XmlElementRef(name = "nlm-citation", type = PmcXmlNlmCitation.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMath.class, required = false),
        @XmlElementRef(name = "funding-source", type = PmcXmlFundingSource.class, required = false),
        @XmlElementRef(name = "sans-serif", type = PmcXmlSansSerif.class, required = false),
        @XmlElementRef(name = "italic", type = PmcXmlItalic.class, required = false),
        @XmlElementRef(name = "fn", type = PmcXmlFn.class, required = false),
        @XmlElementRef(name = "verse-group", type = PmcXmlVerseGroup.class, required = false),
        @XmlElementRef(name = "speech", type = PmcXmlSpeech.class, required = false),
        @XmlElementRef(name = "styled-content", type = PmcXmlStyledContent.class, required = false),
        @XmlElementRef(name = "media", type = PmcXmlMedia.class, required = false),
        @XmlElementRef(name = "graphic", type = PmcXmlGraphic.class, required = false),
        @XmlElementRef(name = "milestone-start", type = PmcXmlMilestoneStart.class, required = false),
        @XmlElementRef(name = "address", type = PmcXmlAddress.class, required = false),
        @XmlElementRef(name = "preformat", type = PmcXmlPreformat.class, required = false),
        @XmlElementRef(name = "list", type = PmcXmlList.class, required = false),
        @XmlElementRef(name = "tex-math", type = PmcXmlTexMath.class, required = false),
        @XmlElementRef(name = "statement", type = PmcXmlStatement.class, required = false),
        @XmlElementRef(name = "boxed-text", type = PmcXmlBoxedText.class, required = false),
        @XmlElementRef(name = "alternatives", type = PmcXmlAlternatives.class, required = false),
        @XmlElementRef(name = "named-content", type = PmcXmlNamedContent.class, required = false),
        @XmlElementRef(name = "def-list", type = PmcXmlDefList.class, required = false),
        @XmlElementRef(name = "mixed-citation", type = PmcXmlMixedCitation.class, required = false),
        @XmlElementRef(name = "overline", type = PmcXmlOverline.class, required = false),
        @XmlElementRef(name = "uri", type = PmcXmlUri.class, required = false),
        @XmlElementRef(name = "strike", type = PmcXmlStrike.class, required = false),
        @XmlElementRef(name = "xref", type = PmcXmlXref.class, required = false),
        @XmlElementRef(name = "element-citation", type = PmcXmlElementCitation.class, required = false),
        @XmlElementRef(name = "inline-formula", type = PmcXmlInlineFormula.class, required = false),
        @XmlElementRef(name = "disp-quote", type = PmcXmlDispQuote.class, required = false),
        @XmlElementRef(name = "sup", type = PmcXmlSup.class, required = false),
        @XmlElementRef(name = "table-wrap-group", type = PmcXmlTableWrapGroup.class, required = false),
        @XmlElementRef(name = "array", type = PmcXmlArray.class, required = false),
        @XmlElementRef(name = "chem-struct", type = PmcXmlChemStruct.class, required = false),
        @XmlElementRef(name = "private-char", type = PmcXmlPrivateChar.class, required = false),
        @XmlElementRef(name = "chem-struct-wrap", type = PmcXmlChemStructWrap.class, required = false),
        @XmlElementRef(name = "sc", type = PmcXmlSc.class, required = false),
        @XmlElementRef(name = "monospace", type = PmcXmlMonospace.class, required = false),
        @XmlElementRef(name = "disp-formula", type = PmcXmlDispFormula.class, required = false),
        @XmlElementRef(name = "underline", type = PmcXmlUnderline.class, required = false),
        @XmlElementRef(name = "fig-group", type = PmcXmlFigGroup.class, required = false),
        @XmlElementRef(name = "email", type = PmcXmlEmail.class, required = false),
        @XmlElementRef(name = "roman", type = PmcXmlRoman.class, required = false),
        @XmlElementRef(name = "fig", type = PmcXmlFig.class, required = false),
        @XmlElementRef(name = "table-wrap", type = PmcXmlTableWrap.class, required = false),
        @XmlElementRef(name = "disp-formula-group", type = PmcXmlDispFormulaGroup.class, required = false),
        @XmlElementRef(name = "open-access", type = PmcXmlOpenAccess.class, required = false),
        @XmlElementRef(name = "inline-graphic", type = PmcXmlInlineGraphic.class, required = false),
        @XmlElementRef(name = "related-article", type = PmcXmlRelatedArticle.class, required = false),
        @XmlElementRef(name = "inline-supplementary-material", type = PmcXmlInlineSupplementaryMaterial.class, required = false),
        @XmlElementRef(name = "abbrev", type = PmcXmlAbbrev.class, required = false),
        @XmlElementRef(name = "related-object", type = PmcXmlRelatedObject.class, required = false),
        @XmlElementRef(name = "award-id", type = PmcXmlAwardId.class, required = false),
        @XmlElementRef(name = "bold", type = PmcXmlBold.class, required = false),
        @XmlElementRef(name = "supplementary-material", type = PmcXmlSupplementaryMaterial.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlSub }
     * {@link PmcXmlExtLink }
     * {@link PmcXmlMilestoneEnd }
     * {@link PmcXmlTarget }
     * {@link PmcXmlNlmCitation }
     * {@link PmcXmlMath }
     * {@link PmcXmlFundingSource }
     * {@link PmcXmlSansSerif }
     * {@link PmcXmlItalic }
     * {@link PmcXmlFn }
     * {@link PmcXmlVerseGroup }
     * {@link PmcXmlSpeech }
     * {@link PmcXmlStyledContent }
     * {@link PmcXmlMedia }
     * {@link PmcXmlGraphic }
     * {@link PmcXmlMilestoneStart }
     * {@link PmcXmlAddress }
     * {@link PmcXmlPreformat }
     * {@link PmcXmlList }
     * {@link PmcXmlTexMath }
     * {@link PmcXmlStatement }
     * {@link PmcXmlBoxedText }
     * {@link PmcXmlAlternatives }
     * {@link PmcXmlNamedContent }
     * {@link PmcXmlDefList }
     * {@link PmcXmlMixedCitation }
     * {@link PmcXmlOverline }
     * {@link PmcXmlUri }
     * {@link PmcXmlStrike }
     * {@link PmcXmlXref }
     * {@link PmcXmlElementCitation }
     * {@link PmcXmlInlineFormula }
     * {@link PmcXmlDispQuote }
     * {@link PmcXmlSup }
     * {@link PmcXmlTableWrapGroup }
     * {@link PmcXmlArray }
     * {@link PmcXmlChemStruct }
     * {@link PmcXmlPrivateChar }
     * {@link PmcXmlChemStructWrap }
     * {@link PmcXmlSc }
     * {@link PmcXmlMonospace }
     * {@link PmcXmlDispFormula }
     * {@link PmcXmlUnderline }
     * {@link PmcXmlFigGroup }
     * {@link PmcXmlEmail }
     * {@link PmcXmlRoman }
     * {@link PmcXmlFig }
     * {@link PmcXmlTableWrap }
     * {@link PmcXmlDispFormulaGroup }
     * {@link PmcXmlOpenAccess }
     * {@link PmcXmlInlineGraphic }
     * {@link String }
     * {@link PmcXmlRelatedArticle }
     * {@link PmcXmlInlineSupplementaryMaterial }
     * {@link PmcXmlAbbrev }
     * {@link PmcXmlRelatedObject }
     * {@link PmcXmlAwardId }
     * {@link PmcXmlBold }
     * {@link PmcXmlSupplementaryMaterial }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}