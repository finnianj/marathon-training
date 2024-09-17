package online.finnianj.marathon_training.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Optional<Run> findById(Integer id) {
        return runs.stream()
            .filter(run -> run.id().equals(id))
            .findFirst();
    }

    void create(Run run) {
        runs.add(run);
    }

    void update(Run run, Integer id) {
        Optional<Run> existingRun = findById(id);
        if (existingRun.isPresent()) {
            runs.set(runs.indexOf(existingRun.get()), run);
        }
    }

    void delete(Integer id) {
        Optional<Run> existingRun = findById(id);
        existingRun.ifPresent(run -> runs.remove(run));
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(
            1,
            "First Run",
            LocalDateTime.now(),
            LocalDateTime.now().plusHours(1),
            3,
            Location.OUTDOOR
        ));

        runs.add(new Run(
            2,
            "Second Run",
            LocalDateTime.now().plusHours(13),
            LocalDateTime.now().plusHours(15),
            4,
            Location.OUTDOOR
        ));
    }
}
