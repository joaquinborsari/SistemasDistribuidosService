package com.example.readservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
public class HistoricalSearchInputModel {
    private Timestamp fechaInicioBusqueda;
    private Timestamp fechaFinBusqueda;
}
