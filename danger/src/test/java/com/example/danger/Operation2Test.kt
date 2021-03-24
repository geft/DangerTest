package com.example.danger

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class Operation2Test {

    private lateinit var operation: Operation2

    @Before
    fun setUp() {
        operation = Operation2()
    }

    @Test
    fun `addition is correct`() {
        Assert.assertEquals(4, operation.add(2, 2))
    }

    @Test
    fun `subtraction is correct`() {
        Assert.assertEquals(4, operation.subtract(6, 2))
    }
}
