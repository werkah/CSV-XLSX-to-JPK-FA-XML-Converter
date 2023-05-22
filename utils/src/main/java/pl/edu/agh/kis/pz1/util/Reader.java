package pl.edu.agh.kis.pz1.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * class containing methods for reading files into the jpk class from:
 * <ul>
 *     <li>.xlsx</li>
 *     <li>.csv</li>
 * </ul>
 *
 */
public class Reader {
    static BigDecimal stringToDecimal(String s) {
        String str = s
                .replace(",", ".")
                .replace(" ", "")
                .replaceAll("[^\\x00-\\x7F]","")
                .replaceAll("[^\\d.]", "");
//        System.out.println("Converting: " + s + ", to: " + str);
        Double d = Double.parseDouble(str);
        return new BigDecimal(d);
    }
    public static JPK ReaderXLSX(String input) throws IOException {
        JPK f1 = new JPK();
        FileInputStream file = new FileInputStream(input);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            if (row.getRowNum() != 0) {
                String p3A = row.getCell(0).toString();
                String p3B = row.getCell(1).toString();
                String p5B = row.getCell(2).toString();
                String p1 = row.getCell(3).toString();
                String p6 = row.getCell(4).toString();
                String p2A = row.getCell(5).toString();
                BigDecimal p13_1 = stringToDecimal(row.getCell(6).toString());
                BigDecimal p14_1 = stringToDecimal(row.getCell(10).toString());
                BigDecimal p15 = stringToDecimal(row.getCell(14).toString());
                String p2B = row.getCell(5).toString();
                String p12 = row.getCell(9).toString();
                BigDecimal p8B = stringToDecimal(row.getCell(7).toString());
                BigDecimal p9A = stringToDecimal(row.getCell(8).toString());
                BigDecimal p11 = stringToDecimal(row.getCell(11).toString());
                BigDecimal p9B = stringToDecimal(row.getCell(12).toString());
                f1.addFW(new FakturaWiersz(p2B, p12, p8B, p9A, p9B, p11));
                f1.addF(new Faktura(p3A, p3B, p5B, p1, p6, p2A, p13_1, p14_1, p15));
                }
            }
        return f1;
    }
    public static JPK ReaderCSV(String input) throws IOException {
        JPK f2 = new JPK();
        java.io.Reader in = new FileReader(input);
        Iterable<CSVRecord> records = CSVFormat.TDF.parse(in);
        records.iterator().next();
        for (CSVRecord csvRecord : records){
            String p3A = csvRecord.get(0);
            String p3B = csvRecord.get(1);
            String p5B = csvRecord.get(2);
            String p1 = csvRecord.get(3);
            String p6 = csvRecord.get(3);
            String p2A = csvRecord.get(5);
            BigDecimal p13_1 = stringToDecimal(csvRecord.get(7));
            BigDecimal p14_1 = stringToDecimal(csvRecord.get(10));
            BigDecimal p15 = stringToDecimal(csvRecord.get(14));
            String p2B = csvRecord.get(5);
            String p12 = csvRecord.get(9);
            BigDecimal p8B = stringToDecimal(csvRecord.get(7));
            BigDecimal p9A = stringToDecimal(csvRecord.get(8));
            BigDecimal p11 = stringToDecimal(csvRecord.get(11));
            BigDecimal p9B = stringToDecimal(csvRecord.get(12));
            f2.addF(new Faktura(p3A, p3B, p5B, p1, p6, p2A, p13_1, p14_1, p15));
            f2.addFW(new FakturaWiersz(p2B, p12, p8B, p9A, p9B, p11));
        }
        return f2;
    }
}
