package mr.kostua.youstillhavetimeto

import org.junit.After
import org.junit.Before
import org.mockito.MockitoAnnotations


abstract class BaseTest {
    private var closeable: AutoCloseable? = null

    @Before
    open fun setup() {
        closeable = MockitoAnnotations.openMocks(this)
    }

    @After
    @Throws(Exception::class)
    open fun releaseMocks() {
        closeable?.close()
    }

    @After
    open fun tearDown() = Unit
}