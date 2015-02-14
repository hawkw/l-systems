package lsystems

import me.hawkweisman.lsystems.LSystemIteration
import me.hawkweisman.lsystems.grammars.{SierpinskiLSystem, PythagorasTree, AxialTreeA, AxialTreeB,Fern}
import me.hawkweisman.lsystems.turtle.{Push,TurnLeft,TurnRight,Pop,Forward,Nop, Command}
import processing.core._
import PConstants._
import PApplet._

class Main extends PApplet {
  var lastIter = Fern.first.next // if you want to try other l-systems, use this
  var steps = 0
  var dist = 25f

  def drawIter(it: LSystemIteration) = {
    translate(50,height/3)
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
        case Nop => {}
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
    // Advance to the next iteration of the L-system
    // Don't do this too many times or it will make your computer melt.
    // I speak from experience.
    background(0)
    lastIter = lastIter.next
    dist = dist/1.4f
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("lsystems.Main"))
  }
}