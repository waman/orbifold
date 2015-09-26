package org.waman.orbifold.math

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("Vector3")
class Vector3
(
  var x: Double,
  var y: Double,
  var z: Double) extends js.Object{

  def set(x: Double, y: Double, z: Double): Vector3 = js.native
  def setX(x: Double): Vector3 = js.native
  def setY(y: Double): Vector3 = js.native
  def setZ(z: Double): Vector3 = js.native
}
