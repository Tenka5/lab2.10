import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import ru.samsung.itacademy.mdev.simplecalctemplate.Calculator

class CalculatorTest {
    private var calculator: Calculator? = null
    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun addition() {
        Assert.assertEquals(3, calculator!!.add(1, 2).toLong())
        Assert.assertEquals(-1, calculator!!.subtract(1, 2).toLong())
        Assert.assertEquals(2, calculator!!.multiply(1, 2).toLong())
        Assert.assertEquals(2, calculator!!.divide(4, 2).toLong())
        Assert.assertEquals(0, calculator!!.divide(4, 0).toLong())
    }


    @After
    fun tearDown() {
        calculator = null
    }
}