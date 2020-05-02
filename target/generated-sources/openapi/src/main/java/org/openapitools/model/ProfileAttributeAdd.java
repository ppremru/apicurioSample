package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProfileAttribute;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A profile contains the kerberos id AND attributes (key/value pairs.) Q:  The DB has last_logged_in in the attribute table, should it be in the profile table?
 */
@ApiModel(description = "A profile contains the kerberos id AND attributes (key/value pairs.) Q:  The DB has last_logged_in in the attribute table, should it be in the profile table?")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-02T15:30:18.322-04:00[America/New_York]")

public class ProfileAttributeAdd   {
  @JsonProperty("kerberos_id")
  private String kerberosId;

  @JsonProperty("profile_attributes")
  private ProfileAttribute profileAttributes = null;

  public ProfileAttributeAdd kerberosId(String kerberosId) {
    this.kerberosId = kerberosId;
    return this;
  }

  /**
   * Kerberos Identifier
   * @return kerberosId
  */
  @ApiModelProperty(required = true, value = "Kerberos Identifier")
  @NotNull


  public String getKerberosId() {
    return kerberosId;
  }

  public void setKerberosId(String kerberosId) {
    this.kerberosId = kerberosId;
  }

  public ProfileAttributeAdd profileAttributes(ProfileAttribute profileAttributes) {
    this.profileAttributes = profileAttributes;
    return this;
  }

  /**
   * Get profileAttributes
   * @return profileAttributes
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ProfileAttribute getProfileAttributes() {
    return profileAttributes;
  }

  public void setProfileAttributes(ProfileAttribute profileAttributes) {
    this.profileAttributes = profileAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileAttributeAdd profileAttributeAdd = (ProfileAttributeAdd) o;
    return Objects.equals(this.kerberosId, profileAttributeAdd.kerberosId) &&
        Objects.equals(this.profileAttributes, profileAttributeAdd.profileAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kerberosId, profileAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileAttributeAdd {\n");
    
    sb.append("    kerberosId: ").append(toIndentedString(kerberosId)).append("\n");
    sb.append("    profileAttributes: ").append(toIndentedString(profileAttributes)).append("\n");
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

