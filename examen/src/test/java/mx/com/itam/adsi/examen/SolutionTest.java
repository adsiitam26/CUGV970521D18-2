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
		assertTrue("Con abab: ", s.problema("gustavogustavogustavo"));
	}
	

}
