enablePlugins(ScalaJSPlugin)

name := "orbifold"

version := "0.1"

scalaVersion := "2.11.7"

scalaJSStage in Global := FastOptStage

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"

skip in packageJSDependencies := false

persistLauncher in Compile := true

persistLauncher in Test := false