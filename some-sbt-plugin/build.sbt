name := "some-sbt-plugin"

scalaVersion := "2.10.6"

sbtPlugin := true

version := "0.1-SNAPSHOT"

organization := "ai.x"

libraryDependencies ++= Seq(
  "com.hubspot" % "SingularityClient" % "0.15.1"
    // exclude("jline", "jline")
)
