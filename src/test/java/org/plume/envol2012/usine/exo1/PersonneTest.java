package org.plume.envol2012.usine.exo1;

import org.junit.Test;

import junit.framework.TestCase;

public class PersonneTest extends TestCase {

	@Test
	public void testConstructeurPersonne() {
		final String NOM = "ROUSSE";
		final String PRENOM = "David";
		Personne personne = new Personne(NOM, PRENOM);
		assertEquals(NOM, personne.getNom());
		assertEquals(PRENOM, personne.getPrenom());
	}
}
