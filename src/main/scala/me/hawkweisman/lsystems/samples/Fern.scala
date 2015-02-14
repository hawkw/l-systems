package me.hawkweisman.lsystems
package samples

object Fern extends LSystem(
  25f,
  Map(
    'X' -> "F-[[X]+X]+F[+FX]-X",
    'F' -> "FF"
  ),
  AxialTree.rules,
  "X"
)