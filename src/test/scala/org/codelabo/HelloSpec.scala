package org.codelabo

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSpec
import org.scalatest.Matchers

@RunWith(classOf[JUnitRunner])
class HelloSpec extends FunSpec with Matchers {
  describe("Hello.hello") {
    it("shuld return string \"hello\"") {
      new Hello().hello should equal("hello")
    }
  }
}
