package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Attributes of key-value pairs.
 */
@ApiModel(description = "Attributes of key-value pairs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-02T15:30:18.322-04:00[America/New_York]")

public class ProfileAttribute   {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileAttribute {\n");
    
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

