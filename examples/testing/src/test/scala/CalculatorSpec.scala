package com.fewerhassles.indyscala

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
object CalculatorSpec extends Specification {

  "Adding" should {
    "add" in {
      "one plus one" in {
        Calculator.add(1, 1) mustEqual 2
      }
      "two plus two" in {
        Calculator.add(2, 2) mustEqual 4
      }
      "42 plus 42" in {
        Calculator.add(42, 42) mustEqual 84
      }
    }
  }
}
