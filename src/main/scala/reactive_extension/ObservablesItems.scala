package reactive_extension

import rx.lang.scala._

object ObservablesItems extends App {
  val o = Observable.just("Java", "Scala", "Pascal")
  o.subscribe(name => println(s"Learned $name"))
  o.subscribe(name => println(s"Forgot $name"))
}
