package net.lehnert.readworddoc;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ReadWordDoc {
	public static void transformWordDocX(File file, FormatTransformer formatTransformer) throws IOException {
		FileInputStream fis = new FileInputStream(file);
        XWPFDocument document = new XWPFDocument(fis);
        for(XWPFParagraph paragraph : document.getParagraphs()) {
        	formatTransformer.newParagraph(paragraph);
        	for(XWPFRun run : paragraph.getRuns()) {
        		formatTransformer.newRun(run);
        	}
        }
	}
}
