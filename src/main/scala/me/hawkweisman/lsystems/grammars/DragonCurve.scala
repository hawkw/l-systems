package me.hawkweisman.lsystems
package grammars

import me.hawkweisman.lsystems.turtle._

object DragonCurve extends LSystem(
  90f,
  Map(
    'X' -> "X+YF+",
    'Y' -> "-FX-Y"
  ),
  Map(
    'X' -> Nop,
    'Y' -> Nop,
    '-' -> TurnLeft,
    '+' -> TurnRight,
    'F' -> Forward
    ),
  "FX"
)