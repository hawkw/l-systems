package me.hawkweisman.lsystems
package samples

import me.hawkweisman.lsystems.turtle

/**
 * Created by hawk on 2/14/15.
 */
class SierpinskiLSystem extends LSystem(
  60,
  Map(
    'A' -> "B-A-B",
    'B' -> "A+B+A"
  ),
  Map(
    'A' -> turtle.Forward,
    'B' -> turtle.Forward,
    '-' -> turtle.Left,
    '+' -> turtle.Right
  ),
  "A"
)