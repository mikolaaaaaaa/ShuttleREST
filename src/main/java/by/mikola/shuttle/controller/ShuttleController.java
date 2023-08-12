package by.mikola.shuttle.controller;

import by.mikola.shuttle.entity.Shuttle;
import by.mikola.shuttle.service.ShuttleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/shuttles")
@RequiredArgsConstructor
public class ShuttleController {

    private final ShuttleService shuttleService;

    @GetMapping
    public List<Shuttle> getAllShuttles() {
        return shuttleService.getAllShuttles();
    }

    @GetMapping("/{id}")
    public Shuttle getShuttleById(@PathVariable Long id) {
        return shuttleService.getShuttleById(id);
    }

    @PostMapping
    public void addShuttle(@RequestBody Shuttle shuttle) {
        shuttleService.saveShuttle(shuttle);
    }

    @DeleteMapping("/{id}")
    public void deleteShuttle(@PathVariable Long id) {
        shuttleService.deleteShuttle(id);
    }
}
