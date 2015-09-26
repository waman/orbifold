package org.waman.orbifold.cameras

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.PerspectiveCamera")
class PerspectiveCamera
(
  var fov: Int,
  var aspect: Double,
  var near: Double,
  var far: Double) extends Camera
{

}
