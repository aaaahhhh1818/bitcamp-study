package org.zerock.note;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Command {

    private String oper; //oper값이 추가인지 확인인지 삭제인지 체크

    private NoteDTO noteDTO;

}
