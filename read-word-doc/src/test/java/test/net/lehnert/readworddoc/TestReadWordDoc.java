package test.net.lehnert.readworddoc;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

import net.lehnert.readworddoc.MyFormatTransformer;
import net.lehnert.readworddoc.ReadWordDoc;

public class TestReadWordDoc {

	@Test
	public void test() {
		try {
			ReadWordDoc.transformWordDocX(new File("src/test/resources/test.docx"), new MyFormatTransformer());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
