/**
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.onfido.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.onfido.models.Check;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ChecksList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T08:37:28.149Z")
public class ChecksList   {
  @SerializedName("checks")
  private List<Check> checks = new ArrayList<Check>();

  public ChecksList checks(List<Check> checks) {
    this.checks = checks;
    return this;
  }

  public ChecksList addChecksItem(Check checksItem) {
    this.checks.add(checksItem);
    return this;
  }

   /**
   * Get checks
   * @return checks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Check> getChecks() {
    return checks;
  }

  public void setChecks(List<Check> checks) {
    this.checks = checks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecksList checksList = (ChecksList) o;
    return Objects.equals(this.checks, checksList.checks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecksList {\n");
    
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
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
