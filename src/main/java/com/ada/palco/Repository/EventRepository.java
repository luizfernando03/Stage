package com.ada.palco.Repository;


import com.ada.palco.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

   // public List<Event> findEventByNameContainingIgnoreCase(@Param("name") String name);
}
