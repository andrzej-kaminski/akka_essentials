package com.essentials.futures

import akka.dispatch.{ExecutionContext, Future}

object FutureTester extends App {
  val executorService = java.util.concurrent.Executors.newFixedThreadPool(5)
  implicit val context = ExecutionContext.fromExecutor(executorService)
  val f = Future { 2 + 3 }
  f.onComplete { r =>
    r match {
      case Right(res) =>
        println(res)
      case Left(ex) =>
        println(ex)
    }
    executorService.shutdown()
  }
}
