FROM library/jenkins:2.60.3-alpine
USER root
RUN cd /usr/local/bin
RUN curl -SLO https://download.docker.com/linux/static/stable/x86_64/docker-18.03.1-ce.tgz
RUN	tar xzvf docker-18.03.1-ce.tgz --strip 1 -C /usr/local/bin docker/docker
RUN rm docker-18.03.1-ce.tgz