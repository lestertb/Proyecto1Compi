package BackJava.BackJava.Routes;

import java.util.concurrent.atomic.AtomicLong;

import BackJava.BackJava.Classes.test;
import org.springframework.web.bind.annotation.*;

@RestController
public class testRoute {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/test")
    public test greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new test(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/agregar")
    void agregar (@RequestBody String test){
        System.out.println(test);
    }
}
