package dev.dxheroes.dto;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Modifier {
    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @Min(1)
    @JsonProperty("options")
    private List<String> options;
    
}