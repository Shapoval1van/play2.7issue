name := "test"
 
version := "evolutions.0" 
      
lazy val `test` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  guice,
  javaJpa,
  javaJdbc,
  javaWs,
  evolutions,
  "org.hibernate" % "hibernate-entitymanager" % "5.4.2.Final",
  "com.h2database" % "h2" % "1.3.148"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      