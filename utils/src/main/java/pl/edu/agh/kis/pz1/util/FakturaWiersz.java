package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name="tns:FakturaWiersz")
public class FakturaWiersz {

    String p2B;

    final String P7 = "Sprzedaż usług krajowych";
    final String P8A = "szt";
    BigDecimal p8B;
    BigDecimal p9A;
    BigDecimal p9B;
    BigDecimal p11;
    String p12;
    public FakturaWiersz(String p2B, String p12, BigDecimal p9B, BigDecimal p8B, BigDecimal p9A, BigDecimal p11) {
        this.p2B = p2B;
        this.p12 = p12;
        this.p9B = p9B;
        this.p8B = p8B;
        this.p9A = p9A;
        this.p11 = p11;
    }

    @XmlElement(name = "tns:P_2B")
    public String getP2B() {
        return p2B;
    }

    @XmlElement(name = "tns:P_12")
    public String getP12() {
        return p12;
    }

    @XmlElement(name = "tns:P_7")
    public String getP7() {
        return P7;
    }

    @XmlElement(name = "tns:P_8A")
    public String getP8A() {
        return P8A;
    }

    @XmlElement(name = "tns:P_8B")
    public BigDecimal getP8B() {
        return p8B;
    }

    @XmlElement(name = "tns:P_9A")
    public BigDecimal getP9A() {
        return p9A;
    }

    @XmlElement(name = "tns:P_9B")
    public BigDecimal getP9B() {
        return p9B;
    }

    @XmlElement(name = "tns:P_11")
    public BigDecimal getP11() {
        return p11;
    }

    public FakturaWiersz() {
    }

    public BigDecimal getSum() {
        return p11;
    }
}
