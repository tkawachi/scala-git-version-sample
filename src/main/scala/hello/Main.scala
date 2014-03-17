package hello

object Main {
  def main(args: Array[String]) {
    val commit = BuildInfo.gitHeadCommit getOrElse "Unknown commit"
    println(s"Git commit: $commit")
  }
}
