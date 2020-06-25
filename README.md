[![CircleCI](https://circleci.com/gh/mariamihai/udemy-sbm-beer-service.svg?style=svg)](https://circleci.com/gh/mariamihai/udemy-sbm-beer-service)

# SBM Beer Service
Spring Boot Microservice project

## Description
The current project encapsulates the beer information of initial [monolith brewery project](https://github.com/mariamihai/udemy-sbm-brewery-monolith).
The initial project was split in 3 microservices:
* SBM (Spring Boot Microservices) Beer Service [current project]
* [SBM (Spring Boot Microservices) Beer Order Service](https://github.com/mariamihai/udemy-sbm-beer-order-service)
* [SBM (Spring Boot Microservices) Beer Inventory Service](https://github.com/mariamihai/udemy-sbm-beer-inventory-service)

## Implementation Details
### Default port mapping - for single host

| Service Name | Port | 
| --------| -----|
| SBM Beer Service [current project] | 8080 |
| [SBM  Beer Order Service](https://github.com/mariamihai/udemy-sbm-beer-order-service) | 8081 |
| [SBM Beer Inventory Service](https://github.com/mariamihai/udemy-sbm-beer-inventory-service) | 8082 |