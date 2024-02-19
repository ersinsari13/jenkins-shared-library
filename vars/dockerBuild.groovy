// vars/dockerBuild.groovy
#!/usr/bin/env groovy
def call(String APP_IMAGE_REGISTRY, String APP_IMAGE_REPOSITORY) {
    dir("${WORKSPACE}") {
        sh "docker build -t ${APP_IMAGE_REGISTRY}/${APP_IMAGE_REPOSITORY}:$(BUILD_NUMBER) ."
    }
}