package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.IOException;
import java.math.BigDecimal;

@XmlRootElement(name="tns:FakturaWierszCtrl")
public class fakturawierszctrl {
    @XmlElement(name="tns:LiczbaWierszyFaktur")
    int numberOfRows;
    @XmlElement(name="tns:WartoscWierszyFaktur")
    BigDecimal valueOfRInvoices;

    fakturawierszctrl(String type, String input) throws IOException {
        numberOfRows = 0;
        valueOfRInvoices = new BigDecimal("0");
        if(type.equals("xlsx")) {
            XLSXReader readerXLSX = new XLSXReader();
            readerXLSX.ReaderXLSX(input);
            for(fakturawiersz f : readerXLSX.getwiersze()){
                numberOfRows += 1;
                valueOfRInvoices = valueOfRInvoices.add(new BigDecimal(String.valueOf(f.getP11())));
            }
        }
        else{
            CSVReader readerCSV = new CSVReader();
            readerCSV.ReaderCSV(input);
            for(fakturawiersz f: readerCSV.getwiersze()){
                numberOfRows += 1;
                valueOfRInvoices = valueOfRInvoices.add(new BigDecimal(String.valueOf(f.getP11())));
            }
        }

    }
    public int getlwierszy() {
        return numberOfRows;}
    public BigDecimal getwwierszy() {
        return valueOfRInvoices;}

    public fakturawierszctrl() {}
}
