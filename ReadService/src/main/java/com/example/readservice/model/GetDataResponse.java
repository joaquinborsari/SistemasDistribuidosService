package com.example.readservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Builder
public class GetDataResponse {
    private boolean success;
    private Object data;
}
