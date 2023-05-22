package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="tns:Naglowek")
public class Naglowek {
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
    public Naglowek() {
        KodFormularza= "JPK_FA";
        WariantFormularza= "3";
        CelZlozenia= "1";
        DataWytworzenia= "2021-10-28T16:30:54.533";
        DataOd= "2020-10-01";
        DataDo= "2020-12-31";
        KodUrzedu= "1208";
    }
}