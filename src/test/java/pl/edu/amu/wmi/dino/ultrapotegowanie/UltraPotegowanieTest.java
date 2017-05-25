/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.ultrapotegowanie;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bikol
 */
public class UltraPotegowanieTest {
    
    public UltraPotegowanieTest() {
    }

    // Patryk Zywica
    @Test
    public void testPoteguj() {
        assertEquals("1", UltraPotegowanie.poteguj("1", "1"));
    }
    @Test
    public void testPoteguj2() {
        assertEquals("2", UltraPotegowanie.poteguj("2", "1"));
    }
    @Test
    public void testPoteguj3() {
        Random r = new Random();
        for(int i=0;i<1000;i++){
            int liczba = r.nextInt();
            assertEquals("1", UltraPotegowanie.poteguj(Integer.toString(liczba), "0"));
            
        }
    }
    //Nikodem Pachala
	@Test
	public void testPoteguj4() {
		assertEquals("1.0", UltraPotegowanie.poteguj("1.0", "1.0"));
	}
	@Test
    public void testPoteguj5() {
        assertEquals("10000000000", UltraPotegowanie.poteguj("10", "10"));
    }
	@Test
    public void testPoteguj6() {
        assertEquals("-1", UltraPotegowanie.poteguj("-1", "3"));
    }
}
