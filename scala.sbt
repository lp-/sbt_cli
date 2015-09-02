name := "Scala CLI"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies += "codes.reactive" %% "scala-time" % "0.3.0-SNAPSHOT"

initialCommands in console += "import codes.reactive.scalatime._;"

initialCommands in console += "import Scalatime._;"

initialCommands in console += "import java.time;"

initialCommands in console += "def now = java.time.LocalDateTime.now;"

resolvers += Resolver.sonatypeRepo("public")
