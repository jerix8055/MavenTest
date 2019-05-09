package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilTest {
	
	@Test
	public void testIstErstesHalbjahr() {
		assertEquals("Januar (1) soll im ersten Halbjahr liegen", true, Util.istErstesHalbjahr(1));
		assertEquals("Juni (6) soll im ersten Halbjahr liegen", true, Util.istErstesHalbjahr(6));
	}
	
	@Test
	public void testIstNichtErstesHalbjahr() {
		assertEquals("Juli (7) soll nicht im ersten Halbjahr liegen", false, Util.istErstesHalbjahr(7));
		assertEquals("Dezember (12) soll nicht im ersten Halbjahr liegen", false, Util.istErstesHalbjahr(12));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIstErstesHalbjahrUnerlaubteWerte() {
		Util.istErstesHalbjahr(0);
		Util.istErstesHalbjahr(13);
	}

}
