<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>movieView3</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
	function getData() {

		$.ajax({
			type : "GET",
			url : "/prac4/movies3",
			success : function(data) {
				console.log(data);
				renderData(data);
			},
			error : function(err) {
				console.log(err);
			}
		});
	}

	function renderData(response) {
		const result = document.getElementById("result");
		let str = "<ul>";
		
		response.forEach( movie =>  {

			str += "<li>" + movie.title 
			+ " / " + movie.genre + " / "
			+ movie.year + "</li>";

		});

		str += "</ul>";

		result.innerHTML = str;

	}
	
	
function regData(){
	
	//alert("addMovies() 성공");
	const title = document.getElementById("title").value;
	const genre = document.getElementById("genre").value;
	const year = document.getElementById("year").value;
	
	const movie={
		title : title,
		genre : genre,
		year : year
	};
	
	console.log(movie);
	
	//객체 -> 문자열로 바꾸기 (json)
	let sendData = JSON.stringify( movie);
	console.log(sendData);
	
	
	 $.ajax({
		type:"post",
		url:"/prac4/movies3/data",
		data:sendData,
		contentType:"application/json",
		success: function(data){
			console.log(data);
			alert("영화 추가 성공");
			getMovies();
		},
		error: function( err){
			console.log( err);
		}
		
	}); 
}

</script>

</head>
<body>

	<h1>[ 영화 추천 사이트 ]</h1>
	

	<h2>1. 영화 가져오기</h2>
	<div id="result"></div>
	<button onclick="getData()">영화정보</button>
	
	<h2>2. 영화 추가하기</h2>
	
	제목 : <input type="text" id="title" placeholder="추가할 영화제목을 입력하세요  " >
	장르 : <input type="text" id="genre" placeholder="추가할 영화의 장르를 입력하세요  ">
	개봉일 : <input type="text" id="year" placeholder="추가할 영화의 개봉일 입력하세요  ">
	<button onclick="regData()">영화추가</button>

</body>
</html>