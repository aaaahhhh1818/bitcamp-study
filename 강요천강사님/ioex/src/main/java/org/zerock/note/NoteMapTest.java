package org.zerock.note;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NoteMapTest {

    public static void main(String[] args) {

        Map<String, ArrayList<NoteDTO>> noteMap = new HashMap<>();

        String who = "user1";
        //쪽지 만들어주기
        NoteDTO newbie = NoteDTO.builder().who("user2").whom("user1").content("커피한잔?").build();
        //사용자에게 온 쪽지 목록
        ArrayList<NoteDTO> noteDTOS = noteMap.get(who);

        if (noteDTOS == null) { //기존에 온 쪽지가 존재하지 않을 때
            //ArrayList로 쪽지함을 만들어 새로 온 쪽지를 넣어줌
            ArrayList<NoteDTO> noteList = new ArrayList<>();
            noteList.add(newbie);
            noteMap.put(who, noteList);
        } else {
            noteDTOS.add(newbie); //쪽지가 있었으면 기존에 있는 쪽지함에 새로온 쪽지를 넣어줌
        }

    }

}
