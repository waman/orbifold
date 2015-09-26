package org.waman.orbifold.core

import org.waman.orbifold.math.{Eular, Vector3}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.Object3D")
class Object3D extends js.Object{

  var position: Vector3 = js.native
  var rotation: Eular = js.native
}
