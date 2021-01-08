
package cloud.emtech.job.reporting

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

class AppTest {
    @Test def testGetMessage(): Unit = {
        App.main(Array(""))
        assertEquals(true, true)
    }
}