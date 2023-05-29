package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Cheque
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-29T18:04:14.979160323Z[GMT]")


public class Cheque   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("valor")
  private BigDecimal valor = null;

  @JsonProperty("limite")
  private BigDecimal limite = null;

  @JsonProperty("juros")
  private BigDecimal juros = null;

  @JsonProperty("valorExtenso")
  private String valorExtenso = null;

  @JsonProperty("dataAtual")
  private String dataAtual = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("serie")
  private String serie = null;

  @JsonProperty("dataEntrada")
  private String dataEntrada = null;

  public Cheque id(Long id) {
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

  public Cheque valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
   **/
  @Schema(example = "1000", description = "")
  
    @Valid
    public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public Cheque limite(BigDecimal limite) {
    this.limite = limite;
    return this;
  }

  /**
   * Get limite
   * @return limite
   **/
  @Schema(example = "1000", description = "")
  
    @Valid
    public BigDecimal getLimite() {
    return limite;
  }

  public void setLimite(BigDecimal limite) {
    this.limite = limite;
  }

  public Cheque juros(BigDecimal juros) {
    this.juros = juros;
    return this;
  }

  /**
   * Get juros
   * @return juros
   **/
  @Schema(example = "1000", description = "")
  
    @Valid
    public BigDecimal getJuros() {
    return juros;
  }

  public void setJuros(BigDecimal juros) {
    this.juros = juros;
  }

  public Cheque valorExtenso(String valorExtenso) {
    this.valorExtenso = valorExtenso;
    return this;
  }

  /**
   * Get valorExtenso
   * @return valorExtenso
   **/
  @Schema(example = "mil reais", description = "")
  
    public String getValorExtenso() {
    return valorExtenso;
  }

  public void setValorExtenso(String valorExtenso) {
    this.valorExtenso = valorExtenso;
  }

  public Cheque dataAtual(String dataAtual) {
    this.dataAtual = dataAtual;
    return this;
  }

  /**
   * Get dataAtual
   * @return dataAtual
   **/
  @Schema(example = "2023-06-06", description = "")
  
    public String getDataAtual() {
    return dataAtual;
  }

  public void setDataAtual(String dataAtual) {
    this.dataAtual = dataAtual;
  }

  public Cheque nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   **/
  @Schema(example = "john", description = "")
  
    public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Cheque numero(String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
   **/
  @Schema(example = "123123", description = "")
  
    public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public Cheque serie(String serie) {
    this.serie = serie;
    return this;
  }

  /**
   * Get serie
   * @return serie
   **/
  @Schema(example = "123123", description = "")
  
    public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public Cheque dataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
    return this;
  }

  /**
   * Get dataEntrada
   * @return dataEntrada
   **/
  @Schema(example = "2023-06-06", description = "")
  
    public String getDataEntrada() {
    return dataEntrada;
  }

  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cheque cheque = (Cheque) o;
    return Objects.equals(this.id, cheque.id) &&
        Objects.equals(this.valor, cheque.valor) &&
        Objects.equals(this.limite, cheque.limite) &&
        Objects.equals(this.juros, cheque.juros) &&
        Objects.equals(this.valorExtenso, cheque.valorExtenso) &&
        Objects.equals(this.dataAtual, cheque.dataAtual) &&
        Objects.equals(this.nome, cheque.nome) &&
        Objects.equals(this.numero, cheque.numero) &&
        Objects.equals(this.serie, cheque.serie) &&
        Objects.equals(this.dataEntrada, cheque.dataEntrada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, valor, limite, juros, valorExtenso, dataAtual, nome, numero, serie, dataEntrada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cheque {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    limite: ").append(toIndentedString(limite)).append("\n");
    sb.append("    juros: ").append(toIndentedString(juros)).append("\n");
    sb.append("    valorExtenso: ").append(toIndentedString(valorExtenso)).append("\n");
    sb.append("    dataAtual: ").append(toIndentedString(dataAtual)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    dataEntrada: ").append(toIndentedString(dataEntrada)).append("\n");
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
