package com.ada.palco.Controller;


import com.ada.palco.Service.ReportService;
import com.ada.palco.model.Event;
import com.ada.palco.model.Space;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return reportService.getAllEvents();
    }

    @GetMapping("/spaces")
    public List<Space> getAllSpaces() {
        return reportService.getAllSpaces();
    }

    // Outros endpoints para gerar relatórios e análises
}
