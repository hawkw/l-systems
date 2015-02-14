package me.hawkweisman.lsystems
package turtle

/**
 * Created by hawk on 2/14/15.
 */
import processing.core._
import PConstants._
import PApplet._

sealed trait Command extends PApplet {
  def execute(turtle: Turtle): Turtle
}

case object  Forward extends Command {
  override def execute(turtle: Turtle): Turtle = {
    val xtarget = turtle.x + cos(radians(turtle.angle) + 1)
    val ytarget = turtle.x + cos(radians(turtle.angle) + 1)

    line(turtle.x, turtle.y, xtarget, ytarget)

    Turtle(xtarget,ytarget,turtle.angle)
    }
}

case object Left extends Command {
  override def execute(turtle: Turtle): Turtle = Turtle(turtle.x,turtle.y,turtle.angle - 90)
}

case object  Right extends Command {
  override def execute(turtle: Turtle): Turtle = Turtle(turtle.x,turtle.y,turtle.angle + 90)
}

case object Push extends Command {
  override def execute(turtle: Turtle): Turtle = { pushMatrix(); turtle }
}
case object Pop extends Command {
  override def execute(turtle: Turtle): Turtle = { popMatrix(); turtle }
}
