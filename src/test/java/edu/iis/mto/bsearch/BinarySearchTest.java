package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BinarySearchTest {

    @BeforeEach
    void setUp() throws Exception {}

    @Test
    void test1()
    {
        int[] testArray={1};
        SearchResult a = BinarySearch.search(1, testArray);
        assertEquals(true, a.isFound());
        assertEquals(1, a.getPosition());
    }
}
