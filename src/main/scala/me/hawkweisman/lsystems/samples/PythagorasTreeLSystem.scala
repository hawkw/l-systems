package me.hawkweisman.lsystems
package samples

import me.hawkweisman.lsystems.turtle._

/**
 * Created by hawk on 2/14/15.
 * After seven or eight iterations this makes procelling crash. Just fyi.
 */
object PythagorasTree extends LSystem(
  45,
  Map(
    '1' -> "11",
    '0' -> "1[-0]+0"
  ),
  Map(
    '1' -> Forward,
    '0' -> Forward,
    '-' -> TurnLeft,
    '+' -> TurnRight,
    '[' -> Push,
    ']' -> Pop
  ),
  "0"
)