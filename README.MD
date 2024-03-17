# Spring Boot + Gradle example

## Run Spring Boot application
```
./gradlew bootRun
```

Docker:
-------
docker build -t cloudmahesh/sb-jpa-h2:tag1 .
docker push cloudmahesh/sb-jpa-h2:tag1

docker rmi -f $(docker images -q)

Minikube:
---------
minikube start
minikube tunnel
minikube stop

minikube image load cloudmahesh/sb-jpa-h2:tag1
minikube image ls
minikube image rm cloudmahesh/sb-jpa-h2:tag1

K8S:
----
kubectl get nodes
kubectl create deployment sb-jpa-h2 --image=cloudmahesh/sb-jpa-h2:tag1
kubectl get deployments
kubectl expose deployment sb-jpa-h2 --type LoadBalancer --port 8080 --target-port 8080
kubectl get pods
kubectl get service sb-jpa-h2
kubectl get services

K8S-Manifest:
-------------
kubectl apply -f sb-jpa-h2.yml
kubectl delete -f sb-jpa-h2.yml

PostMan collection: <br>
-------------------- <br>
Refer sb-jpa-h2.postman_collection.json

to get all services/deployment/pods:
---------------------------------------
# get all pods
kubectl get pods --all-namespaces

# get all deployments
kubectl get deployments --all-namespaces

# get all services
kubectl get services --all-namespaces

to delete all services/deployment/pods:
---------------------------------------
# delete all pods
kubectl delete pods --all-namespaces

# delete all deployments
kubectl delete deployments --all-namespaces

# delete all services
kubectl delete services --all-namespaces