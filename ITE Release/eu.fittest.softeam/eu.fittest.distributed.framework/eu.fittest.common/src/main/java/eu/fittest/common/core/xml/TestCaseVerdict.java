//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 01:51:07 PM CET 
//


package eu.fittest.common.core.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestCaseVerdict.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestCaseVerdict">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Passed"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestCaseVerdict")
@XmlEnum
public enum TestCaseVerdict {

    @XmlEnumValue("Passed")
    PASSED("Passed"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    TestCaseVerdict(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestCaseVerdict fromValue(String v) {
        for (TestCaseVerdict c: TestCaseVerdict.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
