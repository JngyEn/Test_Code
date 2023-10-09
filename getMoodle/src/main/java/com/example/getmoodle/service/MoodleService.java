package com.example.getmoodle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MoodleService {
    @Value("${moodle.Api.Url}")
    private String moodleApiUrl;

    @Autowired
    public RestTemplate restTemplate;

    public String getCourseSchedule(String token)
    {
        String url = moodleApiUrl + "?wstoken=" + token + "&wsfunction=core_course_get_courses&moodlewsrestformat=json";
        String response = restTemplate.getForObject(url,String.class);
        return response;
    }

}
