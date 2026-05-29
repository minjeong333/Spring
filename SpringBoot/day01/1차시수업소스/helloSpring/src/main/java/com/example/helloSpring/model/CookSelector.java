package com.example.helloSpring.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CookSelector {

    // 오늘의 요리사 반환 메서드
    public   Cook getTodayCook() {
        ArrayList<Cook> list = new ArrayList<Cook>();

        // Cook을 상속받았으므로 각 각의 요리사 클래스를 담을 수 있다
        list.add ( new  CAJCook("조아진"));
        list.add ( new  LHKCook("이현겸"));
        list.add ( new  DHYCook("여도현"));
        list.add ( new  JCJCook("정철진"));
        list.add ( new  EJHCook2("엄진희"));
        list.add ( new  JHDCook("장해든"));
        list.add ( new  HSICook("황스일"));
        list.add ( new  JYSCook("장윤성"));
        list.add ( new  KJYCook("고지연"));
        list.add ( new  KMJCook("김민정"));
        list.add ( new  KMKCook("김민경"));
        list.add ( new  NHSCook("나해수"));
        list.add ( new  PSICook("박세인"));
        list.add ( new  SJCCook("송주창"));
        list.add ( new  SYSCook("손영석"));
        list.add ( new  KKHCook4("김건희"));
        list.add ( new  LJHCook("이정하"));
        list.add ( new  LHKCook("김재민"));
        list.add ( new  KTJCOOK("김태준"));
        //김현희

        // 요리사별 ArrayList 준비
        List<한식가능한> 한식요리사 = new ArrayList<>();
        List<중식가능한> 중식요리사 = new ArrayList<>();
        List<일식가능한> 일식요리사 = new ArrayList<>();

        // 요리사 종류별로 분류
        for (Cook cook : list) {
            if (cook instanceof 한식가능한) {
                한식요리사.add((한식가능한) cook);
            } else if (cook instanceof 중식가능한) {
                중식요리사.add((중식가능한) cook);
            } else if (cook instanceof 일식가능한) {
                일식요리사.add((일식가능한) cook);
            }
        }

        // 랜덤하게 요리사 종류 선택
        String[] kinds = { "한식가능한", "중식가능한", "일식가능한" };
        int randomKindIndex = (int) (Math.random() * kinds.length);
        String selectedKind = kinds[randomKindIndex];

        List<?> selectedList;
        switch (selectedKind) {
            case "한식가능한":
                selectedList = 한식요리사;
                break;
            case "중식가능한":
                selectedList = 중식요리사;
                break;
            case "일식가능한":
                selectedList = 일식요리사;
                break;
            default:
                selectedList = 한식요리사; // 기본값
        }

        // 랜덤하게 요리사 한 명 선택
        int randomIndex = (int) (Math.random() * selectedList.size());
        return (Cook) selectedList.get(randomIndex);
    }

    // 테스트용 main
    public static void main(String[] args) {
        Cook todayCook =   new CookSelector().getTodayCook();
        System.out.println("==== 오늘의 요리사 ====");
        System.out.println(todayCook);
    }
}
