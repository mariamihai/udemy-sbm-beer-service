[![CircleCI](https://circleci.com/gh/mariamihai/udemy-sbm-beer-service.svg?style=svg)](https://circleci.com/gh/mariamihai/udemy-sbm-beer-service)

Docker [![Docker](https://img.shields.io/docker/v/mariamihai/sbm-beer-service?sort=semver)](https://img.shields.io/docker/v/mariamihai/sbm-beer-service?sort=semver)

# SBM Beer Service
Spring Boot Microservice project

## Description
The current project encapsulates the beer information of initial [monolith brewery project](https://github.com/mariamihai/udemy-sbm-brewery-monolith).
The initial project was split in 3 microservices:
* SBM (Spring Boot Microservices) Beer Service [current project]
* [SBM (Spring Boot Microservices) Beer Order Service](https://github.com/mariamihai/udemy-sbm-beer-order-service)
* [SBM (Spring Boot Microservices) Beer Inventory Service](https://github.com/mariamihai/udemy-sbm-beer-inventory-service)

## API Version
Currently the application is at _v1_.

## Implementation Details
### Properties
```
spring.application.name=beer-service

server.port=8080
```

### Environment variables for running locally
**sbm.brewery.beer-inventory-service-host** contained originally the beer inventory service host. 
Added `INVENTORY_SERVICE_HOST` to be used both for Docker and when running locally to set the host. For local use, 
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
    
##### Save new beer
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
    
##### Update beer
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
