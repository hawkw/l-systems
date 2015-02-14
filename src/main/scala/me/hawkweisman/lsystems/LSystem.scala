package me.hawkweisman.lsystems

import me.hawkweisman.lsystems.turtle.Command

/**
 * Created by hawk on 2/14/15.
 */
case class LSystem (
  angle: Float,
  rules: Map[Char,String],
  commands: Map[Char,Command],
  start: String
) {
  def first: LSystemIteration = LSystemIteration(this,start,0)
}

case class LSystemIteration(sys: LSystem, string: String, generation: Int) {
  def next = LSystemIteration (
    sys,
    (for { ch <- string} yield {
      sys.rules.get(ch) match {
        case Some(production) => production
        case None => ch
      }
    }).mkString,
    generation + 1
  )
  override val toString = s"[$generation, $string]"
}