package test.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C07_Write_Exel {


    @Test
    public void test01() throws IOException {
    // ulkeler exeline 5. satir olarak nufus sutununa ekleyelim 3 nufus ekleyelim
    String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook=WorkbookFactory.create(fis);

        // ilk satirin besinci hucresine nufs yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("100000");
        // kopyaya aldigimiz degerleri ana dosyaya kaydadelm
        FileOutputStream fos=new FileOutputStream(path);
   workbook.write(fos);
    }



}
