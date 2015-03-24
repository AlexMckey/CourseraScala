package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import Main.countChange
  test("manual") {
    assert(countChange(4,List(1,2)) === 3)
  }

  test("sorted CHF") {
    assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
  }

  test("no pennies") {
    assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  test("unsorted CHF") {
    assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
  }
  
  test("US coins") {
    assert(countChange(100,List(1,5,10,25,50)) === 292)
  }
  
  test("0 CHF") {
    assert(countChange(0,List(5,10,20,50,100,200,500)) === 1)
  }
  
  test("100, no coins") {
    assert(countChange(100,Nil) === 0)
  }
}