package org.zerock.store;

//로직위주의 클래스
//메소드 우선 설계
//파라미터와 리턴 타입으로 데이터 위주의 클래스 타입을 활용
//생성자의 의미 - ready
//멤버 변수 - 누적/상태/조력자
//고객이 원하는 기능을 가지는 비지니스 로직을 가지고 있다.

import javax.swing.plaf.synth.SynthToolBarUI;
import java.util.Arrays;
import java.util.Optional;

public class StoreService {

    private StoreDTO[] storeDTOS;

    public StoreService() {

    }

    public StoreService(StoreDTO[] storeDTOS) {
        this.storeDTOS = storeDTOS;
    }

    public StoreDTO findByMenuName(String menuName) {

        Optional<StoreDTO> result =
                Arrays.stream(this.storeDTOS).filter(storeDTO -> storeDTO.getMenu().indexOf(menuName) >= 0).findFirst();

        if(result.isPresent()) {
            return result.get();
        }else {
            return null;
        }
    }

}
