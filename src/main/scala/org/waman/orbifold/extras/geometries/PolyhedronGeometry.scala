package org.waman.orbifold.extras.geometries

import org.waman.orbifold.core.{Geometry, Face3}
import org.waman.orbifold.math.Vector3

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.Polyhedron")
abstract class PolyhedronGeometry
(
  var vertices: js.Array[Vector3] = js.native,
  var faces: js.Array[Face3] = js.native,
  var radius: Double = js.native,
  var detail: Int = js.native)extends Geometry
{
}
