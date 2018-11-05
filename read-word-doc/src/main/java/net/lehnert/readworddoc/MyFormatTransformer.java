package net.lehnert.readworddoc;

import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class MyFormatTransformer implements FormatTransformer {
	public void newParagraph(XWPFParagraph paragraph) {
		System.out.println("{"+paragraph.getAlignment().name()+"}");
	}
	
	public void newRun(XWPFRun run) {
		boolean isBold = run.isBold();
		boolean isItalic = run.isItalic();
		boolean isUnderline = (run.getUnderline().getValue() != UnderlinePatterns.NONE.getValue());
		System.out.print("[("+run.getFontSize()+")");
		if (isBold) {
			System.out.print("BOLD ");
		}
		if (isItalic) {
			System.out.print("ITALIC ");
		}
		if (isUnderline) {
			System.out.print("UNDERLINE ");
		}
		System.out.print("] ");
		System.out.println(run.getText(0));
	}						
}