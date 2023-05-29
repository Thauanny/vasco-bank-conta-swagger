package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ContaCorrente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-29T18:04:14.979160323Z[GMT]")


public class ContaCorrente   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("primeiroNome")
  private String primeiroNome = null;

  @JsonProperty("agencia")
  private String agencia = null;

  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("digito")
  private String digito = null;

  @JsonProperty("numeroComDigito")
  private String numeroComDigito = null;

  @JsonProperty("dataNascimento")
  private String dataNascimento = null;

  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("profissao")
  private String profissao = null;

  @JsonProperty("elegivelCredito")
  private Boolean elegivelCredito = null;

  @JsonProperty("saldo")
  private BigDecimal saldo = null;

  @JsonProperty("cheque")
  @Valid
  private List<Cheque> cheque = null;

  public ContaCorrente id(Long id) {
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

  public ContaCorrente nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   **/
  @Schema(example = "John pascal", description = "")
  
    public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ContaCorrente primeiroNome(String primeiroNome) {
    this.primeiroNome = primeiroNome;
    return this;
  }

  /**
   * Get primeiroNome
   * @return primeiroNome
   **/
  @Schema(example = "John", description = "")
  
    public String getPrimeiroNome() {
    return primeiroNome;
  }

  public void setPrimeiroNome(String primeiroNome) {
    this.primeiroNome = primeiroNome;
  }

  public ContaCorrente agencia(String agencia) {
    this.agencia = agencia;
    return this;
  }

  /**
   * Get agencia
   * @return agencia
   **/
  @Schema(example = "1232", description = "")
  
    public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public ContaCorrente numero(String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
   **/
  @Schema(example = "23232", description = "")
  
    public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ContaCorrente digito(String digito) {
    this.digito = digito;
    return this;
  }

  /**
   * Get digito
   * @return digito
   **/
  @Schema(example = "3", description = "")
  
    public String getDigito() {
    return digito;
  }

  public void setDigito(String digito) {
    this.digito = digito;
  }

  public ContaCorrente numeroComDigito(String numeroComDigito) {
    this.numeroComDigito = numeroComDigito;
    return this;
  }

  /**
   * Get numeroComDigito
   * @return numeroComDigito
   **/
  @Schema(example = "23232-3", description = "")
  
    public String getNumeroComDigito() {
    return numeroComDigito;
  }

  public void setNumeroComDigito(String numeroComDigito) {
    this.numeroComDigito = numeroComDigito;
  }

  public ContaCorrente dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Get dataNascimento
   * @return dataNascimento
   **/
  @Schema(example = "2023-06-06", description = "")
  
    public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public ContaCorrente cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Get cpf
   * @return cpf
   **/
  @Schema(example = "999.999.999-99", description = "")
  
    public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public ContaCorrente profissao(String profissao) {
    this.profissao = profissao;
    return this;
  }

  /**
   * Get profissao
   * @return profissao
   **/
  @Schema(example = "Desenvolvedor", description = "")
  
    public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public ContaCorrente elegivelCredito(Boolean elegivelCredito) {
    this.elegivelCredito = elegivelCredito;
    return this;
  }

  /**
   * Get elegivelCredito
   * @return elegivelCredito
   **/
  @Schema(example = "false", description = "")
  
    public Boolean isElegivelCredito() {
    return elegivelCredito;
  }

  public void setElegivelCredito(Boolean elegivelCredito) {
    this.elegivelCredito = elegivelCredito;
  }

  public ContaCorrente saldo(BigDecimal saldo) {
    this.saldo = saldo;
    return this;
  }

  /**
   * Get saldo
   * @return saldo
   **/
  @Schema(example = "0", description = "")
  
    @Valid
    public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  public ContaCorrente cheque(List<Cheque> cheque) {
    this.cheque = cheque;
    return this;
  }

  public ContaCorrente addChequeItem(Cheque chequeItem) {
    if (this.cheque == null) {
      this.cheque = new ArrayList<Cheque>();
    }
    this.cheque.add(chequeItem);
    return this;
  }

  /**
   * Get cheque
   * @return cheque
   **/
  @Schema(description = "")
      @Valid
    public List<Cheque> getCheque() {
    return cheque;
  }

  public void setCheque(List<Cheque> cheque) {
    this.cheque = cheque;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaCorrente contaCorrente = (ContaCorrente) o;
    return Objects.equals(this.id, contaCorrente.id) &&
        Objects.equals(this.nome, contaCorrente.nome) &&
        Objects.equals(this.primeiroNome, contaCorrente.primeiroNome) &&
        Objects.equals(this.agencia, contaCorrente.agencia) &&
        Objects.equals(this.numero, contaCorrente.numero) &&
        Objects.equals(this.digito, contaCorrente.digito) &&
        Objects.equals(this.numeroComDigito, contaCorrente.numeroComDigito) &&
        Objects.equals(this.dataNascimento, contaCorrente.dataNascimento) &&
        Objects.equals(this.cpf, contaCorrente.cpf) &&
        Objects.equals(this.profissao, contaCorrente.profissao) &&
        Objects.equals(this.elegivelCredito, contaCorrente.elegivelCredito) &&
        Objects.equals(this.saldo, contaCorrente.saldo) &&
        Objects.equals(this.cheque, contaCorrente.cheque);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, primeiroNome, agencia, numero, digito, numeroComDigito, dataNascimento, cpf, profissao, elegivelCredito, saldo, cheque);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaCorrente {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    primeiroNome: ").append(toIndentedString(primeiroNome)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    digito: ").append(toIndentedString(digito)).append("\n");
    sb.append("    numeroComDigito: ").append(toIndentedString(numeroComDigito)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    profissao: ").append(toIndentedString(profissao)).append("\n");
    sb.append("    elegivelCredito: ").append(toIndentedString(elegivelCredito)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
    sb.append("    cheque: ").append(toIndentedString(cheque)).append("\n");
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
