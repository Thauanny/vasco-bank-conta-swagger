package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Cheques
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-29T18:04:14.979160323Z[GMT]")


public class Cheques   {
  @JsonProperty("cheques")
  @Valid
  private List<Cheque> cheques = null;

  public Cheques cheques(List<Cheque> cheques) {
    this.cheques = cheques;
    return this;
  }

  public Cheques addChequesItem(Cheque chequesItem) {
    if (this.cheques == null) {
      this.cheques = new ArrayList<Cheque>();
    }
    this.cheques.add(chequesItem);
    return this;
  }

  /**
   * Get cheques
   * @return cheques
   **/
  @Schema(description = "")
      @Valid
    public List<Cheque> getCheques() {
    return cheques;
  }

  public void setCheques(List<Cheque> cheques) {
    this.cheques = cheques;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cheques cheques = (Cheques) o;
    return Objects.equals(this.cheques, cheques.cheques);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cheques);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cheques {\n");
    
    sb.append("    cheques: ").append(toIndentedString(cheques)).append("\n");
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
