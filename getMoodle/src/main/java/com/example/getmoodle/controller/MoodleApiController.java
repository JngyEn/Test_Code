package com.example.getmoodle.controller;

import com.example.getmoodle.service.MoodleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MoodleApiController {
    private final MoodleService moodleService;
    @Autowired
    public MoodleApiController(MoodleService moodleService)

    {
        this.moodleService = moodleService;
    }

    @GetMapping("/course/schedule")
    public String getCourseSchedule(@RequestParam("token") String token)
    {
        String courseSchedule = moodleService.getCourseSchedule(token);
        return courseSchedule;
    }


}
