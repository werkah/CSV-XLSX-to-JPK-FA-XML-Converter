package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;

@XmlRootElement(name="tns:FakturaWierszCtrl")
public class FakturaWierszCtrl {
    @XmlElement(name="tns:LiczbaWierszyFaktur")
    int numberOfRows;
    @XmlElement(name="tns:WartoscWierszyFaktur")
    BigDecimal valueOfRInvoices;

    public FakturaWierszCtrl(){
        numberOfRows = 0;
        valueOfRInvoices = new BigDecimal("0");
    }
    public void addInvoice() {
        numberOfRows += 1;
    }
    public void increaseValueOfInvoices(BigDecimal value) {
        valueOfRInvoices = valueOfRInvoices.add(value);
    }

}
