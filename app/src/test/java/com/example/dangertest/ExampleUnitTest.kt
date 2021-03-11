package com.example.dangertest

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var operation: Operation

    @Before
    fun setUp() {
        operation = Operation()
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, operation.add(2, 2))
    }
}
