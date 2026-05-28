package com.acon.prac4.실습_민정영석_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class MovieDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbCon() {

		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
	
	public List<Movie> selectAll(){

		Connection con = dbCon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String sql = "select title, genre, year from movie";

		List<Movie> movieList = new ArrayList<Movie>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while(rs.next()) {
				Movie movie = new Movie();

				movie.setTitle(rs.getString("title"));
				movie.setGenre(rs.getString("genre"));
				movie.setYear(rs.getInt("year"));

				movieList.add(movie);

				System.out.println(movie);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pst != null) pst.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return movieList;
	}


	public static void main(String[] args) {
		
		MovieDAO dao = new MovieDAO();
		Connection con = dao.dbCon();
		System.out.println(con);
		
		if(con != null) System.out.println("db연결 성공");
	
	}
}
