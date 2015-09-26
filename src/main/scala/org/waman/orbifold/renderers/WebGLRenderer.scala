package org.waman.orbifold.renderers

import org.scalajs.dom.raw.HTMLCanvasElement
import org.waman.orbifold.cameras.Camera
import org.waman.orbifold.scenes.Scene

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.WebGLRenderer")
class WebGLRenderer extends js.Object{

//  def this() = this(null)
//  def this(parameters: WebGLRendererParameters) = this()

  var domElement: HTMLCanvasElement = js.native

  def setClearColor(color: Int, alpha: Double = js.native): Unit = js.native
  def setSize(width: Int, height: Int): Unit = js.native

  def render(scene: Scene, camera: Camera): Unit = js.native
}
