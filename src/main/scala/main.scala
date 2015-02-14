package lsystems

import me.hawkweisman.lsystems.LSystemIteration
import me.hawkweisman.lsystems.samples.{SierpinskiLSystem, PythagorasTree}
import me.hawkweisman.lsystems.turtle.{Push,TurnLeft,TurnRight,Pop,Forward, Turtle, Command}
import processing.core._
import PConstants._
import PApplet._

class Main extends PApplet {
  var lastIter = SierpinskiLSystem.first.next
  var steps = 0
  var dist = 25f

  def drawIter(it: LSystemIteration) = {
    translate(width/2,height/2)
    steps += 5
    println(it.string.take(steps))
    for (ch <- it.string.take(steps)) {
      it.sys.commands(ch) match {
        case Forward =>
          line(0,0,dist,dist)
          translate(dist,dist)
        case TurnLeft => rotate(radians(it.sys.angle))
        case TurnRight => rotate(radians(-it.sys.angle))
        case Push => pushMatrix()
        case Pop => popMatrix()
      }
    }
  }

  override def setup {
    size(800, 800)
    frameRate(999)
    stroke(255)
    background(0)
  }

  override def draw: Unit = {
    drawIter(lastIter)
  }
  override def mousePressed: Unit = {
    background(0)
    lastIter = lastIter.next
    dist = dist/1.5f
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("lsystems.Main"))
  }
}