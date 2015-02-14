package me.hawkweisman.lsystems
package samples

import me.hawkweisman.lsystems.turtle._

object AxialTree {
  val rules = Map(
    'F' -> Forward,
    '-' -> TurnLeft,
    '+' -> TurnRight,
    '[' -> Push,
    ']' -> Pop,
    'X' -> Nop
  )
}

object AxialTreeA extends LSystem(
  25.7f,
  Map(
    'F' -> "F[+F]F[-F]F"
  ),
  AxialTree.rules,
  "F"
)
object AxialTreeB extends LSystem(
  22.5f,
  Map(
    'F' -> "FF-[-F+F+F]+[+F-F-F]"
  ),
  AxialTree.rules,
  "F"
)