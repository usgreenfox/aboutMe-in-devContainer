FROM openjdk:17.0.2-jdk-slim-bullseye

RUN apt-get update \
    && apt-get -y install maven \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

COPY . /app
WORKDIR /app