package reactive_extension

import rx.lang.scala._
import scala.concurrent.{ExecutionContext, Future}
import ExecutionContext.Implicits.global

object FutureConversion extends App {
  val future:Future[Int] = Future {
    println("Go back to future!!!")
    5
  }

  val o = Observable.create[Int]( obs => {
    future.foreach( value => {obs.onNext(value); obs.onCompleted()})
    future.failed.foreach( ex => obs.onError(ex))
    Subscription()
  })

  o.subscribe( println(_))






}
