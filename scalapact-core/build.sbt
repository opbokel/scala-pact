name := "scalapact-core"

organization := "com.itv"

version := "0.0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "io.argonaut" %% "argonaut" % "6.1" withSources() withJavadoc()
)

