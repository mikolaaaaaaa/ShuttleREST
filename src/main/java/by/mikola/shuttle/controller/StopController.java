package by.mikola.shuttle.controller;

import by.mikola.shuttle.entity.Stop;
import by.mikola.shuttle.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/stops")
public class StopController {

  @Autowired private StopService stopService;

  @GetMapping
  public List<Stop> getAllStops() {
        return stopService.getAllStops();
    }

    @GetMapping("/{id}")
    public Stop getStopById(@PathVariable Long id) {
        return stopService.getStopById(id);
    }

    @PostMapping
    public void addStop(@RequestBody Stop stop) {
        stopService.saveStop(stop);
    }

    @DeleteMapping("/{id}")
    public void deleteStop(@PathVariable Long id) {
        stopService.deleteStop(id);
    }
}
