package com.pshelper.pshelper.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class BaseResponseDto {
    private int status;
    private String message;

    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object object;

    public BaseResponseDto(String message, Object object) {
        this.message = message;
        this.object = object;
    }
}

