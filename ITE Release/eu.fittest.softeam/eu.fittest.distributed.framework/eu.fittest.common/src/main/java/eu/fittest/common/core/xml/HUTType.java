//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.29 at 02:10:00 PM CET 
//


package eu.fittest.common.core.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HUTType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HUTType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Client"/>
 *     &lt;enumeration value="Server"/>
 *     &lt;enumeration value="Mixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HUTType")
@XmlEnum
public enum HUTType {

    @XmlEnumValue("Client")
    CLIENT("Client"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed");
    private final String value;

    HUTType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HUTType fromValue(String v) {
        for (HUTType c: HUTType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}