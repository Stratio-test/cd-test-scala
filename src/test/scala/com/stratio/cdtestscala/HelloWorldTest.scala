package com.stratio.cdtestscala

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldTest extends FlatSpec with Matchers {

  "This test" should "pass successfully" in {
    val test = "Nothing here"
    println(test)
  }

}

