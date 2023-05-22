package pl.edu.agh.kis.pz1;


import pl.edu.agh.kis.pz1.util.Reader;
import pl.edu.agh.kis.pz1.util.XMLWriter;

/**
 * Main class of the program
 */
public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new Exception("Zla liczba argumentow");
        } else if (args[0].split("\\.")[1].equals("csv")) {
            XMLWriter.write(Reader.ReaderCSV(args[0]), args[1]);
        } else if (args[0].split("\\.")[1].equals("xlsx")) {
            XMLWriter.write(Reader.ReaderXLSX(args[0]), args[1]);
        } else {
            throw new Exception("Zly format pliku");
        }
    }
}
