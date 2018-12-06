/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mx.model.CredentialResponseAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MemberResumeRequestBodyAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-06T14:59:06.449-07:00")

public class MemberResumeRequestBodyAttributes {
  @SerializedName("challenges")
  private List<CredentialResponseAttributes> challenges = null;

  public MemberResumeRequestBodyAttributes challenges(List<CredentialResponseAttributes> challenges) {
    this.challenges = challenges;
    return this;
  }

  public MemberResumeRequestBodyAttributes addChallengesItem(CredentialResponseAttributes challengesItem) {
    if (this.challenges == null) {
      this.challenges = new ArrayList<CredentialResponseAttributes>();
    }
    this.challenges.add(challengesItem);
    return this;
  }

   /**
   * Get challenges
   * @return challenges
  **/
  @ApiModelProperty(value = "")
  public List<CredentialResponseAttributes> getChallenges() {
    return challenges;
  }

  public void setChallenges(List<CredentialResponseAttributes> challenges) {
    this.challenges = challenges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberResumeRequestBodyAttributes memberResumeRequestBodyAttributes = (MemberResumeRequestBodyAttributes) o;
    return Objects.equals(this.challenges, memberResumeRequestBodyAttributes.challenges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberResumeRequestBodyAttributes {\n");
    
    sb.append("    challenges: ").append(toIndentedString(challenges)).append("\n");
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

