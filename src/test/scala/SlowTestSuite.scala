import org.scalatest.FunSuite
import tags.SlowTest

@SlowTest
class SlowTestSuite extends FunSuite {

  test("slow test") {
    Thread.sleep(5000)
  }

}
