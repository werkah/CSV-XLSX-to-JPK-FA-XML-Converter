package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.IOException;

@XmlRootElement(name="tns:JPK")
public class JPK {
    public static class naglowek {
        @XmlElement(name = "tns:KodFormularza")
        final
        String KodFormularza;
        @XmlElement(name = "tns:WariantFormularza")
        final
        String WariantFormularza;
        @XmlElement(name = "tns:CelZlozenia")
        final
        String CelZlozenia;
        @XmlElement(name = "tns:DataWytworzeniaJPK")
        final
        String DataWytworzenia;
        @XmlElement(name = "tns:DataOd")
        final
        String DataOd;
        @XmlElement(name = "tns:DataDo")
        final
        String DataDo;
        @XmlElement(name = "tns:KodUrzedu")
        final
        String KodUrzedu;
        public naglowek() {
            KodFormularza= "JPK_FA";
            WariantFormularza= "3";
            CelZlozenia= "1";
            DataWytworzenia= "2021-10-28T16:30:54.533";
            DataOd= "2020-10-01";
            DataDo= "2020-12-31";
            KodUrzedu= "1208";
        }
    }
    public static class podmiot1 {
        public static class identyfikatorPodmiotu {
            @XmlElement(name = "etd:NIP")
            final
            String NIP;
            @XmlElement(name = "etd:PelnaNazwa")
            final
            String PelnaNazwa;

            public identyfikatorPodmiotu() {
                NIP = "6762484560";
                PelnaNazwa = "\"CORE LOGIC\" SPÓŁKA Z OGRANICZONĄ ODPOWIEDZIALNOŚCIĄ";
            }
        }

        public static class adresPodmiotu {
            @XmlElement(name = "etd:KodKraju")
            final
            String KodKraju;
            @XmlElement(name = "etd:Wojewodztwo")
            final
            String Wojewodztwo;
            @XmlElement(name = "etd:Powiat")
            final
            String Powiat;
            @XmlElement(name = "etd:Gmina")
            final
            String Gmina;
            @XmlElement(name = "etd:Ulica")
            final
            String Ulica;
            @XmlElement(name = "etd:NrDomu")
            final
            String NrDomu;
            @XmlElement(name = "etd:NrLokalu")
            final
            String NrLokalu;
            @XmlElement(name = "etd:Miejscowosc")
            final
            String Miejscowosc;
            @XmlElement(name = "etd:KodPocztowy")
            final
            String KodPocztowy;

            public adresPodmiotu() {
                KodKraju = "PL";
                Wojewodztwo = "małopolskie";
                Powiat = "m. Kraków";
                Gmina = "Kraków";
                Ulica = "ul. Feliksa Radwańskiego";
                NrDomu = "15";
                NrLokalu = "1";
                Miejscowosc = "Kraków";
                KodPocztowy = "30-065";
            }

        }
        @XmlElement(name = "tns:IdentyfikatorPodmiotu")
        final identyfikatorPodmiotu IdentyfikatorPodmiotu;
        @XmlElement(name = "tns:AdresPodmiotu")
        final adresPodmiotu AdresPodmiotu;
        public podmiot1() {
            IdentyfikatorPodmiotu = new identyfikatorPodmiotu();
            AdresPodmiotu = new adresPodmiotu();
        }
    }

    public JPK(String type, String input) throws IOException {
        this.nag = new naglowek();
        this.pod1 = new podmiot1();
        this.faktury = new fakturalist(type,input);
        this.fc = new fakturactrl(type,input);
        this.wiersze = new fakturawierszlist(type,input);
        this.fwc = new fakturawierszctrl(type,input);
    }

    @XmlElement(name = "tns:Naglowek")
    public naglowek nag;
    @XmlElement(name = "tns:Podmiot1")
    public podmiot1 pod1;

    @XmlElement(name = "tns:Faktura")
    public fakturalist faktury;

    @XmlElement(name = "tns:FakturaCtrl")
    public fakturactrl fc;

    @XmlElement(name = "tns:FakturaWiersz")
    public fakturawierszlist wiersze;

    @XmlElement(name = "tns:FakturaWierszCtrl")
    public fakturawierszctrl fwc;

    public JPK(){}
}
