package codetime.controllers;


import codetime.data.TopVideos;
import codetime.data.TopVideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BaseController {

    private TopVideosRepository repo;

    @Autowired
    public BaseController(TopVideosRepository repo){
        this.repo = repo;
    }

    @GetMapping("/")
    public RedirectView Root() {

        return new RedirectView("/index");
    }

    @GetMapping("/index")
    public ModelAndView Index() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("indexPage");
        return mv;
    }

    @GetMapping("/discover")
    public ModelAndView Discover() {
        List<TopVideos> videos = repo.findAll();
        List<String> videoName = new ArrayList<>(videos.size());
        List<String> videoLevel = new ArrayList<>(videos.size());
        List<String> videoCategory = new ArrayList<>(videos.size());
        List<String> videoDuration = new ArrayList<>(videos.size());
        List<String> videoDescription = new ArrayList<>(videos.size());
        List<String> videoCreator = new ArrayList<>(videos.size());
        List<String> videoUrl = new ArrayList<>(videos.size());

        for(TopVideos video : videos){
            videoName.add(video.getVideoName());
            videoLevel.add(video.getVideoLevel());
            videoCategory.add(video.getVideoCategory());
            videoDuration.add(video.getVideoDuration());
            videoDescription.add(video.getVideoDescription());
            videoCreator.add(video.getVideoCreator());
            videoUrl.add(video.getVideoUrl());
        }

        ModelAndView mv = new ModelAndView();

        mv.addObject("videoName", videoName);
        mv.addObject("videoLevel", videoLevel);
        mv.addObject("videoCategory", videoCategory);
        mv.addObject("videoDuration", videoDuration);
        mv.addObject("videoDescription", videoDescription);
        mv.addObject("videoCreator", videoCreator);
        mv.addObject("videoUrl", videoUrl);

        mv.setViewName("DiscoverPage");

        return mv;
    }

}
