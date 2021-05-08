# ResolveControllerApi

All URIs are relative to *http://vm-services-media:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resolveMetadataforUrlInBody**](ResolveControllerApi.md#resolveMetadataforUrlInBody) | **GET** / | 
[**resolveMetadataforUrlInBodyWithHttpInfo**](ResolveControllerApi.md#resolveMetadataforUrlInBodyWithHttpInfo) | **GET** / | 
[**resolveMetadataforUrlInPath**](ResolveControllerApi.md#resolveMetadataforUrlInPath) | **GET** /resolve | 
[**resolveMetadataforUrlInPathWithHttpInfo**](ResolveControllerApi.md#resolveMetadataforUrlInPathWithHttpInfo) | **GET** /resolve | 



## resolveMetadataforUrlInBody

> MovieMetadata resolveMetadataforUrlInBody(url)



### Example

```java
// Import classes:
import io.github.lumue.mdresolver.client.invoker.ApiClient;
import io.github.lumue.mdresolver.client.invoker.ApiException;
import io.github.lumue.mdresolver.client.invoker.Configuration;
import io.github.lumue.mdresolver.client.invoker.models.*;
import io.github.lumue.mdresolver.client.api.ResolveControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://vm-services-media:8090");

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

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |

### Return type

[**MovieMetadata**](MovieMetadata.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## resolveMetadataforUrlInBodyWithHttpInfo

> ApiResponse<MovieMetadata> resolveMetadataforUrlInBody resolveMetadataforUrlInBodyWithHttpInfo(url)



### Example

```java
// Import classes:
import io.github.lumue.mdresolver.client.invoker.ApiClient;
import io.github.lumue.mdresolver.client.invoker.ApiException;
import io.github.lumue.mdresolver.client.invoker.ApiResponse;
import io.github.lumue.mdresolver.client.invoker.Configuration;
import io.github.lumue.mdresolver.client.invoker.models.*;
import io.github.lumue.mdresolver.client.api.ResolveControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://vm-services-media:8090");

        ResolveControllerApi apiInstance = new ResolveControllerApi(defaultClient);
        String url = "url_example"; // String | 
        try {
            ApiResponse<MovieMetadata> response = apiInstance.resolveMetadataforUrlInBodyWithHttpInfo(url);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResolveControllerApi#resolveMetadataforUrlInBody");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |

### Return type

ApiResponse<[**MovieMetadata**](MovieMetadata.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## resolveMetadataforUrlInPath

> MovieMetadata resolveMetadataforUrlInPath(url)



### Example

```java
// Import classes:
import io.github.lumue.mdresolver.client.invoker.ApiClient;
import io.github.lumue.mdresolver.client.invoker.ApiException;
import io.github.lumue.mdresolver.client.invoker.Configuration;
import io.github.lumue.mdresolver.client.invoker.models.*;
import io.github.lumue.mdresolver.client.api.ResolveControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://vm-services-media:8090");

        ResolveControllerApi apiInstance = new ResolveControllerApi(defaultClient);
        String url = "url_example"; // String | 
        try {
            MovieMetadata result = apiInstance.resolveMetadataforUrlInPath(url);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResolveControllerApi#resolveMetadataforUrlInPath");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |

### Return type

[**MovieMetadata**](MovieMetadata.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## resolveMetadataforUrlInPathWithHttpInfo

> ApiResponse<MovieMetadata> resolveMetadataforUrlInPath resolveMetadataforUrlInPathWithHttpInfo(url)



### Example

```java
// Import classes:
import io.github.lumue.mdresolver.client.invoker.ApiClient;
import io.github.lumue.mdresolver.client.invoker.ApiException;
import io.github.lumue.mdresolver.client.invoker.ApiResponse;
import io.github.lumue.mdresolver.client.invoker.Configuration;
import io.github.lumue.mdresolver.client.invoker.models.*;
import io.github.lumue.mdresolver.client.api.ResolveControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://vm-services-media:8090");

        ResolveControllerApi apiInstance = new ResolveControllerApi(defaultClient);
        String url = "url_example"; // String | 
        try {
            ApiResponse<MovieMetadata> response = apiInstance.resolveMetadataforUrlInPathWithHttpInfo(url);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResolveControllerApi#resolveMetadataforUrlInPath");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |

### Return type

ApiResponse<[**MovieMetadata**](MovieMetadata.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

