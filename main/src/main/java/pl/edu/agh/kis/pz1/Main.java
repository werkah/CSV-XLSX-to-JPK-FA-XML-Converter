package pl.edu.agh.kis.pz1;
//przyjmowanie plikow csv i xlsx, sprawdzanie ich poprawnosci, parsowanie do xml


import pl.edu.agh.kis.pz1.util.CSVReader;
import pl.edu.agh.kis.pz1.util.XLSXReader;
import pl.edu.agh.kis.pz1.util.XMLWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        String type;
        if (args.length != 2) {
            throw new Exception("zla liczb arg");
        } else if (args[0].split("\\.")[1].equals("csv")) {
            type = "csv";
            XMLWriter xmlWriter = new XMLWriter();
            xmlWriter.write(type, args[1], args[0]);
        } else if (args[0].split("\\.")[1].equals("xlsx")) {
            type = "xlsx";
            XMLWriter xmlWriter = new XMLWriter();
            xmlWriter.write(type, args[1], args[0]);
        } else {
            throw new Exception("zly format pliku");
        }
    }
}
