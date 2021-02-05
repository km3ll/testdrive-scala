
name := "khazad-dum"
version := "0.1"
scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka"           %% "akka-http"          % "10.2.3",
  "de.heikoseeberger"           %% "akka-http-circe"    % "1.20.1",
  "com.typesafe.akka"           %% "akka-http-testkit"  % "10.2.3",
  "com.typesafe.akka"           %% "akka-actor-typed"   % "2.6.8",
  "com.typesafe.akka"           %% "akka-stream"        % "2.6.8",
  "org.typelevel"               %% "cats-core"          % "2.1.1",
  "io.circe"                    %% "circe-core"         % "0.9.3",
  "io.circe"                    %% "circe-generic"      % "0.9.3",
  "io.circe"                    %% "circe-parser"       % "0.9.3",
  "io.circe"                    %% "circe-java8"        % "0.9.3",
  "com.typesafe"                %  "config"             % "1.3.2",
  "com.github.blemale"          %% "scaffeine"          % "4.0.2",
  "org.scalacheck"              %% "scalacheck"         % "1.14.1",
  "ch.qos.logback"              % "logback-classic"     % "1.3.0-alpha4",
  "com.typesafe.scala-logging"  %% "scala-logging"      % "3.9.2",
  "org.scalatest"               %% "scalatest"          % "3.2.2",
)

addCommandAlias( "me", "clean ; compile ; test:compile ; coverage ; test ; coverageReport")

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ypartial-unification",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import",
  "-Xfuture"
)

coverageEnabled := true
coverageMinimum := 90