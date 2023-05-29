package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Extrato
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-29T18:04:14.979160323Z[GMT]")


public class Extrato   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("dataOperacao")
  private String dataOperacao = null;

  /**
   * Gets or Sets operacao
   */
  public enum OperacaoEnum {
    PIX("PIX"),
    
    BOLETO("BOLETO"),
    
    INTRABANCO("INTRABANCO"),
    
    PAGCARTAO("PAGCARTAO");

    private String value;

    OperacaoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperacaoEnum fromValue(String text) {
      for (OperacaoEnum b : OperacaoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("operacao")
  private OperacaoEnum operacao = null;

  public Extrato id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "10", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Extrato dataOperacao(String dataOperacao) {
    this.dataOperacao = dataOperacao;
    return this;
  }

  /**
   * Get dataOperacao
   * @return dataOperacao
   **/
  @Schema(example = "2023-06-06", description = "")
  
    public String getDataOperacao() {
    return dataOperacao;
  }

  public void setDataOperacao(String dataOperacao) {
    this.dataOperacao = dataOperacao;
  }

  public Extrato operacao(OperacaoEnum operacao) {
    this.operacao = operacao;
    return this;
  }

  /**
   * Get operacao
   * @return operacao
   **/
  @Schema(description = "")
  
    public OperacaoEnum getOperacao() {
    return operacao;
  }

  public void setOperacao(OperacaoEnum operacao) {
    this.operacao = operacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extrato extrato = (Extrato) o;
    return Objects.equals(this.id, extrato.id) &&
        Objects.equals(this.dataOperacao, extrato.dataOperacao) &&
        Objects.equals(this.operacao, extrato.operacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataOperacao, operacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extrato {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataOperacao: ").append(toIndentedString(dataOperacao)).append("\n");
    sb.append("    operacao: ").append(toIndentedString(operacao)).append("\n");
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
