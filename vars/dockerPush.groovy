#!/usr/bin/env groovy

def call(String APP_IMAGE_REGISTRY, String APP_IMAGE_REPOSITORY) {

    dir("${WORKSPACE}") {
        sh "echo $DOCKERHUB_CRED_PSW | docker login -u $DOCKERHUB_CRED_USR --password-stdin"
        sh "docker push ${APP_IMAGE_REGISTRY}/${APP_IMAGE_REPOSITORY}:${BUILD_NUMBER}"
    }

}