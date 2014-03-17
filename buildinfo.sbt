import com.typesafe.sbt.SbtGit.GitKeys._

useJGit

buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion, gitHeadCommit)

buildInfoPackage := "hello"
