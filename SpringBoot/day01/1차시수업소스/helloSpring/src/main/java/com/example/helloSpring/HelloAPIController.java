package com.example.helloSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HelloAPIController {

    @GetMapping("/helloNameData")
    @ResponseBody
    public List<String> helloPrintName() {

        List<String> list  = new ArrayList<>();

        list.add("김건희: 오늘도 웃는 하루 보내세요 😊");
        list.add("김태준: 작은 노력도 큰 결과를 만듭니다 💪");
        list.add("고지연: 좋은 일만 가득한 하루 되세요 🌷");
        list.add("이현겸: 오늘의 주인공은 바로 당신입니다 ⭐");
        list.add("김민정: 포기하지 않으면 반드시 성장합니다 🚀");
        list.add("황스일: 행복은 가까운 곳에 있어요 🍀");
        list.add("여도현: 오늘도 자신감을 가지고 도전해요 🔥");
        list.add("장해든: 밝은 미소로 하루를 시작해요 😄");
        list.add("나해수: 당신의 가능성은 무한합니다 🌈");
        list.add("손영석: 오늘도 최선을 다하는 멋진 하루! 👍");
        list.add("송주창: 좋은 기회가 찾아오는 날이 되길 🎁");
        list.add("김민경: 하루 한 걸음씩 꿈에 가까워져요 🌟");
        list.add("박세인: 소중한 오늘을 마음껏 즐기세요 ☕");
        list.add("조아진: 당신의 노력이 빛을 발할 거예요 ✨");
        list.add("김재민: 긍정적인 마음이 행운을 부릅니다 🍀");
        list.add("정철진: 새로운 도전을 응원합니다 🚴");
        list.add("엄진희: 오늘도 멋진 일들이 기다리고 있어요 🎈");
        list.add("이정하: 스스로를 믿고 나아가세요 🌻");
        list.add("장윤성: 행복한 순간들을 많이 만드세요 🎵");




        return list;   // 자동으로 JSON 변환됨
    }

    //
}
