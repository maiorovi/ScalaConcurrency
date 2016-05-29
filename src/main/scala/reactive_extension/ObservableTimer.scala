package reactive_extension

import java.util.concurrent.TimeUnit

import rx.lang.scala._
import scala.concurrent.duration.FiniteDuration
import scala.concurrent.duration._


object ObservableTimer extends App {
  val o = Observable.timer(1 second )
  o.subscribe(_ => println("timeout!"))
  o.subscribe(_ => println("timeout Again!"))
  Thread.sleep(4000)
}
