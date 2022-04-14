FROM jenkins/jenkins:lts-jdk11

#COPY --chown=jenkins:jenkins plugins.txt /usr/share/jenkins/ref/plugins.txt
#RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt
USER root
RUN apt-get update
RUN apt-get install wget
RUN wget https://downloads-openshift-console.apps.osh-staging.myorderbox.com/amd64/linux/oc.tar
RUN tar -xvf oc.tar
RUN mv oc /usr/local/bin
RUN wget -qO- https://get.docker.com/ | sh