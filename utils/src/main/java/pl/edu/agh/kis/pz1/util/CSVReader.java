package pl.edu.agh.kis.pz1.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class CSVReader {

        List<faktura> faktury = new ArrayList<>();
        List<fakturawiersz> wiersze = new ArrayList<>();

        static BigDecimal moneyToBigDecimal(String s) {
                return new BigDecimal(s.replace("zł", "").replace(",", ".").replace(" ", "").replace("\u00A0",""));
        }

        public void ReaderCSV(String input) throws IOException {
                Reader in = new FileReader(input);
                Iterable<CSVRecord> records = CSVFormat.TDF.parse(in);
                records.iterator().next();
                for (CSVRecord csvRecord : records){
                        String p3A = csvRecord.get(0);
                        String p3B = csvRecord.get(1);
                        String p5B = csvRecord.get(2);
                        String p1 = csvRecord.get(3);
                        String p6 = csvRecord.get(3);
                        String p2A = csvRecord.get(5);
                        BigDecimal p13_1 = moneyToBigDecimal(csvRecord.get(7));
                        BigDecimal p14_1 = moneyToBigDecimal(csvRecord.get(10));
                        BigDecimal p15 = moneyToBigDecimal(csvRecord.get(14));
                        String p2B = csvRecord.get(5);
                        String p12 = csvRecord.get(9);
                        BigDecimal p8B = moneyToBigDecimal(csvRecord.get(7));
                        BigDecimal p9A = moneyToBigDecimal(csvRecord.get(8));
                        BigDecimal p11 = moneyToBigDecimal(csvRecord.get(11));
                        BigDecimal p9B = moneyToBigDecimal(csvRecord.get(12));
                        faktury.add(new faktura(p3A, p3B, p5B, p1, p6, p2A, p13_1, p14_1, p15));
                        wiersze.add(new fakturawiersz(p2B, p12, p8B, p9A, p9B, p11));
                }

        }
        public List<faktura> getfaktury() {
                return faktury;
        }

        public Collection<? extends fakturawiersz> getwiersze() {
                return wiersze;
        }
}