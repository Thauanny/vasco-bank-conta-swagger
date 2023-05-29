package io.swagger.api;

import io.swagger.model.Cheque;
import io.swagger.model.Cheques;
import io.swagger.model.ContaCorrente;
import io.swagger.model.ContaCorrenteCriar;
import io.swagger.model.Extrato;
import io.swagger.model.Saldo;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-29T18:04:14.979160323Z[GMT]")
@RestController
public class ContaCorrenteApiController implements ContaCorrenteApi {

    private static final Logger log = LoggerFactory.getLogger(ContaCorrenteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    public ContaCorrenteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Saldo> chequejuros(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idCheque") Long idCheque,@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Saldo>(objectMapper.readValue("{\n  \"valor\" : 99.999\n}", Saldo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Saldo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Saldo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cheque> chequepust(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idCheque") Long idCheque,@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Cheque body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cheque>(objectMapper.readValue("{\n  \"dataAtual\" : \"2023-06-06\",\n  \"numero\" : \"123123\",\n  \"dataEntrada\" : \"2023-06-06\",\n  \"juros\" : 1000,\n  \"valor\" : 1000,\n  \"serie\" : \"123123\",\n  \"nome\" : \"john\",\n  \"id\" : 10,\n  \"limite\" : 1000,\n  \"valorExtenso\" : \"mil reais\"\n}", Cheque.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cheque>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cheque>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Saldo> chequeput(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idCheque") Long idCheque,@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Saldo body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Saldo>(objectMapper.readValue("{\n  \"valor\" : 99.999\n}", Saldo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Saldo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Saldo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cheque> getCheque(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta,@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idCheque") Long idCheque) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cheque>(objectMapper.readValue("{\n  \"dataAtual\" : \"2023-06-06\",\n  \"numero\" : \"123123\",\n  \"dataEntrada\" : \"2023-06-06\",\n  \"juros\" : 1000,\n  \"valor\" : 1000,\n  \"serie\" : \"123123\",\n  \"nome\" : \"john\",\n  \"id\" : 10,\n  \"limite\" : 1000,\n  \"valorExtenso\" : \"mil reais\"\n}", Cheque.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cheque>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cheque>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Saldo> getChequeLimite(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idCheque") Long idCheque,@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Saldo>(objectMapper.readValue("{\n  \"valor\" : 99.999\n}", Saldo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Saldo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Saldo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cheques> getCheques(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cheques>(objectMapper.readValue("{\n  \"cheques\" : [ {\n    \"dataAtual\" : \"2023-06-06\",\n    \"numero\" : \"123123\",\n    \"dataEntrada\" : \"2023-06-06\",\n    \"juros\" : 1000,\n    \"valor\" : 1000,\n    \"serie\" : \"123123\",\n    \"nome\" : \"john\",\n    \"id\" : 10,\n    \"limite\" : 1000,\n    \"valorExtenso\" : \"mil reais\"\n  }, {\n    \"dataAtual\" : \"2023-06-06\",\n    \"numero\" : \"123123\",\n    \"dataEntrada\" : \"2023-06-06\",\n    \"juros\" : 1000,\n    \"valor\" : 1000,\n    \"serie\" : \"123123\",\n    \"nome\" : \"john\",\n    \"id\" : 10,\n    \"limite\" : 1000,\n    \"valorExtenso\" : \"mil reais\"\n  } ]\n}", Cheques.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cheques>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cheques>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContaCorrente> getContaCorrentById(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idUser") Long idUser) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContaCorrente>(objectMapper.readValue("{\n  \"primeiroNome\" : \"John\",\n  \"elegivelCredito\" : false,\n  \"numero\" : \"23232\",\n  \"profissao\" : \"Desenvolvedor\",\n  \"nome\" : \"John pascal\",\n  \"saldo\" : 0,\n  \"agencia\" : \"1232\",\n  \"numeroComDigito\" : \"23232-3\",\n  \"cpf\" : \"999.999.999-99\",\n  \"cheque\" : [ {\n    \"dataAtual\" : \"2023-06-06\",\n    \"numero\" : \"123123\",\n    \"dataEntrada\" : \"2023-06-06\",\n    \"juros\" : 1000,\n    \"valor\" : 1000,\n    \"serie\" : \"123123\",\n    \"nome\" : \"john\",\n    \"id\" : 10,\n    \"limite\" : 1000,\n    \"valorExtenso\" : \"mil reais\"\n  }, {\n    \"dataAtual\" : \"2023-06-06\",\n    \"numero\" : \"123123\",\n    \"dataEntrada\" : \"2023-06-06\",\n    \"juros\" : 1000,\n    \"valor\" : 1000,\n    \"serie\" : \"123123\",\n    \"nome\" : \"john\",\n    \"id\" : 10,\n    \"limite\" : 1000,\n    \"valorExtenso\" : \"mil reais\"\n  } ],\n  \"id\" : 10,\n  \"dataNascimento\" : \"2023-06-06\",\n  \"digito\" : \"3\"\n}", ContaCorrente.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContaCorrente>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContaCorrente>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Extrato> getOrderById(@Parameter(in = ParameterIn.PATH, description = "ID of order that needs to be fetched", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Extrato>(objectMapper.readValue("{\n  \"operacao\" : \"PIX\",\n  \"id\" : 10,\n  \"dataOperacao\" : \"2023-06-06\"\n}", Extrato.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Extrato>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Extrato>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Saldo> getSaldo(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Saldo>(objectMapper.readValue("{\n  \"valor\" : 99.999\n}", Saldo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Saldo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Saldo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContaCorrente> postCheque(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Cheque body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContaCorrente>(objectMapper.readValue("{\n  \"primeiroNome\" : \"John\",\n  \"elegivelCredito\" : false,\n  \"numero\" : \"23232\",\n  \"profissao\" : \"Desenvolvedor\",\n  \"nome\" : \"John pascal\",\n  \"saldo\" : 0,\n  \"agencia\" : \"1232\",\n  \"numeroComDigito\" : \"23232-3\",\n  \"cpf\" : \"999.999.999-99\",\n  \"cheque\" : [ {\n    \"dataAtual\" : \"2023-06-06\",\n    \"numero\" : \"123123\",\n    \"dataEntrada\" : \"2023-06-06\",\n    \"juros\" : 1000,\n    \"valor\" : 1000,\n    \"serie\" : \"123123\",\n    \"nome\" : \"john\",\n    \"id\" : 10,\n    \"limite\" : 1000,\n    \"valorExtenso\" : \"mil reais\"\n  }, {\n    \"dataAtual\" : \"2023-06-06\",\n    \"numero\" : \"123123\",\n    \"dataEntrada\" : \"2023-06-06\",\n    \"juros\" : 1000,\n    \"valor\" : 1000,\n    \"serie\" : \"123123\",\n    \"nome\" : \"john\",\n    \"id\" : 10,\n    \"limite\" : 1000,\n    \"valorExtenso\" : \"mil reais\"\n  } ],\n  \"id\" : 10,\n  \"dataNascimento\" : \"2023-06-06\",\n  \"digito\" : \"3\"\n}", ContaCorrente.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContaCorrente>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContaCorrente>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContaCorrenteCriar> postContaCorrente(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idUser") Long idUser,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ContaCorrenteCriar body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContaCorrenteCriar>(objectMapper.readValue("{\n  \"primeiroNome\" : \"John\",\n  \"elegivelCredito\" : false,\n  \"numero\" : \"23232\",\n  \"profissao\" : \"Desenvolvedor\",\n  \"nome\" : \"John pascal\",\n  \"saldo\" : 0,\n  \"agencia\" : \"1232\",\n  \"numeroComDigito\" : \"23232-3\",\n  \"cpf\" : \"999.999.999-99\",\n  \"cheque\" : [ {\n    \"dataAtual\" : \"2023-06-06\",\n    \"numero\" : \"123123\",\n    \"dataEntrada\" : \"2023-06-06\",\n    \"juros\" : 1000,\n    \"valor\" : 1000,\n    \"serie\" : \"123123\",\n    \"nome\" : \"john\",\n    \"id\" : 10,\n    \"limite\" : 1000,\n    \"valorExtenso\" : \"mil reais\"\n  }, {\n    \"dataAtual\" : \"2023-06-06\",\n    \"numero\" : \"123123\",\n    \"dataEntrada\" : \"2023-06-06\",\n    \"juros\" : 1000,\n    \"valor\" : 1000,\n    \"serie\" : \"123123\",\n    \"nome\" : \"john\",\n    \"id\" : 10,\n    \"limite\" : 1000,\n    \"valorExtenso\" : \"mil reais\"\n  } ],\n  \"id\" : 10,\n  \"dataNascimento\" : \"2023-06-06\",\n  \"digito\" : \"3\"\n}", ContaCorrenteCriar.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContaCorrenteCriar>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContaCorrenteCriar>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Saldo> putSaldosaldo(@Parameter(in = ParameterIn.PATH, description = "ID do usuario", required=true, schema=@Schema()) @PathVariable("idConta") Long idConta,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Saldo body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Saldo>(objectMapper.readValue("{\n  \"valor\" : 99.999\n}", Saldo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Saldo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Saldo>(HttpStatus.NOT_IMPLEMENTED);
    }

}
