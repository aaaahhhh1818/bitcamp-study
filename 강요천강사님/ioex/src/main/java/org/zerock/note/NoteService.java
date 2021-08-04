package org.zerock.note;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NoteService {

    private Map<String, ArrayList<NoteDTO>> noteMap = new HashMap<>(); //Map<key, value>
    private Integer idx = 0; //온 쪽지에 번호를 매겨줌

    public Integer add(NoteDTO noteDTO) {

        noteDTO.setNo(++idx); //새로운 쪽지의 번호
        String owner = noteDTO.getWhom(); //누가보냈는지 찾음

        ArrayList<NoteDTO> noteDTOS = noteMap.get(owner); //쪽지의 내용물 가져오기

        if(noteDTOS == null) {
            ArrayList<NoteDTO> noteList = new ArrayList<>();
            noteList.add(noteDTO);
            noteMap.put(owner, noteList);
        }else {
            noteDTOS.add(noteDTO);
        }

        return idx;
    }

    public ArrayList<NoteDTO> getList(String owner) { //조회

        return noteMap.get(owner);
    }

//    public static void main(String[] args) {
//
//        NoteService service = new NoteService();
//        NoteDTO noteDTO = NoteDTO.builder().who("한빛").whom("아현").content("이해가 안가").build();
//        service.add(noteDTO);
//
//        NoteDTO noteDTO2 = NoteDTO.builder().who("승환").whom("한빛").content("나도 이해가 안가").build();
//        service.add(noteDTO2);
//
//        NoteDTO noteDTO3 = NoteDTO.builder().who("한빛").whom("아현").content("끝나고 남어").build();
//        service.add(noteDTO3);
//
//        System.out.println(service.noteMap);
//
//    }

}
