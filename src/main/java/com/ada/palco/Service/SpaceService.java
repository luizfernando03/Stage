package com.ada.palco.Service;


import com.ada.palco.Repository.SpaceRepository;
import com.ada.palco.model.Space;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpaceService {

    @Autowired
    private SpaceRepository spaceRepository;

    public List<Space> getAllSpaces() {
        return spaceRepository.findAll();
    }

    public Optional<Space> getSpaceById(Long id) {
        return spaceRepository.findById(id);
    }

    public Space createSpace(Space space) {
        return spaceRepository.save(space);
    }

    public Space updateSpace(Long id, Space spaceDetails) {
        Space space = spaceRepository.findById(id).orElseThrow(() -> new RuntimeException("Space not found"));
        space.setDescription(spaceDetails.getDescription());
        space.setCapacity(spaceDetails.getCapacity());
        space.setAvailable(spaceDetails.isAvailable());
        return spaceRepository.save(space);
    }

    public void deleteSpace(Long id) {
        spaceRepository.deleteById(id);
    }
}
