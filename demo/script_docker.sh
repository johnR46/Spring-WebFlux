docker run -d \
  --name jenkins \ 
  --restart=always \ 
  -p 80:8080 \
  -p 50000:50000 \
  -v /var/jenkins_home:/var/jenkins_home \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v $(which docker):/usr/bin/docker \  
  jenkins/jenkins:jdk11