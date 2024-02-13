import org.junit.Test;
import static org.junit.Assert.assertEquals;

public classs Romantesting(){
	RomanNumeral romanNumeral = new RomanNumeral();
	
	
	@Test
	public void Convert(){
		int result = romanNumeral.romanToInt("XXIV");
		assertEquals(24,result);
	}	

	@Test
	public void Convert2(){
		int result = romanNumeral.romanToInt("V");
		assertEquals(5,result);
	}	

	@Test
	public void Convert3(){
		int result = romanNumeral.romanToInt("MMMDCCXXIV");
		assertEquals(3724,result);
	}
}