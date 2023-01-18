package pl.edu.agh.kis.pz1.util;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="tns:Faktury")
public class fakturawierszlist{
    private List<fakturawiersz> wiersze = new ArrayList<>();
    public fakturawierszlist(String type, String input) throws IOException {
        if(type.equals("xlsx")){
            XLSXReader readerXLSX = new XLSXReader();
            readerXLSX.ReaderXLSX(input);
            wiersze.addAll(readerXLSX.getwiersze());
        }
        else{
            CSVReader readerCSV = new CSVReader();
            readerCSV.ReaderCSV(input);
            wiersze.addAll(readerCSV.getwiersze());
        }
    }

    @XmlElement(name = "tns:FakturaWiersz")
    public List<fakturawiersz> getlwiersze() {
        return wiersze;
    }


    public fakturawierszlist() {}
}
