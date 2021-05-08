/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.lumue.mdresolver.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.lumue.mdresolver.client.invoker.JSON;


/**
 * MovieMetadataDurationDuration
 */
@JsonPropertyOrder({
  MovieMetadataDurationDuration.JSON_PROPERTY_SECONDS,
  MovieMetadataDurationDuration.JSON_PROPERTY_ZERO,
  MovieMetadataDurationDuration.JSON_PROPERTY_NEGATIVE,
  MovieMetadataDurationDuration.JSON_PROPERTY_NANO
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-17T07:38:54.534969731+01:00[Europe/Berlin]")
public class MovieMetadataDurationDuration {
  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Long seconds;

  public static final String JSON_PROPERTY_ZERO = "zero";
  private Boolean zero;

  public static final String JSON_PROPERTY_NEGATIVE = "negative";
  private Boolean negative;

  public static final String JSON_PROPERTY_NANO = "nano";
  private Integer nano;


  public MovieMetadataDurationDuration seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSeconds() {
    return seconds;
  }


  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }


  public MovieMetadataDurationDuration zero(Boolean zero) {
    this.zero = zero;
    return this;
  }

   /**
   * Get zero
   * @return zero
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getZero() {
    return zero;
  }


  public void setZero(Boolean zero) {
    this.zero = zero;
  }


  public MovieMetadataDurationDuration negative(Boolean negative) {
    this.negative = negative;
    return this;
  }

   /**
   * Get negative
   * @return negative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNegative() {
    return negative;
  }


  public void setNegative(Boolean negative) {
    this.negative = negative;
  }


  public MovieMetadataDurationDuration nano(Integer nano) {
    this.nano = nano;
    return this;
  }

   /**
   * Get nano
   * @return nano
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NANO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNano() {
    return nano;
  }


  public void setNano(Integer nano) {
    this.nano = nano;
  }


  /**
   * Return true if this MovieMetadata_duration_duration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieMetadataDurationDuration movieMetadataDurationDuration = (MovieMetadataDurationDuration) o;
    return Objects.equals(this.seconds, movieMetadataDurationDuration.seconds) &&
        Objects.equals(this.zero, movieMetadataDurationDuration.zero) &&
        Objects.equals(this.negative, movieMetadataDurationDuration.negative) &&
        Objects.equals(this.nano, movieMetadataDurationDuration.nano);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds, zero, negative, nano);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieMetadataDurationDuration {\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    zero: ").append(toIndentedString(zero)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

