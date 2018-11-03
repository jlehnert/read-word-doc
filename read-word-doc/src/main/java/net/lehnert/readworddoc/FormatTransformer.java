package net.lehnert.readworddoc;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public interface FormatTransformer {
	public void newParagraph(XWPFParagraph paragraph);
	public void newRun(XWPFRun run);
}