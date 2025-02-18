package dev.dxheroes.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
    @NotNull
    @JsonProperty("code")
    private Integer code;

    @NotNull
    @JsonProperty("message")
    private String message;

    public Error(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
