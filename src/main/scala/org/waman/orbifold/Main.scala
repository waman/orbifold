package org.waman.orbifold

import org.scalajs.dom.{document, requestAnimationFrame, window}
import org.waman.orbifold.cameras.PerspectiveCamera
import org.waman.orbifold.extras.geometries.DodecahedronGeometry
import org.waman.orbifold.materials.MeshBasicMaterial
import org.waman.orbifold.objects.Mesh
import org.waman.orbifold.renderers.WebGLRenderer
import org.waman.orbifold.scenes.Scene

//import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp

object Main extends JSApp{

  def main(){
    // Scene
    val scene = new Scene()

    //Camera
    val camera = new PerspectiveCamera(75, 1.0, 0.1, 1000)
//    val camera = new PerspectiveCamera(
//      75, window.innerWidth / window.innerHeight, 0.1, 1000)
    camera.position.z = 5

    //Renderer
    val renderer = new WebGLRenderer()
//    val renderer = new WebGLRenderer(js.Dynamic.literal(antialias = true, alpha = true))
//    val params = new WebGLRendererParameters{ alpha = true; antialias = true }
//    val renderer = new WebGLRenderer(new WebGLRendererParameters{ alpha = true; antialias = true})
    renderer.setClearColor(0xff0000)
    renderer.setSize(window.innerWidth, window.innerHeight)
    document.body.appendChild(renderer.domElement)
    println(renderer.domElement)
//    jQuery("body").append(renderer.domElement)

    // Object
//        val geo = new BoxGeometry(2.0, 2.0, 2.0)
    val geometry = new DodecahedronGeometry(2.0)

    val material = new MeshBasicMaterial()
    material.color = 0x000000
    material.wireframe = true

    val hedron = new Mesh(geometry, material)
    scene.add(hedron)

    def render(double: Double): Unit = {
      requestAnimationFrame(render _)

      hedron.rotation.x += 0.01
      hedron.rotation.y += 0.01

      renderer.render(scene, camera)
    }
    render(1.0)
  }
}