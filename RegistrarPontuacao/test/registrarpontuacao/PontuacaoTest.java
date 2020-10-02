/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrarpontuacao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ederson
 */
public class PontuacaoTest {
    
    private Pontuacao n;
    
    public PontuacaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = new Pontuacao();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of valoresDasListas method, of class Pontuacao.
     */
    @Test
    public void testValoresDasListas() {
        
    }

    /**
     * Test of tabelaResultados method, of class Pontuacao.
     */
    @Test
    public void testTabelaResultados() {
        Object[] test = new Object[4];
        Assert.assertArrayEquals(test, n.linha);
        
        Assert.assertNotNull(n.linha);
    }

    /**
     * Test of main method, of class Pontuacao.
     */
    @Test
    public void testMain() {

    }
    
}
