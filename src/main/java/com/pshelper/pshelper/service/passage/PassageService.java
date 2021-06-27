package com.pshelper.pshelper.service.passage;


import com.pshelper.pshelper.dto.request.passage.PassageRequestDto;
import com.pshelper.pshelper.dto.response.passage.PassageResponseDto;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.snu.ids.ha.ma.MExpression;
import org.snu.ids.ha.ma.MorphemeAnalyzer;
import org.snu.ids.ha.ma.Sentence;
import org.springframework.stereotype.Service;

@Service
public class PassageService {


    private static MorphemeAnalyzer ma = new MorphemeAnalyzer();


    public PassageResponseDto getHighlightedPassage(PassageRequestDto passageRequestDto) {

        return PassageResponseDto
                .builder()
                .description(getSentencesWithParagraph(passageRequestDto.getDescription()))
                .input(getSentencesWithParagraph(passageRequestDto.getInput()))
                .output(getSentencesWithParagraph(passageRequestDto.getOutput()))
                .build();

    }

//    public static void main(String[] args) {
////        testKkomaFunc("test");
//        String string = "지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M*N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8*8 크기의 체스판으로 만들려고 한다. 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 하지만, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다. 보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8*8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.";
//        getSentences(string);
//    }

    public static List<String> getSentencesWithParagraph(String paragraph) {
        StringTokenizer st = new StringTokenizer(paragraph, ".?!");
        List<String> sentences = new ArrayList<>();
        while (st.hasMoreTokens()) {
            sentences.add(st.nextToken());
            System.out.println(sentences.get(sentences.size() - 1));
        }
        return sentences;
    }


    public static void testKkomaFunc(String description) {
//        String string = "지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M*N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8*8 크기의 체스판으로 만들려고 한다.\n" +
//                "\n" +
//                "체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 하지만, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.\n" +
//                "\n" +
//                "보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8*8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오..";
//        try {
//            ma.createLogger(null);
//            List<MExpression> ret = ma.analyze(description);
//            ret = ma.postProcess(ret);
//            ret = ma.leaveJustBest(ret);
//            List<Sentence> sentenceList = ma.divideToSentences(ret);
//            for( int i = 0; i < sentenceList.size(); i++ ) {
//                Sentence sentence = sentenceList.get(i);
//                System.out.println("=============================================  " + sentence.getSentence());
//                for( int j = 0; j < sentence.size(); j++ ) {
//                    System.out.println(sentence.get(j));
//                }
//            }
//            ma.closeLogger();
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }

    }

}
