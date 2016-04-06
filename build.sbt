name := """play-nested-routes-2.3.10"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// scalaVersion := "2.10.4"

libraryDependencies ++= Seq(

)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
