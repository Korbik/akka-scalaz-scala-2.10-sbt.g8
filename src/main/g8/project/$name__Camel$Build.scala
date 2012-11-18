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
      libraryDependencies ++= Seq(
       "com.typesafe.akka" % "akka-actor" % "$akka_version$",
       "org.specs2" % "specs2_2.10.0-RC2" % "1.12.2",
       "org.scalaz" % "scalaz-core_2.10.0-RC2" % "7.0-M4"
     )
    )
  )
}
