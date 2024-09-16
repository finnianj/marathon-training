package online.finnianj.marathon_training.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Run findById(Integer id) {
        return runs.stream()
            .filter(run -> run.id().equals(id))
            .findFirst()
            .get();
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
