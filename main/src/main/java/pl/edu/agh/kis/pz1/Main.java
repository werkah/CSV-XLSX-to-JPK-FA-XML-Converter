package pl.edu.agh.kis.pz1;
//przyjmowanie plikow csv i xlsx, sprawdzanie ich poprawnosci, parsowanie do xml


import pl.edu.agh.kis.pz1.util.CSVReader;
import pl.edu.agh.kis.pz1.util.XLSXReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int filetype;
        if (args.length != 2) {
            throw new Exception("zla liczb arg");//podzial przez kropke
        } else if (args[0].split("\\.")[1].equals("csv")) {
            filetype = 0;
        } else if (args[0].split("\\.")[1].equals("xlsx")) {
            filetype = 1;
        } else {
            throw new Exception("zly format pliku");
        }
        if (filetype == 0) {
            CSVReader csvReader = new CSVReader(args[0], args[1]);
            csvReader.parse();
        } else if (filetype == 1) {
            XLSXReader xlsxReader = new XLSXReader(args[0], args[1]);
            xlsxReader.parse();
        }
    }
}
