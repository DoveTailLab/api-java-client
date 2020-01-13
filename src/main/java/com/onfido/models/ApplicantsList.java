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
import com.onfido.models.Applicant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicantsList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T16:30:58.546Z[GMT]")
public class ApplicantsList {
  public static final String SERIALIZED_NAME_APPLICANTS = "applicants";
  @SerializedName(SERIALIZED_NAME_APPLICANTS)
  private List<Applicant> applicants = new ArrayList<>();

  public ApplicantsList applicants(List<Applicant> applicants) {
    this.applicants = applicants;
    return this;
  }

  public ApplicantsList addApplicantsItem(Applicant applicantsItem) {
    if (this.applicants == null) {
      this.applicants = new ArrayList<>();
    }
    this.applicants.add(applicantsItem);
    return this;
  }

   /**
   * Get applicants
   * @return applicants
  **/
  @ApiModelProperty(value = "")
  public List<Applicant> getApplicants() {
    return applicants;
  }

  public void setApplicants(List<Applicant> applicants) {
    this.applicants = applicants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantsList applicantsList = (ApplicantsList) o;
    return Objects.equals(this.applicants, applicantsList.applicants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantsList {\n");
    sb.append("    applicants: ").append(toIndentedString(applicants)).append("\n");
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

