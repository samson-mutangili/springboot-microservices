package com.samson.Moviecatalogservice.resources;

import com.samson.Moviecatalogservice.models.CatalogItem;
import com.samson.Moviecatalogservice.models.Movie;
import com.samson.Moviecatalogservice.models.Rating;
import com.samson.Moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

//        List<Rating> ratings = Arrays.asList(
//            new Rating("1234", 4),
//            new Rating("5678", 3)
//        );
        //make a call to an API
        UserRating ratings =  restTemplate.getForObject("http://127.0.0.1:8083/ratingsdata/users/"+userId, UserRating.class);

        return ratings.getUserRating().stream().map(rating ->{

            Movie movie = restTemplate.getForObject("http://127.0.0.1:8082/movies/"+rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getName(), "Test", rating.getRating());

        })
         .collect(Collectors.toList());



    }
}
