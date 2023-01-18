package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.IOException;
import java.math.BigDecimal;

@XmlRootElement(name="tns:FakturaCtrl")
public class fakturactrl {
    @XmlElement(name="tns:LiczbaFaktur")
    int numberOfInvoices;
    @XmlElement(name="tns:WartoscFaktur")
    BigDecimal valueOfInvoices;

    fakturactrl(String type, String input) throws IOException {
        numberOfInvoices = 0;
        valueOfInvoices = new BigDecimal("0");
        if(type.equals("xlsx")){
            XLSXReader readerXLSX = new XLSXReader();
            readerXLSX.ReaderXLSX(input);
            for(faktura f : readerXLSX.getfaktury()){
                numberOfInvoices += 1;
                valueOfInvoices = valueOfInvoices.add(new BigDecimal(String.valueOf(f.getP15())));
            }
        }
        else{
            CSVReader readerCSV = new CSVReader();
            readerCSV.ReaderCSV(input);
            for(faktura f : readerCSV.getfaktury()){
                numberOfInvoices += 1;
                valueOfInvoices = valueOfInvoices.add(new BigDecimal(String.valueOf(f.getP15())));
            }
        }

    }
    public int getlfaktury() {
        return numberOfInvoices;}
    public BigDecimal getwfaktury() {
        return valueOfInvoices;}
    public fakturactrl(){}
}

