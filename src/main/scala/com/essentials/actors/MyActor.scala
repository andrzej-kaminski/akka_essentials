package com.essentials.actors

import akka.actor.Actor

class MyActor extends Actor {
  protected def receive = null

  override def preStart() {
    super.preStart()
    println("Pre Start of " + getClass.getSimpleName)
  }
}
