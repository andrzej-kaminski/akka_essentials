package com.essentials.actors

import akka.actor.{Props, ActorSystem}

object Tester extends App {
  val system = ActorSystem("MyActorSystem")
  val myActor = system.actorOf(Props[MyActor], name = "myActor")

  val pActor = system.actorOf(Props(new ParamActor(30)), name = "pActor")
}
