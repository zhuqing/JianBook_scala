name := """play-scala"""

version := "1.0-SNAPSHOT"



scalaVersion := "2.11.8"
val reactiveMongoVer = "0.11.14"

libraryDependencies += jdbc
libraryDependencies += cache
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test

libraryDependencies ++= Seq(
 // "org.reactivemongo" %% "reactivemongo" % "0.12"
"org.reactivemongo" %% "play2-reactivemongo" % reactiveMongoVer
)

routesGenerator := InjectedRoutesGenerator

fork in run := true

lazy val root = (project in file(".")).enablePlugins(PlayScala)