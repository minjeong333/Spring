package com.acon.prac4.실습_민정영석_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {

	// 1.view 요청
	@RequestMapping(value = "/movieView", method=RequestMethod.GET)
	public String movieView() {

		return "movieView";
	}

	// 2.movies 요청
	@ResponseBody
	@RequestMapping(value="/movies", method=RequestMethod.GET)
	//@GetMapping("/movies")
	public List<Movie> getMovies() {

		List<Movie> list = new ArrayList<Movie>();

		list.add(new Movie("인터스텔라", "SF", 2014));
		list.add(new Movie("기생충", "드라마", 2019));
		list.add(new Movie("범죄도시", "액션", 2022));
		list.add(new Movie("엘리멘탈", "애니메이션", 2023));

		return list;

	}
	
	// 3.movies 추가
	@ResponseBody
	@RequestMapping(value = "/movies/data", method=RequestMethod.POST)
	//@PostMapping("/movies")
	
	public String addMovies(@RequestBody Movie movie) {
		
		System.out.println(movie);
		
		return "ok";
		
	}
}
