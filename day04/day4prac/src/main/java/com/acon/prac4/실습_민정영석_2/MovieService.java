package com.acon.prac4.실습_민정영석_2;

import java.util.ArrayList;
import java.util.List;

//xml에 bean을 수동으로 등록했기 때문에 애너테이션 안써도 됨 
public class MovieService {

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
	
	public MovieService() {
		
		movieList.add(new Movie("존 윅 4", "액션", 2023));
		movieList.add(new Movie("웡카", "판타지", 2024));
		movieList.add(new Movie("듄 파트2", "SF", 2024));
		movieList.add(new Movie("스즈메의 문단속", "애니메이션", 2023));
		movieList.add(new Movie("서울의 봄", "역사", 2023));

	}
	
	public List<Movie> getMovieList(){
		return movieList;
	}
	
	public void addMovie(Movie movie) {
		movieList.add(movie);
	}
	
}
