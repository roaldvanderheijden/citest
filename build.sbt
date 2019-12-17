name := "testjevoorCIopzetten"

version := "0.1"

scalaVersion := "2.12.8"

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
)

lazy val root = (project in file(".")).
  settings(
    libraryDependencies ++= testDependencies
  )