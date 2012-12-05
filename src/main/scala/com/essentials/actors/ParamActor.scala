package com.essentials.actors

import akka.actor.{Props, Actor}

class ParamActor(age: Int) extends Actor {
  val myWorker = context.actorOf(Props[MyActor], "Inside Param Actor")
  protected def receive = null
}
