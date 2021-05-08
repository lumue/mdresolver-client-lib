# openapi-java-client

OpenAPI definition

- API version: v0

- Build date: 2021-01-17T07:38:54.534969731+01:00[Europe/Berlin]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:v0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-v0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.github.lumue.mdresolver.client.invoker.*;
import io.github.lumue.mdresolver.client.model.*;
import io.github.lumue.mdresolver.client.api.ResolveControllerApi;

public class ResolveControllerApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
        ResolveControllerApi apiInstance = new ResolveControllerApi(defaultClient);
        String url = "url_example"; // String | 
        try {
            MovieMetadata result = apiInstance.resolveMetadataforUrlInBody(url);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResolveControllerApi#resolveMetadataforUrlInBody");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://vm-services-media:8090*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ResolveControllerApi* | [**resolveMetadataforUrlInBody**](docs/ResolveControllerApi.md#resolveMetadataforUrlInBody) | **GET** / | 
*ResolveControllerApi* | [**resolveMetadataforUrlInBodyWithHttpInfo**](docs/ResolveControllerApi.md#resolveMetadataforUrlInBodyWithHttpInfo) | **GET** / | 
*ResolveControllerApi* | [**resolveMetadataforUrlInPath**](docs/ResolveControllerApi.md#resolveMetadataforUrlInPath) | **GET** /resolve | 
*ResolveControllerApi* | [**resolveMetadataforUrlInPathWithHttpInfo**](docs/ResolveControllerApi.md#resolveMetadataforUrlInPathWithHttpInfo) | **GET** /resolve | 


## Documentation for Models

 - [Actor](docs/Actor.md)
 - [MovieMetadata](docs/MovieMetadata.md)
 - [MovieMetadataDuration](docs/MovieMetadataDuration.md)
 - [MovieMetadataDurationDuration](docs/MovieMetadataDurationDuration.md)
 - [MovieMetadataDurationUnits](docs/MovieMetadataDurationUnits.md)
 - [Tag](docs/Tag.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Author



