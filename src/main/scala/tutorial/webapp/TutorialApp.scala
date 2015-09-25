package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSExport

object TutorialApp extends JSApp{

  def main() = jQuery(setupUI _)

  def setupUI(){
    jQuery("body").append("<p>Hello World</p>")
                  .append("<button id='click-me-button' type='button'>Click me!</button>")
    jQuery("#click-me-button").click(addClickedMessage _)
  }

  @JSExport
  def addClickedMessage() = jQuery("body").append("<p>You clicked the button!</p>")
}
