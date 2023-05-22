package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="tns:JPK")
public class JPK {

    public JPK(){
        this.nag = new Naglowek();
        this.pod1 = new Podmiot1();
        this.faktury = new ArrayList<>();
        this.fc = new FakturaCtrl();
        this.wiersze = new ArrayList<>();
        this.fwc = new FakturaWierszCtrl();
    }

    @XmlElement(name = "tns:Naglowek")
    public Naglowek nag;
    @XmlElement(name = "tns:Podmiot1")
    public Podmiot1 pod1;

    @XmlElement(name = "tns:Faktura")
    public ArrayList<Faktura> faktury;

    @XmlElement(name = "tns:FakturaCtrl")
    public FakturaCtrl fc;

    @XmlElement(name = "tns:FakturaWiersz")
    public ArrayList<FakturaWiersz> wiersze;

    @XmlElement(name = "tns:FakturaWierszCtrl")
    public FakturaWierszCtrl fwc;


    public boolean nameCheck(String name) {
        return faktury.stream().anyMatch(f -> f.getId().equals(name));
    }

    public void addF(Faktura f) {
        fc.increaseValueOfInvoices(f.getSum()); //wartosc
        if (!nameCheck(f.getId())) {
            fc.addInvoice(); //liczba
            faktury.add(f); //lista
        }
    }

    public void addFW(FakturaWiersz fw) {
        wiersze.add(fw); //lista
        fwc.addInvoice(); //liczba
        fwc.increaseValueOfInvoices(fw.getSum()); //wartosc
    }
}
