def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
   sh 'mvn package'
}

def newDeploy(ip,conextpath)
{
  scp "/var/lib/jenkins/workspace/DeclarativePipeline2/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapp/${contextpath}.war"
}
