package com.ada.palco.Service;


import com.ada.palco.Repository.EventRepository;
import com.ada.palco.Repository.SpaceRepository;
import com.ada.palco.model.Event;
import com.ada.palco.model.Space;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private SpaceRepository spaceRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public List<Space> getAllSpaces() {
        return spaceRepository.findAll();
    }

    // Outros métodos para gerar relatórios e análises
}
