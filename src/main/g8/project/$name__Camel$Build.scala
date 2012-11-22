import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots",
      libraryDependencies ++= Seq(
       "com.typesafe.akka" % "akka-actor" % "2.1.0-RC2" cross CrossVersion.full,
       "org.specs2" % "specs2" % "1.12.2" cross CrossVersion.full,
       "org.scalaz" % "scalaz-core" % "7.0.0-M4" cross CrossVersion.full
     ),
     scalacOptions += "-feature",
     initialCommands in console := "import scalaz._, Scalaz._"
    )
  )
}
