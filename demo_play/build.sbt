name := """demo_play"""
organization := "fr.ingima"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.13.0"

libraryDependencies += guice

libraryDependencies ++= Seq(javaJdbc)

EclipseKeys.classpathTransformerFactories := EclipseKeys.classpathTransformerFactories.value.init
EclipsePlugin.EclipseKeys.preTasks := Seq()

libraryDependencies ++= Seq(
       "mysql" % "mysql-connector-java" % "5.1.18"
)

libraryDependencies+="io.jsonwebtoken" % "jjwt-api" % "0.10.7"


// https://mvnrepository.com/artifact/com.typesafe.play/play-json
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.7.4"

// https://mvnrepository.com/artifact/com.typesafe.play/play-ebean
libraryDependencies += "com.typesafe.play" %% "play-ebean" % "5.0.2"

libraryDependencies += ws
libraryDependencies += ehcache