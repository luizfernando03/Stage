package com.ada.palco.Controller;


import com.ada.palco.Service.SpaceService;
import com.ada.palco.model.Space;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/spaces")
public class SpaceController {

    @Autowired
    private SpaceService spaceService;

    @GetMapping
    public List<Space> getAllSpaces() {
        return spaceService.getAllSpaces();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Space> getSpaceById(@PathVariable Long id) {
        Optional<Space> space = spaceService.getSpaceById(id);
        if (space.isPresent()) {
            return ResponseEntity.ok(space.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Space> createSpace(@RequestBody Space space) {
        Space createdSpace = spaceService.createSpace(space);
        return ResponseEntity.ok(createdSpace);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Space> updateSpace(@PathVariable Long id, @RequestBody Space spaceDetails) {
        Space updatedSpace = spaceService.updateSpace(id, spaceDetails);
        return ResponseEntity.ok(updatedSpace);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSpace(@PathVariable Long id) {
        spaceService.deleteSpace(id);
        return ResponseEntity.noContent().build();
    }
}
