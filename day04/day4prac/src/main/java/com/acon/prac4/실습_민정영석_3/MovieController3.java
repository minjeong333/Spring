package com.acon.prac4.실습_민정영석_3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController3 {

	// 1.view 요청
	@RequestMapping(value = "/movieView3", method=RequestMethod.GET)
	public String movieView3() {

		return "movieView3";
	}

	// 2.movies 요청
	
	@Autowired
	 MovieService2 movieservice2;
	
	@ResponseBody
	@RequestMapping(value = "/movies3", method=RequestMethod.GET)
	//@GetMapping("/movies2")\
	public List<Movie> getMovies3() {
		 System.out.println("Controller3 실행");
		return movieservice2.getMovieList();
	}
	
	
	
	// 3.movies 추가
	@ResponseBody
	@RequestMapping(value = "/movies3/data", method=RequestMethod.POST)
	//@PostMapping("/movies2")
	
	public String addMovies3(@RequestBody Movie movie) {
		
		//1. 추가한 영화를 그냥 콘솔에만 출력할 때 
		System.out.println(movie);
		
		
		//2. 추가한 영화를 영화리스트에 다시 넣을 때
		movieservice2.addMovie(movie);
		
		return "ok";
		
	}
}
