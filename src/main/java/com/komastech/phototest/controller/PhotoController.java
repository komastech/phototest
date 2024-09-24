package com.komastech.phototest.controller;

import com.komastech.phototest.model.Photo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoController {

    @GetMapping
    public List<Photo> getPhotos(){
        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo(1,1,"test","localhost","image"));
        photos.add(new Photo(2,2,"test","localhost","image"));
        photos.add(new Photo(3,3,"test","localhost","image"));
        return photos;
    }

}
