package org.rbsg.java.service;

import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class PrimeNumberServiceTest {

    private final PrimeNumberService primeNumberService = new PrimeNumberService();

    @Test
    public void testGetPrimeNumbersUpTo10() throws Exception {

        // when
        final List<Integer> primeNumbers = primeNumberService.getPrimeNumbers(10);

        // Then
        
        
        
        assertThat(primeNumbers).contains(2,3,5,7);
        //System.out.println(" primeNumbers == "+ primeNumbers );
    }

    @Test
    public void gettingPrimeNumbersForIntLessThanTwoShouldReturnEmptyList() {
        // when
        final List<Integer> primeNumbers = primeNumberService.getPrimeNumbers(1);

        // Then
        assertThat(primeNumbers).isEmpty();
    }

    @Test
    public void gettingPrimeNumbersForIntTwoShouldIncludeTwo() {
        // when
        final List<Integer> primeNumbers = primeNumberService.getPrimeNumbers(2);

        // Then
        assertThat(primeNumbers).hasSize(1).containsOnly  (new Integer(2));
    }

    @Test
    public void gettingPrimeNumbersShouldIncludeUpperLimit() {
        // when
        final List<Integer> primeNumbers = primeNumberService.getPrimeNumbers(11);

        // Then
        assertThat(primeNumbers).contains(2,3,5,7,11);
         
    }

    @Test
    public void shouldBeAbleToGetPrimeNumbersForALargerUpperLimit() {
        // when
        final List<Integer> primeNumbers = primeNumberService.getPrimeNumbers(10000000);

        // Then
        assertThat(primeNumbers).hasSize(664579);
    }
}