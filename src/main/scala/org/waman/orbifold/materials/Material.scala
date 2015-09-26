package org.waman.orbifold.materials

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.Material")
abstract class Material extends js.Object{

  var color: Int = js.native
  var wireframe: Boolean = js.native
}
