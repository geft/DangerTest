package com.example.dangertest

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

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
    fun `addition is correct`() {
        assertEquals(4, operation.add(2, 2))
    }

    @Test
    fun `subtraction is correct`() {
        assertEquals(4, operation.subtract(6, 2))
    }
}
