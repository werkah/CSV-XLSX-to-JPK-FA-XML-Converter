package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 */
@XmlRootElement(name="tns:Faktura")
public class Faktura {
    final String kodWaluty = "PLN";
    String p1;
    String p2A;
    String p3A;
    String p3B;
    final String p3C = "\"CORE LOGIC\" SPÓŁKA Z OGRANICZONĄ ODPOWIEDZIALNOŚCIĄ";
    final String p3D = "ul. Feliksa Radwańskiego 15/1, 30-065 Kraków";
    final String p4A = "PL";
    final String p4B = "6762484560";
    String p5B;
    String p6;
    BigDecimal p13_1;
    BigDecimal p14_1;
    BigDecimal p15;
    final Boolean p16 = false;
    final Boolean p17 = false;
    final Boolean p18 = false;
    final Boolean p18A = false;
    final Boolean p19 = false;
    final Boolean p20 = false;
    final Boolean p21 = false;
    final Boolean p22 = false;
    final Boolean p23 = false;
    final Boolean p106E2 = false;
    final Boolean p106E3 = false;
    final String rodzajFaktury = "VAT";
    public Faktura(String p3A, String p3B, String p5B, String p1, String p6, String p2A, BigDecimal p131, BigDecimal p141, BigDecimal p15){
        this.p1 = p1;
        this.p3A = p3A;
        this.p2A = p2A;
        this.p3B = p3B;
        this.p5B = p5B;
        this.p6 = p6;
        this.p13_1 = p131;
        this.p14_1 = p141;
        this.p15 = p15;
    }

    @XmlElement(name="tns:KodWaluty")
    public String getKodWaluty() {
        return kodWaluty;
    }
    @XmlElement(name="tns:P_1")
    public String getP1() {
        return p1;
    }
    @XmlElement(name="tns:P_2A")
    public String getP2A() {
        return p2A;
    }
    @XmlElement(name="tns:P_3A")
    public String getP3A() {
        return p3A;
    }
    @XmlElement(name="tns:P_3B")
    public String getP3B() {
        return p3B;
    }
    @XmlElement(name="tns:P_3C")
    public String getP3C() {
        return p3C;
    }
    @XmlElement(name="tns:P_3D")
    public String getP3D() {
        return p3D;
    }
    @XmlElement(name="tns:P_4A")
    public String getP4A() {
        return p4A;
    }
    @XmlElement(name="tns:P_4B")
    public String getP4B() {
        return p4B;
    }
    @XmlElement (name="tns:P_5B")
    public String getP5B() {
        return p5B;
    }
    @XmlElement(name="tns:P_6")
    public String getP6() {
        return p6;
    }
    @XmlElement(name="tns:P_13_1")
    public BigDecimal getP131() {
        return p13_1;
    }
    @XmlElement(name="tns:P_14_1")
    public BigDecimal getP141() {
        return p14_1;
    }
    @XmlElement(name="tns:P_15")
    public BigDecimal getP15() {
        return p15;
    }
    @XmlElement(name="tns:P_16")
    public Boolean getP16() {
        return p16;
    }
    @XmlElement(name="tns:P_17")
    public Boolean getP17() {
        return p17;
    }
    @XmlElement(name="tns:P_18")
    public Boolean getP18() {
        return p18;
    }
    @XmlElement(name="tns:P_18A")
    public Boolean getP18A() {
        return p18A;
    }
    @XmlElement(name="tns:P_19")
    public Boolean getP19() {
        return p19;
    }
    @XmlElement(name="tns:P_20")
    public Boolean getP20() {
        return p20;
    }
    @XmlElement(name="tns:P_21")
    public Boolean getP21() {
        return p21;
    }
    @XmlElement(name="tns:P_22")
    public Boolean getP22() {
        return p22;
    }
    @XmlElement(name="tns:P_23")
    public Boolean getP23() {
        return p23;
    }
    @XmlElement(name="tns:P_106E_2")
    public Boolean getP106E2() {
        return p106E2;
    }
    @XmlElement(name="tns:P_106E_3")
    public Boolean getP106E3() {
        return p106E3;
    }
    @XmlElement(name="tns:RodzajFaktury")
    public String getRodzajFaktury() {
        return rodzajFaktury;
    }
    public Faktura(){}
    public BigDecimal getSum() {
        return p15;
    }
    public String getId() {
        return p1;
    }
}