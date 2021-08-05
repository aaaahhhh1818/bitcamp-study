package org.zerock.note;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

    public static void main(String[] args) {

        ArrayList<NoteDTO> list
                = new ArrayList<>();

//        NoteDTO obj = NoteDTO.builder().build();
//        list.add(obj);

        list.add(NoteDTO.builder().no(1).who("A").whom("B").build());
        list.add(NoteDTO.builder().no(2).who("A").whom("B").build());
        list.add(NoteDTO.builder().no(3).who("B").whom("A").build());
        list.add(NoteDTO.builder().no(4).who("B").whom("A").build());
        list.add(NoteDTO.builder().no(5).who("A").whom("B").build());

        System.out.println(list.size());

        System.out.println(list);

        //쭉 펴서, 필터링 -> whom이 B인 쪽지를 필터링해서 보여줌
        List<NoteDTO> blist =
        list.stream().filter(noteDTO -> noteDTO.getWhom().equals("B")).collect(Collectors.toList());

        System.out.println(blist);

        //list.remove(2); //3rd

        //특정한 쪽지의 번호(no)를 사용해서 삭제하고 싶음
        list.removeIf(noteDTO -> noteDTO.getNo() == 5);

        System.out.println(list);
        System.out.println(list.size());

    }

}
