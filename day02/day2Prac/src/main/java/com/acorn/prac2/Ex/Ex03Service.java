package com.acorn.prac2.Ex;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

//@Service, Repository  =>  의미한 부여한 의미적 이름이다. 다 똑같다 
@Component
public class Ex03Service {

	
	
	public List<String> getDan(int dan) {
		
		System.out.println(dan);
		List<String> list = new ArrayList<String>();
		
		
		for(int i=1; i<10; i++) {
			list.add(dan + "* " + 1 + "=" + dan*1);
		}
		
		return list;
	} 
	
	public static void main(String[] args) {
		Ex03Service service = new Ex03Service();
		List<String> result = service.getDan(3);
		System.out.println(result);
		
		
	}
}
