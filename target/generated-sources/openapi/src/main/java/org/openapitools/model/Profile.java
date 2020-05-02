package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ProfileAttribute;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A profile contains the kerberos id AND attributes (key/value pairs.) Q:  The DB has last_logged_in in the attribute table, should it be in the profile table?
 */
@ApiModel(description = "A profile contains the kerberos id AND attributes (key/value pairs.) Q:  The DB has last_logged_in in the attribute table, should it be in the profile table?")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-02T15:30:18.322-04:00[America/New_York]")

public class Profile   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("kerberos_id")
  private String kerberosId;

  @JsonProperty("profile_attributes")
  @Valid
  private List<ProfileAttribute> profileAttributes = new ArrayList<>();

  public Profile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * UUID key
   * @return id
  */
  @ApiModelProperty(required = true, value = "UUID key")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Profile kerberosId(String kerberosId) {
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

  public Profile profileAttributes(List<ProfileAttribute> profileAttributes) {
    this.profileAttributes = profileAttributes;
    return this;
  }

  public Profile addProfileAttributesItem(ProfileAttribute profileAttributesItem) {
    this.profileAttributes.add(profileAttributesItem);
    return this;
  }

  /**
   * Array of key-value pairs
   * @return profileAttributes
  */
  @ApiModelProperty(required = true, value = "Array of key-value pairs")
  @NotNull

  @Valid

  public List<ProfileAttribute> getProfileAttributes() {
    return profileAttributes;
  }

  public void setProfileAttributes(List<ProfileAttribute> profileAttributes) {
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
    Profile profile = (Profile) o;
    return Objects.equals(this.id, profile.id) &&
        Objects.equals(this.kerberosId, profile.kerberosId) &&
        Objects.equals(this.profileAttributes, profile.profileAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kerberosId, profileAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

