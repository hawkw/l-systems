package me.hawkweisman.lsystems
package grammars

import me.hawkweisman.lsystems.turtle._

/**
 * Created by hawk on 2/14/15.
 */
object SierpinskiTriangle extends LSystem(
  60,
  Map(
    'A' -> "B-A-B",
    'B' -> "A+B+A"
  ),
  Map(
    'A' -> Forward,
    'B' -> Forward,
    '-' -> TurnLeft,
    '+' -> TurnRight
  ),
  "A"
)