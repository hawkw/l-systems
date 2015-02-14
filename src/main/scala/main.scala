package lsystems

import me.hawkweisman.lsystems.LSystemIteration
import me.hawkweisman.lsystems.samples.{SierpinskiLSystem, PythagorasTree}
import me.hawkweisman.lsystems.turtle.{Push,TurnLeft,TurnRight,Pop,Forward, Turtle, Command}
import processing.core._
import PConstants._
import PApplet._

class Main extends PApplet {
  var lastIter = SierpinskiLSystem.first
  var steps = 0

  def drawIter(it: LSystemIteration) = {
    translate(width/2,height/2)
    steps += 5
    println(it.string.take(steps))
    for (ch <- it.string.take(steps)) {
      it.sys.commands(ch) match {
        case Forward =>
          line(0,0,10,10)
          translate(10,10)
        case TurnLeft => rotate(radians(it.sys.angle))
        case TurnRight => rotate(radians(-it.sys.angle))
        case Push => pushMatrix()
        case Pop => popMatrix()
      }
    }
  }

  override def setup {
    size(800, 800)
    colorMode(HSB, 100)
    frameRate(999)
    stroke(0);
  }

  override def draw: Unit = {
    drawIter(lastIter)
    if (lastIter.generation < 6) lastIter = lastIter.next
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("lsystems.Main"))
  }
}