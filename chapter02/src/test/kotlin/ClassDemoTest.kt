import com.acronymor.Base
import com.acronymor.Contact
import com.acronymor.Circle
import com.acronymor.Derived
import com.acronymor.Direction
import com.acronymor.Error
import com.acronymor.Polygon
import com.acronymor.Rectangle
import com.acronymor.Result
import com.acronymor.Shape
import com.acronymor.SimpleClass
import com.acronymor.Student
import com.acronymor.Success
import org.junit.jupiter.api.Test

class ClassDemoTest {
    @Test
    fun testSimpleClass() {
        println("-->")
        val clazz: SimpleClass = SimpleClass(p = "apktool", i = 99)
        println("<--")
    }

    @Test
    fun dataSimpleClass() {
        val clazz: Contact = Contact(id = 1, name = "apktool")
        println(clazz)
    }

    @Test
    fun sgSimpleClass() {
        val clazz: Student = Student()
        println(clazz.info)
        clazz.info = "Hello world"
    }

    @Test
    fun testInheritance() {
        val clazz1: Shape = Circle()
        clazz1.draw()
        clazz1.fill()

        val clazz2: Base = Derived(99)
        println(clazz2.age)

        val clazz3: Polygon = Rectangle()
        println(clazz3.draw())
    }

    @Test
    fun testSealedClass() {
        fun process(result: Result) {
            when (result) {
                is Success -> println("Result, ${result.data}")
                is Error -> println("Reason, ${result.message}")
            }
        }

        val res1: Result = Success("process success")
        val res2: Result = Error("process failed")
        process(res1)
        process(res2)
    }

    @Test
    fun testEnumClass() {
        for (dir in Direction.entries) {
            println("name=${dir.name}, ordinal=${dir.ordinal}")
        }

        println(Direction.valueOf("WEST"))
    }
}