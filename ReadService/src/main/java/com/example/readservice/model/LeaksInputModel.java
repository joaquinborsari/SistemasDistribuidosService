package com.example.readservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
//De momento son el mismo model Leaks e HistoricalSearch (en caso de seguir asi dejamos solo uno,
// podriamos agregar algun diferencial si es necesario).
public class LeaksInputModel {
        private Timestamp fechaInicioBusqueda;
        private Timestamp fechaFinBusqueda;
    }

