import SbtSettings._

organization := "middle-earth"
name := "khazad-dum"
version := "0.1"
scalaVersion := "2.12.8"

lazy val domain = project
  .in( file( "core-domain" ) )
  .settings(
    libraryDependencies ++= domainDependencies,
    scalacOptions ++= compilerOptions
  )

lazy val http = project
  .in( file( "mod-http" ) )
  .settings(
    libraryDependencies ++= httpDependencies,
    scalacOptions ++= compilerOptions
  ).dependsOn( domain )

lazy val persistence = project
  .in( file( "mod-persistence" ) )
  .settings(
    libraryDependencies ++= persistenceDependencies,
    scalacOptions ++= compilerOptions
  ).dependsOn( domain )

// coverage
coverageMinimumStmtTotal := 90

// alias
addCommandAlias( "me", "clean ; update ; compile ; test:compile ; coverage ; test ; coverageReport")