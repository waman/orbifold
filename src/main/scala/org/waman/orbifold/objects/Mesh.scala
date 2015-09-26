package org.waman.orbifold.objects

import org.waman.orbifold.core.{Object3D, Geometry}
import org.waman.orbifold.materials.Material

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.Mesh")
class Mesh
(
  var geometry: Geometry,
  var material: Material = js.native) extends Object3D
