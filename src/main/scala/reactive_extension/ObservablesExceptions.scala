package reactive_extension

import rx.lang.scala._

object ObservablesExceptions extends App {
  val ex = new RuntimeException
  val o = Observable.just(1,2) ++ Observable.error(ex)
  o.subscribe( numb => println(numb), ex => println(s"error occured $ex"))

  val o1 = Observable.just(1,2) ++ Observable.error(ex) ++ Observable.just(3,4)
  o1.subscribe( numb => println(numb), ex => println(s"error occured $ex"))
}
