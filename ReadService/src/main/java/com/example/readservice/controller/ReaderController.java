package com.example.readservice.controller;

import com.example.readservice.model.HistoricalSearchInputModel;
import com.example.readservice.model.HistoricalSearchOutputModel;
import com.example.readservice.model.LeaksInputModel;
import com.example.readservice.model.LeaksOutputModel;
import com.example.readservice.service.RequestDataService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class ReaderController {

    private final RequestDataService outputDataService;

    @GetMapping("/getHistoricalData")
        public ResponseEntity<HistoricalSearchOutputModel> obtenerDatosHistoricos(@RequestBody HistoricalSearchInputModel requestData) {
            var response = outputDataService.requestHSData(requestData);
            if (!response.isSuccess()) {
                //log.error(String.format("Error getting data from DB"));
                //return ResponseEntity.badRequest().body("Error getting data");
            }
            //log.info(String.format("Data from DB received"));
            return ResponseEntity.ok(response);
        }

        @GetMapping("/getLeaks")
        public ResponseEntity<LeaksOutputModel> obtenerFugas(@RequestBody LeaksInputModel requestData) {
            var response = outputDataService.requestLeaksData(requestData);
            if (!response.isSuccess()) {
                //log.print("Error getting leaks from DB");
                //return ResponseEntity.badRequest().body("Error getting leaks");
            }
            //log.info(String.format("Data from DB received"));
            return ResponseEntity.ok(response);
        }
}

