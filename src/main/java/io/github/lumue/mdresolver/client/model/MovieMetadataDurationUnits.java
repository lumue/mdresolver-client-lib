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
import io.github.lumue.mdresolver.client.model.MovieMetadataDurationDuration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.lumue.mdresolver.client.invoker.JSON;


/**
 * MovieMetadataDurationUnits
 */
@JsonPropertyOrder({
  MovieMetadataDurationUnits.JSON_PROPERTY_DURATION,
  MovieMetadataDurationUnits.JSON_PROPERTY_DATE_BASED,
  MovieMetadataDurationUnits.JSON_PROPERTY_TIME_BASED,
  MovieMetadataDurationUnits.JSON_PROPERTY_DURATION_ESTIMATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-17T07:38:54.534969731+01:00[Europe/Berlin]")
public class MovieMetadataDurationUnits {
  public static final String JSON_PROPERTY_DURATION = "duration";
  private MovieMetadataDurationDuration duration;

  public static final String JSON_PROPERTY_DATE_BASED = "dateBased";
  private Boolean dateBased;

  public static final String JSON_PROPERTY_TIME_BASED = "timeBased";
  private Boolean timeBased;

  public static final String JSON_PROPERTY_DURATION_ESTIMATED = "durationEstimated";
  private Boolean durationEstimated;


  public MovieMetadataDurationUnits duration(MovieMetadataDurationDuration duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MovieMetadataDurationDuration getDuration() {
    return duration;
  }


  public void setDuration(MovieMetadataDurationDuration duration) {
    this.duration = duration;
  }


  public MovieMetadataDurationUnits dateBased(Boolean dateBased) {
    this.dateBased = dateBased;
    return this;
  }

   /**
   * Get dateBased
   * @return dateBased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_BASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDateBased() {
    return dateBased;
  }


  public void setDateBased(Boolean dateBased) {
    this.dateBased = dateBased;
  }


  public MovieMetadataDurationUnits timeBased(Boolean timeBased) {
    this.timeBased = timeBased;
    return this;
  }

   /**
   * Get timeBased
   * @return timeBased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_BASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTimeBased() {
    return timeBased;
  }


  public void setTimeBased(Boolean timeBased) {
    this.timeBased = timeBased;
  }


  public MovieMetadataDurationUnits durationEstimated(Boolean durationEstimated) {
    this.durationEstimated = durationEstimated;
    return this;
  }

   /**
   * Get durationEstimated
   * @return durationEstimated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION_ESTIMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDurationEstimated() {
    return durationEstimated;
  }


  public void setDurationEstimated(Boolean durationEstimated) {
    this.durationEstimated = durationEstimated;
  }


  /**
   * Return true if this MovieMetadata_duration_units object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieMetadataDurationUnits movieMetadataDurationUnits = (MovieMetadataDurationUnits) o;
    return Objects.equals(this.duration, movieMetadataDurationUnits.duration) &&
        Objects.equals(this.dateBased, movieMetadataDurationUnits.dateBased) &&
        Objects.equals(this.timeBased, movieMetadataDurationUnits.timeBased) &&
        Objects.equals(this.durationEstimated, movieMetadataDurationUnits.durationEstimated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, dateBased, timeBased, durationEstimated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieMetadataDurationUnits {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    dateBased: ").append(toIndentedString(dateBased)).append("\n");
    sb.append("    timeBased: ").append(toIndentedString(timeBased)).append("\n");
    sb.append("    durationEstimated: ").append(toIndentedString(durationEstimated)).append("\n");
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
