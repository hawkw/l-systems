package me.hawkweisman.lsystems
package turtle

/**
 * Created by hawk on 2/14/15.
 */

import processing.core._
import PApplet._
import lsystems.Main

sealed trait Command
case object Forward extends Command
case object TurnLeft extends Command
case object TurnRight extends Command
case object Push extends Command
case object Pop extends Command