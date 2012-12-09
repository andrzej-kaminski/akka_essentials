package com.essentials.futures

import akka.actor.ActorSystem
import akka.dispatch.Future

object FutureWithActorSystem extends App {
  val as = ActorSystem("mySystem")

  val f = Future {
    2 + 3
  }(as.dispatcher)

  f.onComplete { r =>
    r match {
      case Right(res) =>
        println(res)
      case Left(ex) =>
        println(ex)
    }
    as.shutdown()
  }
}
