package controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chenjian
 * @date 2019/5/28 9:20
 * @Description
 */
@Controller
@Transactional
public class scheduledController {

    @Scheduled(fixedDelay = 5000)
    public String printString(){
        System.err.println("hello world");
        System.err.println("hello world");
        System.err.println("hello worssld");
        return "wwww";
    }
}
