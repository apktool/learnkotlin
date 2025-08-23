import com.acronymor.IntPredicate
import com.acronymor.InterfaceImpl
import com.acronymor.MyInterfaceChild
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class InterfaceDemoTest {
    @Test
    fun testMyInterfaceChild() {
        val clazz = MyInterfaceChild()
        println(clazz.prop)

        clazz.go()
    }

    @Test
    fun TestInterfaceImpl() {
        val clazz = InterfaceImpl()
        println(clazz.foo())
        println(clazz.bar())
    }

    @Test
    fun TestIntPredicate() {
        val isEven = IntPredicate { it % 2 == 0 }
        assertFalse(isEven.accept(7))
        assertTrue(isEven.accept(6))
    }
}