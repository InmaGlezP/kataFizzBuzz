package net.iessanclemente.dapw.katas.fizzbuzz.tests;

import static org.junit.Assert.*;
import net.iessanclemente.dapw.katas.fizzbuzz.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

	private FizzBuzz fb;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	/**
	 * Comprueba si devuelve "fizz" cuando el numero es divible por 3
	 * Pasamos el 3, ya que sabemos que cumple la condición
	 */
	@Test
	public void fizzWhenDivisibleBy3() {
		String three = fb.convert(3);
		assertEquals("Fizz", three);
	}
	
	/**
	 * Comprueba si devuelve "buzz" cuando el numero es divible por 5
	 * Pasamos el 5, ya que sabemos que cumple la condición
	 */
	@Test
	public void buzzWhenDivisibleBy5() {
		String five = fb.convert(5);
		assertEquals("Buzz",five);
	}
	
	/**
	 * Comprueba si devuelve "fizzbuzz" cuando el numero es divible por 3 y por 5
	 * Pasamos el 15, ya que sabemos que cumple la condición
	 */
	@Test
	public void fizzbuzzWhenDivisibleBy3and5() {
		String fifteen = fb.convert(15);
		assertEquals("FizzBuzz",fifteen);
	}
	
	/**
	 * Comprueba si devuelve "fizz" cuando el numero es divible por 3 
	 * o el 3 está en el numero
	 * Pasamos el 13, ya que sabemos que cumple la condición
	 */
	@Test
	public void fizzWhenDivisibleBy3or3isInTheNumber() {
		String three = fb.convert(13);
		assertEquals("Fizz",three);
	}
}
