package pl.edu.agh.kis.pz1.util;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

public class XMLWriter {
    public static void write(String type, String output, String input) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(JPK.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(new JPK(type, input), new File(output));
    }
}
