package test.net.lehnert.readworddoc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.Test;

public class TestReadWordDoc2Pdf {

	@Test
	public void test() {
		try {
			InputStream in= new FileInputStream(new File("src/test/resources/test.docx"));
			XWPFDocument document = new XWPFDocument(in);
			PdfOptions options = PdfOptions.create();
			OutputStream out = new FileOutputStream(new File("src/test/resources/test.pdf"));
			PdfConverter.getInstance().convert(document, out, options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
