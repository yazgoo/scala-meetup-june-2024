name := "scala-meetup-july-2024"

version := "0.1"

scalaVersion := "3.4.2"

val sparkVersion = "3.0.1"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala3-library_3" % scalaVersion.value,
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.0"
)
