lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "rev",
      scalaVersion := "2.11.12"
    )),
    name := "poWklyAssessments"
  )

// General Scala
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"