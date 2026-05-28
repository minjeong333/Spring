package com.acon.prac4.실습_민정영석_3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService2 {

	//1.  조회만 할 때 사용(하드코딩)
	
//	public List<Movie> getMovieList() {
//		
//		List<Movie> list = new ArrayList<Movie>();
//
//		list.add(new Movie("존 윅 4", "액션", 2023));
//		list.add(new Movie("웡카", "판타지", 2024));
//		list.add(new Movie("듄 파트2", "SF", 2024));
//		list.add(new Movie("스즈메의 문단속", "애니메이션", 2023));
//		list.add(new Movie("서울의 봄", "역사", 2023));
//
//		return list;
//	}
	
	
	// 2. 등록한 영화까지 조회에 추가하고 싶을 때 
	
	public List<Movie> movieList = new ArrayList<Movie>();
	
	public MovieService2() {
		
		movieList.add(new Movie("존 윅 4", "액션", 2023));
		movieList.add(new Movie("웡카", "판타지", 2024));
		movieList.add(new Movie("듄 파트2", "SF", 2024));
		movieList.add(new Movie("스즈메의 문단속", "애니메이션", 2023));
		movieList.add(new Movie("서울의 봄", "역사", 2023));

	}
	
	/*
	 * //db에 있는 값으로 가져오기 
	 * //방법 1
	 * 
	public List<Movie> getMovieList(){
		
		MovieDAO dao = new MovieDAO(); 
		
	ㅁ	return dao.selectAll();
	}
	
	*/
	
	
	//방법 2 : MovieService안에 DAO를 필드로 두고 주입받기.
	@Autowired
	MovieDAO dao;
	
	public List<Movie> getMovieList(){
		
		//방법2 MovieService 안에 DAO를 필드로 두고 주입받기
		
		 System.out.println("Service2 실행");
		return dao.selectAll();
				
	}
	
	
	
	
	public void addMovie(Movie movie) {
		movieList.add(movie);
	}
	
}
