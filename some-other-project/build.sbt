lazy val root = Project("root", file(".")).dependsOn(
  RootProject( file("..") / "some-project" )
)