package mx.com.itam.adsi.examen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Solution s = new Solution();
		assertTrue("Con abab: ", s.problema("abab"));
		assertTrue("Con abab: ", !s.problema("aba"));
		assertTrue("Con abab: ", s.problema("problematavoproblematavoproblematavo"));
		assertTrue("Prueba para abab", s.problema("abab"));
		assertTrue("Prueba para ababa", !s.problema("ababa"));
		assertTrue("Prueba para victorvictor", s.problema("victorvictor"));
		assertTrue("Prueba para victorvicto", !s.problema("victorvicto"));
		assertTrue("Prueba para dandan", s.problema("dandan"));
		assertTrue("Prueba para danda", !s.problema("danda"));
		assertTrue("Prueba para abaab", !s.problema("abaab"));
		assertTrue("Prueba para abad", !s.problema("abad"));
		assertTrue("Prueba para ababc", !s.problema("ababc"));
		assertTrue("Prueba para cabcaabc", !s.problema("cabcaabc"));
		assertTrue("Prueba para baccab", !s.problema("baccab"));
		assertTrue("Prueba para bacbac", s.problema("bacbac"));
		assertTrue("Prueba para bacacb", !s.problema("bacacb"));
		assertTrue("Prueba para 123321", !s.problema("123321"));
		assertTrue("Prueba para 123123", s.problema("123123"));
		assertTrue("Prueba para 1214", !s.problema("1214"));
		assertTrue("Prueba para holaola", !s.problema("olaHola"));
		assertTrue("Prueba para holahola", s.problema("holahola"));
		assertTrue("Prueba para holaholas", !s.problema("holaholas"));
	}
	

}
