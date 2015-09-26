package org.waman.orbifold.scenes

import org.waman.orbifold.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.Scene")
class Scene extends Object3D{

  def add(`object`: Object3D): Unit = js.native
}
