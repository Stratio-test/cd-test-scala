package com.stratio.cdtestscala

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldIT extends FlatSpec with Matchers{

    "This integration test" should "pass successfully" in {
      val test = "Nothing here"
      println(test)
    }
}
