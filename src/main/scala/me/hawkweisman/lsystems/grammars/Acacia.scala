package me.hawkweisman.lsystems
package grammars

object Acacia extends LSystem(
  25f,
  Map(
    'X' -> "F-[[X]+X]+F[+FX]-X",
    'F' -> "FF"
  ),
  AxialTree.rules,
  "X"
)