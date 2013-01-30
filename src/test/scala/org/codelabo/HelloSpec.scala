package org.codelabo

import org.specs2.mutable._
import org.specs2.runner.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class HelloSpec extends Specification {
  "Hello.hello" should {
    "return string 'hello'" in {
      new Hello().hello mustEqual "hello"
    }
  }
}
