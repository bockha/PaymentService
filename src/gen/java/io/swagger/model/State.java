/*
 * IUNO TDM Payment Service API
 * Create invoices, check payment and forward coins.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * invoice confidence state
 */
@ApiModel(description = "invoice confidence state")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-21T07:03:03.830Z")
public class State   {
  /**
   * confidence state
   */
  public enum StateEnum {
    BUILDING("building"),
    
    PENDING("pending"),
    
    DEAD("dead"),
    
    UNKNOWN("unknown"),
    
    CONFLICT("conflict");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = StateEnum.UNKNOWN;

  @JsonProperty("depthInBlocks")
  private Integer depthInBlocks = null;

  public State state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * confidence state
   * @return state
  **/
  @JsonProperty("state")
  @ApiModelProperty(value = "confidence state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public State depthInBlocks(Integer depthInBlocks) {
    this.depthInBlocks = depthInBlocks;
    return this;
  }

   /**
   * depth of a building transaction in blocks
   * @return depthInBlocks
  **/
  @JsonProperty("depthInBlocks")
  @ApiModelProperty(value = "depth of a building transaction in blocks")
  public Integer getDepthInBlocks() {
    return depthInBlocks;
  }

  public void setDepthInBlocks(Integer depthInBlocks) {
    this.depthInBlocks = depthInBlocks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.state, state.state) &&
        Objects.equals(this.depthInBlocks, state.depthInBlocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, depthInBlocks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    depthInBlocks: ").append(toIndentedString(depthInBlocks)).append("\n");
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

