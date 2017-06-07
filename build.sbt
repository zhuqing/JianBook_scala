name := """play-scala"""

version := "1.0-SNAPSHOT"



scalaVersion := "2.11.8"


libraryDependencies += jdbc
libraryDependencies += cache
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
val reactiveMongoVer = "0.12.3"
libraryDependencies ++= Seq(
 // "org.reactivemongo" %% "reactivemongo" % "0.12"
"org.reactivemongo" %% "play2-reactivemongo" % reactiveMongoVer
)

routesGenerator := InjectedRoutesGenerator

fork in run := true

lazy val root = (project in file(".")).enablePlugins(PlayScala)