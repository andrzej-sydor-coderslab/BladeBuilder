package com.example.bladebuilder.controller;

import com.example.bladebuilder.model.entity.Measurement;
import com.example.bladebuilder.model.reguest.MeasurementRequestDTO;
import com.example.bladebuilder.model.response.MeasurementWithCalculationsDTO;
import com.example.bladebuilder.service.MeasurementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/measurement")
@RequiredArgsConstructor
public class MeasurementController {

    private final MeasurementService measurementService;

    @PostMapping("")
    @ResponseBody
    public MeasurementWithCalculationsDTO count(@RequestBody MeasurementRequestDTO measurementRequestDTO){
       return measurementService.count(measurementRequestDTO);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Measurement> all(){
        return measurementService.findAll();
    }

}