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

    @Test
    void test2()
    {
        int[] testArray={1};
        SearchResult a = BinarySearch.search(1, testArray);
        assertEquals(false, a.isFound());
        assertEquals(-1, a.getPosition());
    }

    @Test
    void test3()
    {
        int[] testArray={1,3,4,7,8,10};
        SearchResult a = BinarySearch.search(1, testArray);
        assertEquals(true, a.isFound());
        assertEquals(1, a.getPosition());
    }

    @Test
    void test4()
    {
        int[] testArray={1,3,4,7,8,10};
        SearchResult a = BinarySearch.search(10, testArray);
        assertEquals(true, a.isFound());
        assertEquals(a.getPosition(), testArray.length);
    }

    @Test
    void test5()
    {
        int[] testArray={1,3,4,7,8,10,21};
        SearchResult a = BinarySearch.search(7, testArray);
        assertEquals(true, a.isFound());
        assertEquals(4, a.getPosition());
    }
}
