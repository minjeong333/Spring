package com.acon.prac4.실습_민정영석_2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController2 {

	// 1.view 요청
	@RequestMapping(value = "/movieView2", method=RequestMethod.GET)
	public String movieView() {

		return "movieView2";
	}

	// 2.movies 요청
	
	@Autowired
	 MovieService movieservice;
	
	@ResponseBody
	@RequestMapping(value = "/movies2", method=RequestMethod.GET)
	//@GetMapping("/movies2")\
	public List<Movie> getMovies2() {
		return movieservice.getMovieList();
	}
	
	
	
	// 3.movies 추가
	@ResponseBody
	@RequestMapping(value = "/movies2/data", method=RequestMethod.POST)
	//@PostMapping("/movies2")
	
	public String addMovies2(@RequestBody Movie movie) {
		
		//1. 추가한 영화를 그냥 콘솔에만 출력할 때 
		System.out.println(movie);
		
		
		//2. 추가한 영화를 영화리스트에 다시 넣을 때
		movieservice.addMovie(movie);
		
		return "ok";
		
	}
}
