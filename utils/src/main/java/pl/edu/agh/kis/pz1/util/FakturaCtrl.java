package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name="tns:FakturaCtrl")
public class FakturaCtrl {
    @XmlElement(name="tns:LiczbaFaktur")
    int numberOfInvoices;
    @XmlElement(name="tns:WartoscFaktur")
    BigDecimal valueOfInvoices;

    public FakturaCtrl(){
        numberOfInvoices = 0;
        valueOfInvoices = new BigDecimal("0");
    }
    public void addInvoice() {
        numberOfInvoices += 1;
    }
    public void increaseValueOfInvoices(BigDecimal value) {
        valueOfInvoices = valueOfInvoices.add(value);
    }
}

