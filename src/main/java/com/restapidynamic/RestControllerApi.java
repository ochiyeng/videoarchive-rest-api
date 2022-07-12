package com.restapidynamic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerApi {

    @Autowired

    VideoRepositoryController videoRepositoryController;

    @RequestMapping(method = RequestMethod.GET, path = "/GetVideos/{videoTopic}")
    public String GetVideos(@PathVariable String videoTopic) {
        switch (videoTopic) {
            case "Training Lessons":
                return String.format("These are our available video Training");
            case "Java Lessons ":
                return String.format("These are all available Java lessons");
            default:
                return String.format("Sorry check later for new lessons");

        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/Getall")
    public List<Videos> getAllVideos() {
        return videoRepositoryController.getAllVideos();
    }
}
