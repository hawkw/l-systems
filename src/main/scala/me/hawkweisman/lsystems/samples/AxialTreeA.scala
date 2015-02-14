package me.hawkweisman.lsystems
package samples

import me.hawkweisman.lsystems.turtle._

object AxialTreeA extends LSystem(
  25.7f,
  Map(
    'F' -> "F[+F]F[-F]F"
  ),
  Map(
    'F' -> Forward,
    '-' -> TurnLeft,
    '+' -> TurnRight,
    '[' -> Push,
    ']' -> Pop
  ),
  "F"
)