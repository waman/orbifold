enablePlugins(ScalaJSPlugin)

name := "orbifold"

version := "0.1"

scalaVersion := "2.11.7"

scalaJSStage in Global := FastOptStage

resolvers += sbt.Resolver.bintrayRepo("denigma", "denigma-releases")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "be.doeraene" %%% "scalajs-jquery" % "0.8.0",
  "org.denigma" %%% "threejs-facade" % "0.0.71-0.1.5"
)

//skip in packageJSDependencies := false
//
//persistLauncher in Compile := true
//
//persistLauncher in Test := false