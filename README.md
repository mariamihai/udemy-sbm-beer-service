[![CircleCI](https://circleci.com/gh/mariamihai/udemy-sbm-beer-service.svg?style=svg)](https://circleci.com/gh/mariamihai/udemy-sbm-beer-service)
[![Docker](https://img.shields.io/docker/v/mariamihai/sbm-beer-service?sort=date)](https://hub.docker.com/r/mariamihai/sbm-beer-service)

# SBM Beer Service
Spring Boot Microservice project.

  - [Description](#description)
  - [API version](#api-version)
  - [Docker images](#docker-images)
  - [Implementation details](#implementation-details)
    - [Properties](#properties)
    - [Environment variables for running locally](#environment-variables-for-running-locally)
    - [API calls](#api-calls)
      - [Obtain all beers](#obtain-all-beers)
      - [Obtain beer by id](#obtain-beer-by-id)
      - [Obtain beer by upc](#obtain-beer-by-upc)
      - [Save new beer](#save-new-beer)
      - [Update beer](#update-beer)

## Description
The current project is part of the "Spring Boot Microservices with Spring Cloud" [Udemy course](https://www.udemy.com/course/spring-boot-microservices-with-spring-cloud-beginner-to-guru/). 

The project constantly verifies that the [Beer Order Service](https://github.com/mariamihai/udemy-sbm-beer-order-service) 
didn't eliminate all the existing inventory for a particular beer and brews more for the 
[Beer Inventory Service](https://github.com/mariamihai/udemy-sbm-beer-inventory-service) if needed.
Different types of beer can be added and verified.

An overview of all the projects involved can be found [here](https://github.com/mariamihai/udemy-sbm-overview).

## API version
_V1_ is the current implementation. No changes to the project are expected to be made in the future that will affect 
the existing endpoints.

## Docker images
Automatic building was not implemented for this project. The `latest` tag contains the best implementation considered 
appropriate to be used.

For automatic building of Docker images check the next projects:
- for [CircleCI](https://github.com/mariamihai/CIToDockerExampleProject)
- for [TravisCI](https://github.com/mariamihai/sma-overview) (all projects implemented under the "Spring Microservices in Action" book)

## Implementation details
### Properties
- the name of the application, used by Eureka and the other services 
```
spring.application.name=beer-service
```
- application server port
```
server.port=8080
```
- checking the inventory is done every 10 s under `BrewingService.checkForLowInventory()` method

### Environment variables for running locally
**sbm.brewery.beer-inventory-service-host** contained originally the beer inventory service host. 

`INVENTORY_SERVICE_HOST` was added to be used both for Docker and when running locally to set the host. For local use, 
the value should be `http://localhost:8082`. For creating a Docker container, the value is set in the docker-compose file.

### API calls
#### Obtain all beers
 * __URI:__ _/api/v1/beer/_

 * __Method:__ _GET_

 * __URL params:__ <br/>
    * required: - <br/>
    * optional: <br/>
        pageNumber=[int] <br/>
        pageSize=[int] <br/>
        beerName=[String] <br/>
        beerStyle=[BeerStyleEnum] <br/>
        showInventoryOnHand=[boolean]
    
 * __Success response:__
    * Code: 200 <br/>
    * Content: (TODO - response will be added)
       ``` 
       
       ```

 * __Error Response:__ -
    * __Code:__  <br/>
    * __Content:__ (TODO - response will be added)
    ``` 
    
    ```
    
#### Obtain beer by id
 * __URI:__ _/api/v1/beer/:beerId/_

 * __Method:__ _GET_

 * __URL params:__ <br/>
    * required: <br/>
        beerId=[uuid] <br/>
    * optional: - <br/>
        showInventoryOnHand=[boolean]
    
 * __Success response:__
    * Code: 200 <br/>
    * Content: (TODO - response will be added)
       ``` 
       
       ```

 * __Error Response:__ -
    * __Code:__  <br/>
    * __Content:__ (TODO - response will be added)
    ``` 
    
    ```
    
#### Obtain beer by upc
 * __URI:__ _/api/v1/beer/beerUpc/:upc/_

 * __Method:__ _GET_

 * __URL params:__ <br/>
    * required: <br/>
        upc=[String] <br/>
    * optional: - <br/>
        showInventoryOnHand=[boolean]
    
 * __Success response:__
    * Code: 200 <br/>
    * Content: (TODO - response will be added)
       ``` 
       
       ```

 * __Error Response:__ -
    * __Code:__  <br/>
    * __Content:__ (TODO - response will be added)
    ``` 
    
    ```
    
#### Save new beer
 * __URI:__ _/api/v1/beer/_

 * __Method:__ _POST_

 * __URL params:__ <br/>
    * required: - <br/>
    * optional: - <br/>

 * __Data params:__ <br/>
    * required: - <br/>
    * optional: <br/>
        BeerDto=[beerDto] (TODO - beerDto example will be added)
        ``` 
        
        ```
        
 * __Success response:__
    * Code: 200 <br/>
    * Content: (TODO - response will be added)
       ``` 
       
       ```
    
#### Update beer
 * __URI:__ _/api/v1/beer/:beerId_

 * __Method:__ _PUT_

 * __URL params:__ <br/>
    * required: <br/>
        beerId=[uuid] <br/>
    * optional: - <br/>

 * __Data params:__ <br/>
    * required: - <br/>
    * optional: <br/>
        BeerDto=[beerDto] (TODO - beerDto example will be added)
        ``` 
        
        ```
        
 * __Success response:__
    * Code: 200 <br/>
    * Content: (TODO - response will be added)
       ``` 
       
       ```