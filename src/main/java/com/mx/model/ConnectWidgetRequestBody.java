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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ConnectWidgetRequestBody
 */


public class ConnectWidgetRequestBody {
  @SerializedName("is_mobile_webview")
  private Boolean isMobileWebview = null;

  @SerializedName("current_institution_code")
  private String currentInstitutionCode = null;

  @SerializedName("current_member_guid")
  private String currentMemberGuid = null;

  @SerializedName("disable_institution_search")
  private Boolean disableInstitutionSearch = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("ui_message_version")
  private BigDecimal uiMessageVersion = null;

  @SerializedName("ui_message_webview_url_scheme")
  private String uiMessageWebviewUrlScheme = null;

  @SerializedName("update_credentials")
  private Boolean updateCredentials = null;

  public ConnectWidgetRequestBody isMobileWebview(Boolean isMobileWebview) {
    this.isMobileWebview = isMobileWebview;
    return this;
  }

   /**
   * Get isMobileWebview
   * @return isMobileWebview
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsMobileWebview() {
    return isMobileWebview;
  }

  public void setIsMobileWebview(Boolean isMobileWebview) {
    this.isMobileWebview = isMobileWebview;
  }

  public ConnectWidgetRequestBody currentInstitutionCode(String currentInstitutionCode) {
    this.currentInstitutionCode = currentInstitutionCode;
    return this;
  }

   /**
   * Get currentInstitutionCode
   * @return currentInstitutionCode
  **/
  @ApiModelProperty(example = "chase", value = "")
  public String getCurrentInstitutionCode() {
    return currentInstitutionCode;
  }

  public void setCurrentInstitutionCode(String currentInstitutionCode) {
    this.currentInstitutionCode = currentInstitutionCode;
  }

  public ConnectWidgetRequestBody currentMemberGuid(String currentMemberGuid) {
    this.currentMemberGuid = currentMemberGuid;
    return this;
  }

   /**
   * Get currentMemberGuid
   * @return currentMemberGuid
  **/
  @ApiModelProperty(example = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b", value = "")
  public String getCurrentMemberGuid() {
    return currentMemberGuid;
  }

  public void setCurrentMemberGuid(String currentMemberGuid) {
    this.currentMemberGuid = currentMemberGuid;
  }

  public ConnectWidgetRequestBody disableInstitutionSearch(Boolean disableInstitutionSearch) {
    this.disableInstitutionSearch = disableInstitutionSearch;
    return this;
  }

   /**
   * Get disableInstitutionSearch
   * @return disableInstitutionSearch
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isDisableInstitutionSearch() {
    return disableInstitutionSearch;
  }

  public void setDisableInstitutionSearch(Boolean disableInstitutionSearch) {
    this.disableInstitutionSearch = disableInstitutionSearch;
  }

  public ConnectWidgetRequestBody mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(example = "aggregation", value = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public ConnectWidgetRequestBody uiMessageVersion(BigDecimal uiMessageVersion) {
    this.uiMessageVersion = uiMessageVersion;
    return this;
  }

   /**
   * Get uiMessageVersion
   * @return uiMessageVersion
  **/
  @ApiModelProperty(example = "3.0", value = "")
  public BigDecimal getUiMessageVersion() {
    return uiMessageVersion;
  }

  public void setUiMessageVersion(BigDecimal uiMessageVersion) {
    this.uiMessageVersion = uiMessageVersion;
  }

  public ConnectWidgetRequestBody uiMessageWebviewUrlScheme(String uiMessageWebviewUrlScheme) {
    this.uiMessageWebviewUrlScheme = uiMessageWebviewUrlScheme;
    return this;
  }

   /**
   * Get uiMessageWebviewUrlScheme
   * @return uiMessageWebviewUrlScheme
  **/
  @ApiModelProperty(example = "ui_message_webview_url_scheme_example", value = "")
  public String getUiMessageWebviewUrlScheme() {
    return uiMessageWebviewUrlScheme;
  }

  public void setUiMessageWebviewUrlScheme(String uiMessageWebviewUrlScheme) {
    this.uiMessageWebviewUrlScheme = uiMessageWebviewUrlScheme;
  }

  public ConnectWidgetRequestBody updateCredentials(Boolean updateCredentials) {
    this.updateCredentials = updateCredentials;
    return this;
  }

   /**
   * Get updateCredentials
   * @return updateCredentials
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isUpdateCredentials() {
    return updateCredentials;
  }

  public void setUpdateCredentials(Boolean updateCredentials) {
    this.updateCredentials = updateCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectWidgetRequestBody connectWidgetRequestBody = (ConnectWidgetRequestBody) o;
    return Objects.equals(this.isMobileWebview, connectWidgetRequestBody.isMobileWebview) &&
        Objects.equals(this.currentInstitutionCode, connectWidgetRequestBody.currentInstitutionCode) &&
        Objects.equals(this.currentMemberGuid, connectWidgetRequestBody.currentMemberGuid) &&
        Objects.equals(this.disableInstitutionSearch, connectWidgetRequestBody.disableInstitutionSearch) &&
        Objects.equals(this.mode, connectWidgetRequestBody.mode) &&
        Objects.equals(this.uiMessageVersion, connectWidgetRequestBody.uiMessageVersion) &&
        Objects.equals(this.uiMessageWebviewUrlScheme, connectWidgetRequestBody.uiMessageWebviewUrlScheme) &&
        Objects.equals(this.updateCredentials, connectWidgetRequestBody.updateCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMobileWebview, currentInstitutionCode, currentMemberGuid, disableInstitutionSearch, mode, uiMessageVersion, uiMessageWebviewUrlScheme, updateCredentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectWidgetRequestBody {\n");
    
    sb.append("    isMobileWebview: ").append(toIndentedString(isMobileWebview)).append("\n");
    sb.append("    currentInstitutionCode: ").append(toIndentedString(currentInstitutionCode)).append("\n");
    sb.append("    currentMemberGuid: ").append(toIndentedString(currentMemberGuid)).append("\n");
    sb.append("    disableInstitutionSearch: ").append(toIndentedString(disableInstitutionSearch)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    uiMessageVersion: ").append(toIndentedString(uiMessageVersion)).append("\n");
    sb.append("    uiMessageWebviewUrlScheme: ").append(toIndentedString(uiMessageWebviewUrlScheme)).append("\n");
    sb.append("    updateCredentials: ").append(toIndentedString(updateCredentials)).append("\n");
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

