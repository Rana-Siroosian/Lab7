import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HtmlTest {
	
	@Test
	public void testIfEmpty() {
		String html1 = "<></>";
		Assertions.assertTrue(Lab7Regex.validateHtml(html1));

	}
	@Test
	public void testIfNoSpecialCharacters() {
		String html1 = "<1hP*docType%></1hP*docType%>";
		Assertions.assertFalse(Lab7Regex.validateHtml(html1));

	}
	
	@Test 
	public void testStartFormat() {
		String html1 = "<p1>hello</p1>";
		Assertions.assertTrue(Lab7Regex.validateHtml(html1));

	}
	
	@Test
	public void testFirstIsANumber() {
		String html1 = "<1p>Good</p2>";
		Assertions.assertFalse(Lab7Regex.validateHtml(html1));

	}
	

}
