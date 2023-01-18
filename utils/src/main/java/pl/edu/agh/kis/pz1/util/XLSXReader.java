package pl.edu.agh.kis.pz1.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;


public class XLSXReader{

    List<faktura> faktury = new ArrayList<>();
    List<fakturawiersz> wiersze = new ArrayList<>();
    static BigDecimal moneyToBigDecimal(String s) {
        return new BigDecimal(s.replace("zł", "").replace(",", ".").replace(" ", "").replace("\u00A0",""));
    }
    public void ReaderXLSX(String input) throws IOException {
        FileInputStream file = new FileInputStream(input);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int count=0;
        for (Row row : sheet) {
            ArrayList<String> data = new ArrayList<>();
            if (row.getRowNum() != 0) {
                String p3A = row.getCell(0).toString();
                String p3B = row.getCell(1).toString();
                String p5B = row.getCell(2).toString();
                String p1 = row.getCell(3).toString();
                String p6 = row.getCell(4).toString();
                String p2A = row.getCell(5).toString();
                data.add(p2A);
                BigDecimal p13_1 = moneyToBigDecimal(row.getCell(7).toString());
                BigDecimal p14_1 = moneyToBigDecimal(row.getCell(10).toString());
                BigDecimal p15 = moneyToBigDecimal(row.getCell(14).toString());
                String p2B = row.getCell(5).toString();
                String p12 = row.getCell(9).toString();
                BigDecimal p8B = moneyToBigDecimal(row.getCell(7).toString());
                BigDecimal p9A = moneyToBigDecimal(row.getCell(8).toString());
                BigDecimal p11 = moneyToBigDecimal(row.getCell(11).toString());
                BigDecimal p9B = moneyToBigDecimal(row.getCell(12).toString());
                wiersze.add(new fakturawiersz(p2B, p12, p8B, p9A, p9B, p11));
                if(count==0){
                    faktury.add(new faktura(p3A, p3B, p5B, p1, p6, p2A, p13_1, p14_1, p15));

                }
                for(String p: data){
                    if(!p.equals(p2A)){
                        faktury.add(new faktura(p3A, p3B, p5B, p1, p6, p2A, p13_1, p14_1, p15));
                    }
                }
                count++;
            }
        }
    }
    public List<faktura> getfaktury() {
        return faktury;
    }
    public Collection<? extends fakturawiersz> getwiersze() {
        return wiersze;
    }

}

