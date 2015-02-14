package me.hawkweisman.lsystems
package samples

object AxialTreeA extends LSystem(
  45,
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