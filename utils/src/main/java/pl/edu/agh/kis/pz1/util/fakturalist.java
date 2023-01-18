package pl.edu.agh.kis.pz1.util;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="tns:Faktury")
public class fakturalist{
    private final List<faktura> faktury = new ArrayList<>();
    public fakturalist(String type, String input) throws IOException {
        if(type.equals("xlsx")){
            XLSXReader readerXLSX = new XLSXReader();
            readerXLSX.ReaderXLSX(input);
            faktury.addAll(readerXLSX.getfaktury());
        }
        else {
            CSVReader readerCSV = new CSVReader();
            readerCSV.ReaderCSV(input);
            faktury.addAll(readerCSV.getfaktury());
        }
    }

    @XmlElement(name = "tns:Faktura")
    public List<faktura> getfaktury() {
        return faktury;
    }

    public fakturalist(){}
}