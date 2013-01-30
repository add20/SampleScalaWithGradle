package org.codelabo

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class HelloSpec extends FunSpec with ShouldMatchers {
  describe("Hello.hello") {
    it("shuld return string \"hello\"") {
      new Hello().hello should equal("hello")
    }
  }
}
