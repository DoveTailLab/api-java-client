/*
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.onfido.models.LivePhoto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LivePhotosList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T16:30:58.546Z[GMT]")
public class LivePhotosList {
  public static final String SERIALIZED_NAME_LIVE_PHOTOS = "live_photos";
  @SerializedName(SERIALIZED_NAME_LIVE_PHOTOS)
  private List<LivePhoto> livePhotos = new ArrayList<>();

  public LivePhotosList livePhotos(List<LivePhoto> livePhotos) {
    this.livePhotos = livePhotos;
    return this;
  }

  public LivePhotosList addLivePhotosItem(LivePhoto livePhotosItem) {
    if (this.livePhotos == null) {
      this.livePhotos = new ArrayList<>();
    }
    this.livePhotos.add(livePhotosItem);
    return this;
  }

   /**
   * Get livePhotos
   * @return livePhotos
  **/
  @ApiModelProperty(value = "")
  public List<LivePhoto> getLivePhotos() {
    return livePhotos;
  }

  public void setLivePhotos(List<LivePhoto> livePhotos) {
    this.livePhotos = livePhotos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivePhotosList livePhotosList = (LivePhotosList) o;
    return Objects.equals(this.livePhotos, livePhotosList.livePhotos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(livePhotos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivePhotosList {\n");
    sb.append("    livePhotos: ").append(toIndentedString(livePhotos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

