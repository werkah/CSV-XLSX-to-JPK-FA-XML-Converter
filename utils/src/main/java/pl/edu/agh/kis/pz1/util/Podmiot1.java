package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="tns:Podmiot1")
public class Podmiot1 {
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
    public Podmiot1() {
        IdentyfikatorPodmiotu = new identyfikatorPodmiotu();
        AdresPodmiotu = new adresPodmiotu();
    }
}