name := "algebird"

version := "0.1.0"

organization := "com.twitter"

scalaVersion := "2.9.2"

// Use ScalaCheck
libraryDependencies += "org.scala-tools.testing" % "specs_2.9.0-1" % "1.6.8" % "test"

parallelExecution in Test := true
