package $organization$

import org.specs2._
import org.junit.runner._
import runner._


@RunWith(classOf[JUnitRunner])
object $classname;format="Camel"$Spec extends Specification {
  def is =
    "$classname;format="Camel"$ Specification".title ^
      "func 1" ^ func1 ^
      end

  def func1 =
    "Function 1" ! fixme ^
      p

}