//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.08 at 04:36:24 PM CEST 
//


package fbk.se.services.mutation.constraints;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fbk.se.services.mutation.constraints package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Length_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "length");
    private final static QName _Enumeration_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "enumeration");
    private final static QName _MaxInclusive_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "maxInclusive");
    private final static QName _MaxExclusive_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "maxExclusive");
    private final static QName _MaxLength_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "maxLength");
    private final static QName _MinInclusive_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "minInclusive");
    private final static QName _FractionDigits_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "fractionDigits");
    private final static QName _MinLength_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "minLength");
    private final static QName _MinExclusive_QNAME = new QName("http://www.fbk.eu/WSDLConstraints", "minExclusive");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fbk.se.services.mutation.constraints
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConstraintType }
     * 
     */
    public ConstraintType createConstraintType() {
        return new ConstraintType();
    }

    /**
     * Create an instance of {@link Pattern }
     * 
     */
    public Pattern createPattern() {
        return new Pattern();
    }

    /**
     * Create an instance of {@link Facet }
     * 
     */
    public Facet createFacet() {
        return new Facet();
    }

    /**
     * Create an instance of {@link NumFacet }
     * 
     */
    public NumFacet createNumFacet() {
        return new NumFacet();
    }

    /**
     * Create an instance of {@link NoFixedFacet }
     * 
     */
    public NoFixedFacet createNoFixedFacet() {
        return new NoFixedFacet();
    }

    /**
     * Create an instance of {@link WhiteSpace }
     * 
     */
    public WhiteSpace createWhiteSpace() {
        return new WhiteSpace();
    }

    /**
     * Create an instance of {@link ComplexRestrictionType }
     * 
     */
    public ComplexRestrictionType createComplexRestrictionType() {
        return new ComplexRestrictionType();
    }

    /**
     * Create an instance of {@link Constraints }
     * 
     */
    public Constraints createConstraints() {
        return new Constraints();
    }

    /**
     * Create an instance of {@link TotalDigits }
     * 
     */
    public TotalDigits createTotalDigits() {
        return new TotalDigits();
    }

    /**
     * Create an instance of {@link OnElementType }
     * 
     */
    public OnElementType createOnElementType() {
        return new OnElementType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "length")
    public JAXBElement<NumFacet> createLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_Length_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoFixedFacet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "enumeration")
    public JAXBElement<NoFixedFacet> createEnumeration(NoFixedFacet value) {
        return new JAXBElement<NoFixedFacet>(_Enumeration_QNAME, NoFixedFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "maxInclusive")
    public JAXBElement<Facet> createMaxInclusive(Facet value) {
        return new JAXBElement<Facet>(_MaxInclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "maxExclusive")
    public JAXBElement<Facet> createMaxExclusive(Facet value) {
        return new JAXBElement<Facet>(_MaxExclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "maxLength")
    public JAXBElement<NumFacet> createMaxLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_MaxLength_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "minInclusive")
    public JAXBElement<Facet> createMinInclusive(Facet value) {
        return new JAXBElement<Facet>(_MinInclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "fractionDigits")
    public JAXBElement<NumFacet> createFractionDigits(NumFacet value) {
        return new JAXBElement<NumFacet>(_FractionDigits_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "minLength")
    public JAXBElement<NumFacet> createMinLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_MinLength_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fbk.eu/WSDLConstraints", name = "minExclusive")
    public JAXBElement<Facet> createMinExclusive(Facet value) {
        return new JAXBElement<Facet>(_MinExclusive_QNAME, Facet.class, null, value);
    }

}
