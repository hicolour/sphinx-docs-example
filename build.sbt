organization  := "com.prochera"

name := "notepad-java8"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

val akkaVersion = "2.3.9"

compileOrder in Compile := CompileOrder.JavaThenScala

libraryDependencies ++= Seq(
  // akka
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
//  "com.typesafe.akka" %% "akka-persistence-experimental" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-contrib" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
//  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-M2",


  "net.bytebuddy" % "byte-buddy-parent" % "0.6.5",

  "io.javaslang" % "javaslang" % "2.0.5",
  "io.javaslang" % "javaslang-match" % "2.0.5",
  // util
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  //test scala
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  //junit tests on sbt
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  // mockiing
  "org.mockito" % "mockito-all" % "1.10.19",
  "org.easymock" % "easymock" % "3.1",
  // Matchers
//  "org.easytesting" % "fest-assert" % "1.4",
  "org.hamcrest" % "hamcrest-all" % "1.3",
  "org.assertj" % "assertj-core" % "3.2.0",
  // ContactList utls
  "com.jayway.awaitility" % "awaitility" % "1.6.3",
  "joda-time" % "joda-time" % "2.5",
  "org.joda" % "joda-convert" % "1.7",


  "org.gitlab" % "java-gitlab-api" % "1.1.4",

  "com.github.javaparser" % "javaparser-core" % "2.3.0"


)





