package org.plume.envol2012.usine.exo1;

import org.junit.Test;

import junit.framework.TestCase;

public class PersonneTest extends TestCase {

	@Test
	public void testConstructeurPersonne() {
		final String NOM = "ROUSSE";
		final String PRENOM = "David";
		final int AGE = 23;
		Personne personne = new Personne(NOM, PRENOM, AGE);
		assertEquals(NOM, personne.getNom());
		assertEquals(PRENOM, personne.getPrenom());
	}
	
	@Test
	public void testConstructeurPersonneAge() {
		final String NOM = "ROUSSE";
		final String PRENOM = "David";
		final int AGE = 23;
		Personne personne = new Personne(NOM, PRENOM, AGE);
		assertEquals(NOM, personne.getNom());
		assertEquals(PRENOM, personne.getPrenom());
		assertEquals(AGE,23);
		
	}
}
