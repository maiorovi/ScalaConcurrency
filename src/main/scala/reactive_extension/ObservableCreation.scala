package reactive_extension

import rx.lang.scala._

object ObservableCreation extends App {
  val vms = Observable.create[String]( obs => {
    obs.onNext("Hotspot")
    obs.onNext("DartVM")
    obs.onNext("V8")
    Subscription()
  })

  vms.subscribe(println _, e => println(s"oops - $e"), () => println("Done!"))
}
