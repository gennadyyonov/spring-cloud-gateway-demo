package lv.gennadyyonov.spring.cloud.gateway.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/log")
public class LoggingController {

    @GetMapping
    public String log() {
        log.trace("This is a TRACE level message");
        log.debug("This is a DEBUG level message");
        log.info("This is a INFO level message");
        log.warn("This is a WARN level message");
        log.error("This is a ERROR level message");
        return "See the logs for details";
    }
}
