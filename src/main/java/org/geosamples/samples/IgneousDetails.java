/*
 * Copyright 2016 CIRDLES.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
 * See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
 * Any modifications to this file will be lost upon recompilation of the source schema. 
 * Generated on: 2016.03.03 at 09:06:25 AM EST 
*/


package org.geosamples.samples;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IgneousDetails.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IgneousDetails">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Exotic"/>
 *     &lt;enumeration value="Felsic"/>
 *     &lt;enumeration value="Intermediate"/>
 *     &lt;enumeration value="Mafic"/>
 *     &lt;enumeration value="UltraMafic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IgneousDetails")
@XmlEnum
public enum IgneousDetails {

    @XmlEnumValue("Exotic")
    EXOTIC("Exotic"),
    @XmlEnumValue("Felsic")
    FELSIC("Felsic"),
    @XmlEnumValue("Intermediate")
    INTERMEDIATE("Intermediate"),
    @XmlEnumValue("Mafic")
    MAFIC("Mafic"),
    @XmlEnumValue("UltraMafic")
    ULTRA_MAFIC("UltraMafic");
    private final String value;

    IgneousDetails(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IgneousDetails fromValue(String v) {
        for (IgneousDetails c: IgneousDetails.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}