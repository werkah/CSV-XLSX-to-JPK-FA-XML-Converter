package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.JAXBException;
import java.io.File;

public class XMLWriter {
    public static void write(JPK jpk, String filename) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(JPK.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(jpk, new File(filename));
    }
}
