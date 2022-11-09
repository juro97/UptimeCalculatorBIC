package at.fhtw.slm.uptimecalculatorbic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class DowntimeController {
    @GetMapping("/uptime/hours")
    public double calculateUpTimeHours(@RequestParam double relative) {
        double hoursOfMonth = 24*30;
        double definedUptimeInPercent = relative / 100;
        return hoursOfMonth * definedUptimeInPercent; //uptime in hours;
    }
}
