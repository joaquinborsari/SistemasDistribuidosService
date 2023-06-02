package com.example.readservice.service;

import com.example.readservice.model.GetDataResponse;
import com.example.readservice.model.HistoricalSearchInputModel;
import com.example.readservice.model.LeaksInputModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RequestDataService {
    public GetDataResponse requestHSData(HistoricalSearchInputModel inputHSData) {
        if (!validateData(inputHSData.getFechaInicioBusqueda())) {
            return GetDataResponse.builder().success(false).build();
        }
        return GetDataResponse.builder().success(true).data(inputHSData.getFechaInicioBusqueda()).build();
    }

    public GetDataResponse requestLeaksData(LeaksInputModel inputLeaksData) {
        if (!validateData(inputLeaksData.getFechaInicioBusqueda())) {
            return GetDataResponse.builder().success(false).build();
        }
        return GetDataResponse.builder().success(true).data(inputLeaksData.getFechaInicioBusqueda()).build();
    }

    private boolean validateData(Timestamp inputDate) {
        LocalDateTime currentDateMinusValidStart = LocalDateTime.now().minusDays(30);
        LocalDateTime inputDateTime = inputDate.toLocalDateTime();
        return inputDateTime.isAfter(currentDateMinusValidStart);
    }
}
