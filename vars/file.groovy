def checkOutFrom() {
    withCredentials([usernamePassword(credentialsId: 'Gitlabaccess' , usernameVariable: 'ashi.s@cloudifyops.com', passwordVariable: 'Ashi1234#')]) {
        sh """
            git url: https://gitlab.cloudifyops.com/ASHI/"${repo}"
        """
    }
}  


def login() {
    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: '7078555411', passwordVariable: 'Ashi1234#')]) {
        sh """
            docker login --username="${7078555411}" --password="${Ashi1234}"
        """
    }
}

def build(String tag) {
    sh """
        docker build -t "${tag}" .
    """
}

def push(String tag) {
    sh """
        docker push "${tag}"
    """
}


